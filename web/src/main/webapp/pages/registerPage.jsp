<%@ include file="include.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <h6>Please, fill the form</h6>

    <form action="Controller" method="post">
        <input type="email" name="emailRegister" placeholder="email"/><br/>
        <input type="password" name="passwordRegister" placeholder="password"
               pattern="^.*(?=.{10,})(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$"/><br/>
        <input type="text" name="nameRegister" pattern="[A-Z]{1}[a-z]+" placeholder="name"><br/>
        <input type="text" name="surnameRegister" pattern="[A-Z]{1}[a-z]+" placeholder="surname"><br/>
        <input type="hidden" name="command" value="main_register"/>
        <input type="submit" name="register" value="register">
    </form>
</div>
</body>
</html>
