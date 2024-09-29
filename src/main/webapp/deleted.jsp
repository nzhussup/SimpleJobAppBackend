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
    <h3>Job deleted</h3>

    <h4>Id: ${deletedJob.id}</h4>
    <h4>Name: ${deletedJob.name}</h4>
    <h4>Country: ${deletedJob.country}</h4>
    <h4>City: ${deletedJob.city}</h4>
    <h4>Requirements: ${deletedJob.requirements}</h4>
</div>

</body>
</html>