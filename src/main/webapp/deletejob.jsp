<%@page language="java" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Job Applications Portal</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>

<nav>
    <a href="index.jsp">Home</a>
    <a href="contact.jsp">Contact</a>
</nav>

<div class="container" id="home">
    <h1>Welcome to the Job Applications Portal</h1>
    <h3>Enter the Job ID</h3>
    <form action="deleteJob">
        <h4>ID</h4>
        <input type="number" name="id" required>
        <input type="submit" value="Delete Job">
    </form>
</div>

</body>
</html>