var exe = 0;
var count = 0;
var xs = 0;
$(document).ready(() => {
	const resultDisplay = $('#resultDisplay');
	const historyDisplay = $('#showHistory');


	$('button[data-value]').on('click', function() {

		var clickedNumber = $(this).data('value');
		var tempClick = $(this).data('value');
		// Update the input field's value with the clicked number

		if (clickedNumber === '=' || clickedNumber === '-' || clickedNumber === '+' || clickedNumber === '*' || clickedNumber === '/') {

			var prev = resultDisplay.val();
			if (count === 0) {
				if (prev.trim() != '') {
					localStorage.setItem('FirstNo', (resultDisplay.val()));
					localStorage.setItem('symbol', (clickedNumber));
					count = count + 1;
				}
			} else if (count == 1) {
				localStorage.setItem('SecondNo', (resultDisplay.val()));
				count = count + 1;
				var enterButton = document.getElementById("enter");
				  enterButton.click();
			} else if (count > 1) {
				var fNo = localStorage.getItem('SecondNo');
				localStorage.setItem('SecondNo', (resultDisplay.val()));
				var sNo = localStorage.getItem('SecondNo');
				var ope = localStorage.getItem(symbol);
				doOperation(fNo, sNO, ope);
				count = count + 1;
			}
		}
		if (!(clickedNumber == '-' || clickedNumber == '+' || clickedNumber == '*' || clickedNumber == '/' || clickedNumber == '=')) {
			if (resultDisplay.val() == 0 && exe == 0) {
				resultDisplay.val('');
				resultDisplay.val(resultDisplay.val() + clickedNumber);
				exe = exe + 1;
			} else if (count > 0) {
				if (xs === 0) {
					resultDisplay.val('');
					xs = xs + 1;
				}
				resultDisplay.val(resultDisplay.val() + clickedNumber);
			} else if (count <= 1) {
				resultDisplay.val(resultDisplay.val() + clickedNumber);
			} else {
				resultDisplay.val('');
				resultDisplay.val(resultDisplay.val() + clickedNumber);
			}
		}
		historyDisplay.val(historyDisplay.val() + tempClick);
	});

	$("#enter").click(() => {
		var fNo = localStorage.getItem('FirstNo');
		var sNo = localStorage.getItem('SecondNo');
		var ope = localStorage.getItem('symbol');
		console.log('in do opt');
		const formData = {
			firstNumber: fNo,
			secondNumber: sNo,
			operation: ope,
		};

		$.ajax({
			url: '/cal', // Replace with your server's endpoint
			type: 'POST',
			data: JSON.stringify(formData),
			contentType: 'application/json',
			success: function(response) {
				console.log('Success:', response);
				$("#resultDisplay").val(response);
			},
			error: function(xhr, status, error) {
				// Handle error
				console.log('Error:', status, error);
			}
		});
		//  
	});
});
