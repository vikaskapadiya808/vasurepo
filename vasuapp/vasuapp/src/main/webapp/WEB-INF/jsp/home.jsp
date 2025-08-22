<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Vasu Car Wash</title>
		<style type="text/css">
		
		
		
		.center-box{
			float: left;
			margin-left: 400px
		}
		</style>
	</head>
	<body>
	<div class="center-box">
		<h3>Welcome to <b>VASU</b> car wash at your door step</h3>
		<c:choose>
		<c:when test="${empty customerDetailForm}">
		<a href="book"><button>Book for car wash</button></a>
		</c:when>
		<c:otherwise>
		<br/><br/>
		
		
		
		<form:form action="bookForCarWash" modelAttribute="customerDetailForm">
		<table>
		<tr><td>Name</td><td>: </td><td><form:input path="name"/></td><td><form:errors path="name" cssClass="error" style='color:red'/></td></tr>
		<tr><td>Mobile Number</td><td>:</td><td> <form:input path="mobileNumber"/></td><td><form:errors path="mobileNumber" cssClass="error" style='color:red'/></td></tr>
		
		<tr><td>Address </td><td>: </td><td><form:textarea path="address"/></td><td><form:errors path="address" cssClass="error" style='color:red'/></td></tr>
		
		<tr><td>City </td><td>:</td><td><form:input path="city"/></td><td><form:errors path="city" cssClass="error" style='color:red'/></td></tr>
        
		<tr><td>State </td><td>:</td><td><form:input path="state"/></td><td><form:errors path="state" cssClass="error" style='color:red'/></td></tr>
	    
		<tr><td>PIN </td><td>: </td><td><form:input path="pin"/></td><td><form:errors path="pin" cssClass="error" style='color:red'/></td></tr>
       
		<tr><td>Booking Date</td><td> :</td><td><form:input path="bookingDate" type="date" /> </td><td><form:errors path="bookingDate" cssClass="error" style='color:red'/></td></tr>
       
		<tr><td>choose time slot</td><td>:</td><td> <form:input path="timeSlot" type="time"/> </td><td><form:errors path="timeSlot" cssClass="error" style='color:red'/></td></tr>
       
		<tr><td></td><td></td><td> <input type="submit" value="proceed"/></td><tr>
		</table>
		
		</form:form>
		
		</c:otherwise>
		</c:choose>
		</div>
	</body>
</html>