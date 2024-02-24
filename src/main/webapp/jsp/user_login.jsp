<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org">
<head>
    <title>Hello Page</title>
    <script type="module" crossorigin src="../react/dist/assets/main-5jfKclhJ.js"></script>
    <script type="module" crossorigin src="../react/dist/assets/App-FfCu_IuN.js"></script>
    <script type="module" crossorigin src="../react/dist/assets/todo-K_YDpBrJ.js"></script>
    <link rel="stylesheet" crossorigin href="../react/dist/assets/main-T74ItOsL.css">
    <link rel="stylesheet" crossorigin href="../react/dist/assets/App-cfVfczdt.css">
</head>
	<body>
    <div id="root"></div>
		<h1>No Log In</h1>
		<div th:if="${param.error}">
			Invalid username and password.</div>
		<div th:if="${param.logout}">
			You have been logged out.</div>
<form action="/user_login" method="post">
    <div>
        <input type="text" name="username" placeholder="Username"/>
    </div>
    <div>
        <input type="password" name="password" placeholder="Password"/>
    </div>
    <input type="submit" value="Log in" />
</form>
	</body>
</html>
