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
    <form action="/showJobs">
        <button type="submit">Show All Jobs</button>
    </form>

    <a href="addjob.jsp">
        <button type="button">Add Job</button>
    </a>

    <a href="deletejob.jsp">
        <button type="button">Delete Job</button>
    </a>

</div>

</body>
</html>
