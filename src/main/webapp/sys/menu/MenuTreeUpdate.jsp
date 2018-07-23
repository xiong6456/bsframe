<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<head>
<script type="text/javascript" src="/resource/ext3.2/adapter/ext/ext-base.js"></script>
<script type="text/javascript" src="/resource/ext3.2/ext-all.js"></script>
<script type="text/javascript" src="/resource/ext3.2/TreeExUI.js"></script>
<link rel="stylesheet" type="text/css" href="/resource/ext3.2/resources/css/ext-all.css" />
<title>节点明细修改</title>
</head>
<body onload='onload();'>
<div id="fm">
</div>
<script type="text/javascript">
function onload(){
  var form = new Ext.form.FormPanel({
    defaultType: 'textfield',
    labelAlign: 'right',
    title: '节点属性',
    labelWidth: 100,
    frame: true,
    width: 400,

    items: [{
      fieldLabel: '菜单节点id',
      value:'${requestScope.retObj.fdId}',
      width:200,
      readOnly:true,
      id:"nodecode"
    },{
      fieldLabel: '菜单名称',
      value:'${requestScope.retObj.fdName}',
      id:"nodename",
      width:200
    },{
      fieldLabel: '菜单链接页面',
      value:'${requestScope.retObj.fdRunScript}',
      id:"runscript",
      width:200
    },{
      fieldLabel: '菜单所属期数',
      value:'${requestScope.retObj.fdTerm}',
      id:"fdTerm",
      width:200
    },{
      xtype: "datefield",
      fieldLabel: '菜单有效期',
      value:'${requestScope.retObj.fdDueTime}',
      format: "Y-m-d",//日期的格式
      id:"fdDueTime",
      width:200
    },{
      fieldLabel: '菜单是否为页面显示',
      value:'${requestScope.retObj.fdIframe}',
      id:"fdIframe",
      width:200
    },{
      fieldLabel: '菜单是否可用',
      value:'${requestScope.retObj.fdState}',
      id:"fdState",
      width:200
    },{
      fieldLabel: '菜单样式',
      value:'${requestScope.retObj.fdCls}',
      id:"fdCls",
      width:200
    }],
    buttons: [{
      text: '提交修改'
    },{text: '关闭窗口'}
    ]
  });

  form.buttons[0].on("click",function(btn){

     Ext.Ajax.request({
         url: '${pageContext.request.contextPath }/menu/update',
         method: 'post',
         params: {
           fdId:form.getComponent("nodecode").getValue(),
           fdName:form.getComponent("nodename").getValue(),
           fdRunScript:form.getComponent("runscript").getValue(),
           fdTerm:form.getComponent("fdTerm").getValue(),
           fdDueTime:form.getComponent("fdDueTime").getValue(),
           fdIframe:form.getComponent("fdIframe").getValue(),
           fdState:form.getComponent("fdState").getValue(),
           fdCls:form.getComponent("fdCls").getValue()
          },
          callback: function(options, success, response) {
            if(success) {
                Ext.MessageBox.alert('提示', '修改成功！', function(btn) {
                  var node=top.opener.tree.getNodeById(form.getComponent("nodecode").getValue());
                  node.setText(form.getComponent("nodename").getValue());
                  window.close();
              });

            }else {
              	Ext.MessageBox.alert('提示', '修改成功！'+response, function(btn) {
             });

            }
          }
    });
  });
  //关闭窗口
  form.buttons[1].on("click",function(btn){
    window.close();
  });
  form.render("fm");
}

</script>

</body>
