<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<head>
<script type="text/javascript">
var mContextPath = "${pageContext.request.contextPath }";
</script>
<script type="text/javascript" src="/resource/ext3.2/adapter/ext/ext-base.js"></script>
<script type="text/javascript" src="/resource/ext3.2/ext-all.js"></script>
<script type="text/javascript" src="/resource/ext3.2/TreeExUI.js"></script>
<SCRIPT type="text/javascript" src="MenuManageInput.js"></SCRIPT>
<script type="text/javascript" src="/common/js/jquery-2.1.3.min.js"></script>
<link rel="stylesheet" type="text/css" href="/resource/ext3.2/resources/css/ext-all.css" />

</head>
<body onload='checkgrid();'>
<form action="" name="fm">
<div id="north-div">
 <table class= common>
      <TR  class= common>
          <TD  class= title> 菜单节点名称</TD>
          <TD  class= input><Input class=common name=NodeName id=NodeName> </TD>
          <TD class= title>菜单链接页面</TD>
          <TD  class= input> <Input class=common name=RunScript id=RunScript ></TD>
          <TD class= title> 所属期数</TD>
          <TD  class= input> <Input class=common name=FdTerm id=FdTerm ></TD>
          <TD class= title> 功能有效期</TD>
          <TD  class= input>
          	<input type="date" name="FdDueTime" id="FdDueTime"/>
          </TD>
      </TR>
      <TR  class= common>
          <TD  class= title>是否为页面显示</TD>
          <TD  class= input>
			<select class=common name=fdIframe id=fdIframe style="width:172px;">
			  <option selected="selected" value='0'>否</option>
			  <option value='1'>是</option>
			</select>
		  </TD>
          <TD class= title>是否可用</TD>
          <TD  class= input>
          	<select class=common name=fdState id=fdState style="width:172px;">
			  <option selected="selected" value='1'>是</option>
			  <option value='2'>否</option>
			</select>
          </TD>
          <TD class= title>菜单样式</TD>
          <TD  class= input> <Input class=common name=fdCls id=fdCls ></TD>
      </TR>
    </Table>
  <table class= common>
  <input type="checkbox" name="checkbox1" value="1" id="checkbox1"><b>作为子菜单插入(不选则按照同级菜单插入)</b>
  </table>
</div>
<div id="center-div"><div id="div_tree" style="height:500px;"></div></div>
</form>
</body>
