<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="inc/header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Style copied from douban.</title>
<style type="text/css">
		/* Reset */
		body,div,dl,dt,dd,ul,ol,li,h1,h2,h3,h4,h5,h6,pre,form,fieldset,input,textarea,p,blockquote,th,td { margin:0; padding:0; }
		table { border-collapse:collapse; border-spacing:0; }
		fieldset,img { border:0; }
		address,caption,cite,code,dfn,em,strong,th,var { font-style:normal; font-weight:normal; }
		ol,ul { list-style:none; }
		caption,th { text-align:left; }
		h1,h2,h3,h4,h5,h6 { font-size:100%; font-weight:normal; }
		q:before,q:after { content:''; }
		abbr,acronym { border:0; }
		
		/* Font,  Link & Container */
		body { font:12px/1.6 arial,helvetica,sans-serif;}
		a:link { color:#369;text-decoration:none; }
		a:visited { color:#669;text-decoration:none; }
		a:hover { color:#fff;text-decoration:none;background:#039; }
		a:active { color:#fff;text-decoration:none;background:#f93; }
		button { cursor:pointer;line-height:1.2; }
		.mod { width:100%; }
		.hd:after, .bd:after, .ft:after, .mod:after {content:'\0020';display:block;clear:both;height:0; }
		.error-tip { margin-left:10px; }
		.error-tip, .error { color:#fe2617; }
		
		/* Layout */
		.wrapper { width:950px;margin:0 auto; }
		#header { padding-top:30px; }
		#content { min-height:400px;*height:400px; }
		#header, #content { margin-bottom:40px; }
		#header, #content, #footer { width:100%;overflow:hidden; }
		#footer { color:#999;padding-top:6px;border-top: 1px dashed #ddd; }
		.article { float:left;width:590px; }
		.aside { float:right;width:310px;color:#666; }
		.aside li { padding-bottom: 20px; }
		
		/* form */
		.item { margin:15px 0;zoom:1; }
		label { display: inline-block; float:left; margin-right: 15px; text-align: right; width: 60px; font-size: 14px; line-height: 30px; vertical-align: baseline }
		.remember { cursor: pointer; font-size: 12px; display: inline; width: auto; text-align: left; float: none; margin: 0; color: #666 }
		.item-captcha input,
		.basic-input { width: 200px; padding: 5px; height: 18px; font-size: 14px;vertical-align:middle; -moz-border-radius: 3px; -webkit-border-radius: 3px; border-radius: 3px; border: 1px solid #c9c9c9 }
		.item-captcha input:focus,
		.basic-input:focus { border: 1px solid #a9a9a9 }
		.item-captcha input { width:100px; }
		.item-captcha .pl { color:#666; }
		.btn-submit { cursor: pointer;color: #ffffff;background: #65a9d7; border: 1px solid #528641; font-size: 14px; font-weight: bold; padding:6px 26px; border-radius: 3px; -moz-border-radius: 3px; -webkit-border-radius: 3px; *width: 100px;*height:30px; }
		.btn-submit:hover { background-color:#3d6985;border-color:#6aad54; }
		.btn-submit:active { background-color:#1b435e;border-color:#528641; }
		#item-error { padding-left:75px; }
		
		/* Special */
		.loginform { float:left; width:500px; padding-left: 430px}
		.login-header { background: #4B088A url(images/login-header.png) no-repeat top center; height: 150px; margin-bottom: 10px; text-align: center; font-weight: bold; font-size:48px; padding-top:50px;}
	</style>
</head>
<body>
<%-- <a href="<c:url value='/user'/>">用户列表</a> --%>

<form class="loginform" name="login" method="post" action="<%=request.getContextPath()%>/login" onsubmit="return validateForm(this);">
    <div class="item">
        <label>帐号</label>
        <input name="username" type="text" class="basic-input" maxlength="60" tabindex="1" style="color: rgb(204, 204, 204); ">
    </div>
    <div class="item">
        <label>密码</label>
        <input id="password" name="password" type="password" class="basic-input" maxlength="20" tabindex="2">
    </div>
    <br/>
    <div class="item">
        <label>&nbsp;</label>
        <input type="submit" value="登录" name="user_login" class="btn-submit" tabindex="5">
    </div>
    <div class="item">
		<span>${mesg}</span>
    </div>
</form>
</body>
</html>