<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>contetView.jsp</title>
</head>
<body>
	<table width="500" cellpadding="0" cellspacing="0" border="1">
  <form action="modify" method="post">
    <input type="hidden" name="bId" value="${contentView.bId}">
    <tr>
      <td> 번호</td>
      <td> ${contentView.bId} </td>
    </tr>
    <tr>
      <td> 조회수</td>
      <td> ${contentView.bHit} </td>
    </tr>
    <tr>
      <td> 이름</td>
      <td><input type="text" name="bName" value="${contentView.bName}"></td>
    </tr>
    <tr>
      <td> 제목</td>
      <td><input type="text" name="bTitle" value="${contentView.bTitle}"></td>
    </tr>
    <tr>
      <td> 내용</td>
      <td><textarea rows="10" name="bContent">${contentView.bContent}</textarea></td>
    </tr>
    <tr>
      <td colspan="2"><input type="submit" value="수정"> &nbsp;&nbsp; <a href="list">목록보기</a> &nbsp;&nbsp;
        <a href="delete?bId=${contentView.bId}">삭제</a> &nbsp;&nbsp; 
        <a href="replyView?bId=${contentView.bId}">답변</a></td>
    </tr>
  </form>
</table>

</body>
</html>