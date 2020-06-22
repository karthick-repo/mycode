<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create cards</title>
</head>
<body>
<form action="createcards">  
<div align="center">
 Card Name : <input type="text" name="cardname" id="cardname" required><br/><br/>  
 Amount : <input type="number" name="amount" id="amount" required/><br/><br/>  
select Account:
<label for="selectaccount"></label>
<select id="selectaccount">
  <option value="My Wallet ">My Wallet</option>
</select>
<br><br>
<input type="submit" value="Create card" />
</div>
</form>  
</body>
</html>