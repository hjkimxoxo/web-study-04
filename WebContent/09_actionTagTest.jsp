
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userID = request.getParameter("userID");
	String userPW = request.getParameter("userPW");
	String loginCheck= request.getParameter("loginCheck");
	
	if(loginCheck.equals("user")){
%>
	<jsp:forward page="09_userMain.jsp">
	<jsp:param value = '<%=URLEncoder.encode("고객","UTF-8")%>' name = "userName"/>
	</jsp:forward>
<% } else{ %>
	<jsp:forward page="09_managerMain.jsp">
	<jsp:param value= '<%=URLEncoder.encode("관리자","UTF-8")%>' name = "userName"/>
	</jsp:forward>
<% } %>