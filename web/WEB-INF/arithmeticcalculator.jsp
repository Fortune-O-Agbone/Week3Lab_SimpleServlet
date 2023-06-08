<%-- 
    Document   : arithmeticcalculator
    Created on : Jun 1, 2023, 3:30:51 PM
    Author     : Fortune Agbone
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web 3 Lab_Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form method="post" action="arithmetic">
            First: <input type="text" name="firstNum" value="${firstNum}"></br>
            Second: <input type="text" name="secondNum" value="${lastNum}"></br>
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%">
        </form>
        
        <p>Result: ${result}</p>
        <p><a href="age">Age Calculator</a></p>
    </body>
</html>
