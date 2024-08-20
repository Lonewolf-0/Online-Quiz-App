<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<style><%@include file="../../css/style.css"%></style>
</head>
<body>
   <main>
       <div class="login-page-container">
            <div class="heading-item">
                    Online Quiz App
            </div>
            <div class="login-item">
                <h1>Login</h1>
                ${SPRING_SECURITY_LAST_EXCEPTION.message}
                <form action="login" method='POST'>
                    <div class="form-group">
                        <label for="username">User:</label>
                        <input type='text' id="username" name='username' value=''>
                    </div>
                    <div class="form-group">
                        <label for="password">Password:</label>
                        <input type='password' id="password" name='password'>
                    </div>
                    <div class="form-group">
                        <input name="submit" type="submit" value="Submit">
                    </div>
                </form>
                <div>
                    <a href="/register" class="register-link">Register</a>
                </div>
           </div>
        </div>
   </main>
</body>
</html>
