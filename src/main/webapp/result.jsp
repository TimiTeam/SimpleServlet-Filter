
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<%

String name =(String) request.getAttribute("name");
int age = (Integer) request.getAttribute("age");
String message = null;
if(age<10){
message = "Boy";
}
if(age>10 && age < 18 ){
message = "Teenager";
}
if(age>18 && age < 30){
message = "Guy";
}
if(age>30 && age < 60){
message = "Man";
}if(age>60 && age < 100){
message = "Granddad";
}
%>
<h1> Hello <%=name%> </h1>
<h2> <%=age%></h2>

<h2> You age a good <%=message%> ? </h2>
</body>
</html>
