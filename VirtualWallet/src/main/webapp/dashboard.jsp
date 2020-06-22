<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <ul class="nav navbar-nav">
      <li class="active"><a href="dashboard.jsp">Dashboard</a></li>
      <li><a href=viewcards.jsp>ViewCards</a></li>
      <li><a href=topupcard.jsp>TopupCard</a></li>
      <li><a href="login.jsp">Logout</a></li>
    </ul>
  </div>
</nav>
<div style="width:300px;height:100px;border:1px solid #000;">
Avaliable Balance <br><br> <input type = "text" name="avbalance" value="${amount}"readonly> </div>
<div style="width:300px;height:100px;border:1px solid #000;">
Avaliable Cards <br><br> <input type = "text" name="avcards" value="${tcards}"readonly></div>


</body>
</html>