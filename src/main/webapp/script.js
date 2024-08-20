function startTimer(duration, display) {
	        var timer = duration, minutes, seconds;
	        setInterval(function () {
	            minutes = parseInt(timer / 60, 10);
	            seconds = parseInt(timer % 60, 10);
	
	            minutes = minutes < 10 ? "0" + minutes : minutes;
	            seconds = seconds < 10 ? "0" + seconds : seconds;
	
	            display.textContent = minutes + ":" + seconds;
	
	            if (--timer < 0) {
	                // Auto-submit the form when the timer reaches zero
	                document.getElementById("quizForm").submit();
	            }
	        }, 1000);
	    }

        window.onload = function () {
            var thirtyMinutes = 60 * 30, // 30 minutes
            display = document.querySelector('#timer');
            startTimer(thirtyMinutes, display);
        };