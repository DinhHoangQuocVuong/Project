<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title><dec:title default="Trang chủ" /></title>

<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
<link href="<c:url value='/template/web/assets/favicon.ico' />" rel="icon" type="image/x-icon" media="all">

<!-- css -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value='/template/web/css/styles.css' />" rel="stylesheet" type="text/css" media="all">
<!-- css -->




</head>

<body>
	<!-- header -->
	<%@include file="/common/web/header.jsp"%>
	<!-- header -->

	<div class="py-5">
		<dec:body />
	</div>

	<!-- footer -->
	<%@include file="/common/web/footer.jsp"%>
	<!-- foooter -->

	<script type="text/javascript" src="<c:url value='/template/web/jquery/scripts.js' />"></script>
	<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>