<%@page language="java" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Job Applications Portal</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
<body>

<nav>
    <a href="index.jsp">Home</a>
    <a href="contact.jsp">Contact</a>
</nav>

<div class="container" id="home">
    <h1>Welcome to the Job Applications Portal</h1>
    <h3>Information about the job</h3>
    <form action="/addJob">
        <h4>Job name</h4>
        <input type="text" name="name" required>
        <h4>Country</h4>
        <input type="text" name="country" required>
        <h4>City</h4>
        <input type="text" name="city" required>
        <h4>Requirements (comma separated)</h4>
        <input type="text" name="requirements" required>
        <input type="submit" value="Add Job">
    </form>
</div>

</body>
</html>