<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<title>Result</title>
<style type="text/css">

body {
  font-size: 40px;
  text-align:center;
  background: linear-gradient(to right,  #2b40ff,#07121a);
}

h1,h3{
color: white;
margin:15px;
}
input, button {
  font-size:40px;
  color: white;
  border-radius: 5%;
  background-color: black;
  border: 2px solid white;
}

img{
width: 20%;
height:20%;
margin-top: 20px;
filter: drop-shadow(20px 10px 10px black);
}
img:hover{
  -ms-transform: scale(1.1); /* IE 9 */
  -webkit-transform: scale(1.1); /* Safari 3-8 */
  transform: scale(1.1); 
}

</style>

</head>


<body>
<img alt="" src="images\joke.gif">
<h1>Joke of the Day!</h1>
<h3>🤣<%=request.getParameter("joke")%> </h3>

<%@include file="index.html" %>

<h1>Ans=<%=request.getParameter("ans")%>🚩</h1>

</body>
</html>