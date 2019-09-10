<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>레지스터</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>
<h2>학생등록</h2>

<form id="register" action="<%=request.getContextPath()%>/student.do">
	이름 : <input type="text" name="name"/> <br />
	주민번호 : <input type="text" name="ssn"/> <br />
	학번 : <input type="text" name="schNumber"/> <br />
		<input type="hidden" name="action" value="register"/>
		<input type="hidden" name="dest" value="login"/>
		<input type="submit" id="btn" value="전송"/>

</form>
</div>
<script>
$('#register').submit(function(){
	alert=('제출 중');
});
</script>
</body>
</html>