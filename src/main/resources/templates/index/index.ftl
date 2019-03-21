<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
<link href="images/favicon1.ico" rel="icon" type="image/x-icon"/>
<link href="images/favicon1.ico" rel="shortcut icon" type="image/x-icon"/>
<title>控制面板主页</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" />
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/common/tocolor.js"></script>
<link rel="stylesheet" href="css/homelist.css" />
<link rel="stylesheet" href="css/common/skintheme.css" />

<script>
	function changepath(path){
		$('iframe').attr('src',path);
	}
</script>

</head>
<body>

<div class="navbar">
    <div class="navbar-inner">
        <div class="container-fluid"><a class="btn btn-navbar" data-toggle="collapse" data-target=".navbar-responsive-collapse"> </a> <a class="brand" contenteditable="true" href="#">网站名</a>

            <div class="nav-collapse collapse navbar-responsive-collapse">
                <ul class="nav" contenteditable="true">
                    <li class="active"><a href="#">主页</a></li>
                    <li><a href="#">链接</a></li>
                    <li><a href="#">链接</a></li>
                    <li class="dropdown"><a class="dropdown-toggle" href="#" data-toggle="dropdown">下拉菜单 </a>
                        <ul class="dropdown-menu">
                            <li><a href="#">下拉导航1</a></li>
                            <li><a href="#">下拉导航2</a></li>
                            <li><a href="#">其他</a></li>
                            <li class="divider">&nbsp;</li>
                            <li class="nav-header">标签</li>
                            <li><a href="#">链接1</a></li>
                            <li><a href="#">链接2</a></li>
                        </ul>
                    </li>
                </ul>

                <ul class="nav pull-right" contenteditable="true">
                    <li><a href="#">右边链接</a></li>
                    <li class="divider-vertical">&nbsp;</li>
                    <li class="dropdown"><a class="dropdown-toggle" href="#" data-toggle="dropdown">欢迎你 </a>
                        <ul class="dropdown-menu">
                            <li><a href="#">修改个人信息</a></li>
                            <li><a href="#">下拉导航2</a></li>
                            <li><a href="#">其他</a></li>
                            <li class="divider">&nbsp;</li>
                            <li><a href="#">链接3</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
            <!-- /.nav-collapse --></div>
    </div>
    <!-- /navbar-inner --></div>


</body>

</html>