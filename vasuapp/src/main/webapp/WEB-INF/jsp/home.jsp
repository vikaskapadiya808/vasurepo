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
.book-btn {
	background-color: #00aaff;
	color: white;
	padding: 8px 15px;
	border-radius: 30px;
	font-size: 11px;
	text-decoration: none;
	transition: transform 0.2s ease, box-shadow 0.2s ease;
}

.book-btn:hover {
	transform: scale(1.05);
	box-shadow: 0 0 10px rgba(0, 170, 255, 0.6);
}

.center-box {
	float: left;
	margin-left: 400px
}

.confirm-btn {
	background-color: #28a745; /* Green for success */
	color: white;
	padding: 6px 6px;
	font-size: 11px;
	border: none;
	border-radius: 8px;
	cursor: pointer;
	transition: background-color 0.3s ease, transform 0.2s ease;
}

.confirm-btn:hover {
	background-color: #218838;
	transform: scale(1.05);
}

.confirm-btn:active {
	transform: scale(0.98);
}
</style>
	</head>
	<body>
	<div class="center-box">
		<h3>Welcome to VASU car wash - Where Clean meets care !</h3>
		<c:choose>
		<c:when test="${empty customerDetailForm}">
		<a href="book" class="book-btn">🚗 Book Your Car Wash</a>
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
       
		<tr><td></td><td></td><td> <input type="submit"  class="confirm-btn" value="✅ Confirm Booking"/></td><tr>
		</table>
		
		</form:form>
		
		</c:otherwise>
		</c:choose>
		</div>
	</body>
</html>