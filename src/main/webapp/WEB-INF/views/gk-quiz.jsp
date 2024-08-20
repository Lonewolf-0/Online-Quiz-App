<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.app.quiz.model.GKQuiz, java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>GK Quiz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <style><%@include file="../../css/style.css"%></style>
    <script><%@include file="../../script.js"%></script>
</head>
<body>
    <div class="container-home">
        <nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
            <div class="container-fluid">
              <a class="navbar-brand" href="home">Online Quiz App</a>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                  <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/scores">Scoreboard</a>
                  </li>
                </ul>
              </div>
              <div class="logout-button">
                <div class="user-name">
                    <h4><i class="bi bi-person-square me-2"></i>${name}!</h4>
                </div>
                <div class="btn btn-warning">
                    <a href="/logout" style="color: black; text-decoration: none;">Logout</a>
                </div>
              </div>
            </div>
          </nav>
        </div>

        <div style="color: white;">
		    <h1>GK Quiz</h1>
	    </div>
	    
	 <main>
        <div style="color: white;">
            <div id="timer" class="btn btn-warning"></div> <!-- Timer display -->
            <form id="quizForm" action="/gkQuizSubmit" method="post"> <!-- Adjust the form action URL as needed -->
	            
	            <%
	               List<GKQuiz> gkQuizContent = (List<GKQuiz>) request.getAttribute("gkQuizContent");
	               if (gkQuizContent != null && !gkQuizContent.isEmpty()) {
	                   for (GKQuiz quiz : gkQuizContent) { %>
	                       <div>
	                           <p><strong>Question:</strong> <%= quiz.getQuestion() %></p>
	                           <label>
	                               <input type="radio" name="answer_<%= quiz.getId() %>" value="<%= quiz.getOption1() %>">
	                               <%= quiz.getOption1() %>
	                           </label><br>
	                           <label>
	                               <input type="radio" name="answer_<%= quiz.getId() %>" value="<%= quiz.getOption2() %>">
	                               <%= quiz.getOption2() %>
	                           </label><br>
	                           <label>
	                               <input type="radio" name="answer_<%= quiz.getId() %>" value="<%= quiz.getOption3() %>">
	                               <%= quiz.getOption3() %>
	                           </label><br>
	                           <label>
	                               <input type="radio" name="answer_<%= quiz.getId() %>" value="<%= quiz.getOption4() %>">
	                               <%= quiz.getOption4() %>
	                           </label><br>
	                       </div>
	                   <% }
	               } else { %>
	                   <p>No quiz content available.</p>
	               <% } %>
	               <input type="submit" value="Submit Quiz">
	        </form>
	     </div>
	 </main>
</body>
</html>