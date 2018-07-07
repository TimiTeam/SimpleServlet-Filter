
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<h1>Welcome. Lets me know your name and age</h1>
<h2>Enter, pleas </h2>

<form action="/service" method="post">
    <p> Enter your name:</p>
    <input type="text" name="name">
    <p>Enter age: </p>
    <input type="text" name="age"><hr/>
    <p>Enter your id: </p>
    <input type="text" name="id"><br/>
    <p>
        <input type="submit">
    </p>
</form>

</body>

</html>
