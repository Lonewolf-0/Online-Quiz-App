<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
<style><%@include file="../../css/style.css"%></style>
</head>
<body>
        <div class="login-item" style="margin-left: 33%; margin-top: 5%;">
            <h1>Register</h1>
            <form action="register-process" method='POST'>
                <div class="form-group">
                    <label for="name">Name:</label>
                    <input type='text' id="name" name='name' value=''>
                </div>
                <div class="form-group">
                    <label for="email">Email Address:</label>
                    <input type='text' id="email" name='email' value=''>
                </div>
                <div class="form-group">
                    <label for="username">Username:</label>
                    <input type='text' id="username" name='username' value=''>
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type='password' id="password" name='password'>
                </div>
                <div class="form-group">
                    <input name="register" type="submit" value="Register">
                </div>
            </form>
        </div>
</body>
</html>
