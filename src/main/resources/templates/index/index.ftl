<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
<link href="images/favicon1.ico" rel="icon" type="image/x-icon"/>
<link href="images/favicon1.ico" rel="shortcut icon" type="image/x-icon"/>
<title>系统主页</title>
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

<table class="table table-hover" id="index1">
    <thead>
    <tr>
        <th>序号</th>
        <th>酒店id</th>
        <th>酒店名称</th>
        <th>图片</th>
        <th>月订单量</th>
        <th>评分</th>
        <th>价格</th>
        <th>符合筛选？</th>
        <th>操作</th>
    </tr>
    </thead>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>6</td>
    <td>0</td>
    <td>0</td>

    <input type="hidden" id="path" value="">

<!-- 应该要增加树，然后排序下来，在页面右上角显示个人信息-->
<div id="bottom-panel">首页</div>
<div style="float:right">

</div>
</body>

</html>