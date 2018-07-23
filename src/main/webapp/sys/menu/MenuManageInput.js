var moveArray=new Array();

function checkgrid(){
Ext.BLANK_IMAGE_URL = mContextPath+'/resource/menu/ext3.2/resources/images/default/s.gif';

 var  ctx = new Ext.menu.Menu( {
              id : 'project-ctx',
              items : [{
                  id:'btnUpdate',
                  text : '修改',
                  icon : mContextPath+'/resource/menu/ext3.2/images/update.bmp',
                  scope : this
                  },{
                  id:'btndelete',
                  text : '删除',
                  icon : mContextPath+'/resource/menu/ext3.2/images/delete.gif',
                  scope : this
              }]
        });

//布局
var viewport = new Ext.Viewport({
    layout:'border',
    items:[{
        title: '节点明细',
        region: 'north',
        contentEl: 'north-div',
        split: true,
        border: true,
        collapsible: true,
        autoHeight: true,
        autoScroll: true,
        minSize: 50,
        maxSize: 120
    },{
        title: '菜单树',
        region: 'center',
        contentEl: 'center-div',
        split: true,
        border: true,
        collapsible: true,
        autoScroll: true
    }]
});

//读取树
var data=new Ext.tree.TreeLoader({
     dataUrl: mContextPath+'/menu/selectTree',
    baseAttrs: { uiProvider: Ext.tree.TreeCheckNodeUI }
  });

//显示树
 var Tree = Ext.tree;
 this.tree = new Tree.TreePanel(
     {el:'div_tree',
   loader: data,
   autoScroll: true,//是否自动滚动
   enableDD:true,//是否支持拖拽效果
   containerScroll: true,//是否支持滚动条
   rootVisible:false,//隐藏跟节点
   checkModel: "single", //单选
   height:600,
   buttons: [{
        id:'btnadd',
        text: '增加节点'
    },
    {
        id:'btnMove',
        text: '保存节点位置'
    },{
        id:'btnRefresh',
        text: '刷新节点'
    }/*,{
        id:'btn1',
        text: '收起所有节点'
    }*/],
    tbar:[new Ext.form.TextField({    width: 200,
    emptyText:'查找.....',
    listeners:{
     render: function(f){
      f.el.on('keydown', filterTree, f, {buffer: 350});
     }
    }
   })]

   });
  Ext.override(Ext.data.Node, {
     setLeaf: function(value){
     this.leaf = value;
     }
  });
  tree.on('append',function(tree,p,n,index){
     n.setLeaf(false);
  });

  //增加右键菜单
tree.on('contextmenu',function onContextShow(node, e) {

         ctx.showAt(e.getXY());
        ctx.on('click',function itemclick(menu,baseItem, e) {
         if(baseItem.id=='btnUpdate'){
            window.open(mContextPath+"/menu/selectList?node="+node.id,"window","width=400,height=150,toolbar=no, menubar=no, scrollbars=no, resizable=no, location=no, status=no");
          }else
          {
            if(node.hasChildNodes())
            {
              Ext.MessageBox.confirm('确认框', '该操作将递归删除下属所有节点且不能回复，你确定要删除吗？', function(btn) {
                  if(btn!='yes'){
                    return ;
                  }
                  deleteNode(node);
              });

            }else
            {
               deleteNode(node);
            }

          }
        });
    });

tree.on("check",function(node,checked){//多选动作
});

//增加树的过滤器
var filter = new Ext.tree.TreeFilter(tree, {
  clearBlank: true,
  autoClear: true
 });


var hiddenPkgs = [];
 function filterTree(e){
  var text = e.target.value.trim();

        Ext.each(hiddenPkgs, function(n){
            n.ui.show();
        });

        if(!text){
            filter.clear();
            return;
        }

       tree.expandAll();


        var re = new RegExp(Ext.escapeRe(text), 'i');

        filter.filterBy(function(n){

         var textval = n.text;

            return !n.attributes.isLeafx || re.test(n.text);
        });

        // hide empty packages that weren't filtered
        hiddenPkgs = [];
        tree.root.cascade(function(n) {
        if(!n.attributes.isLeafx&& n.ui.ctNode.offsetHeight<3 &&!re.test(n.text)){
            n.ui.hide();
            hiddenPkgs.push(n);
          }
        });
 }


function deleteNode(node) {
	if(node.attributes.parentnodecode == '0') {
		  Ext.MessageBox.alert('提示', '不能删除根结点！', function(btn) {
	      });
		  return;
	 }
     Ext.MessageBox.confirm('确认框', '你确定要删除'+node.text+'菜单吗？', function(btn) {
     if(btn=='yes'){
       var id=node.attributes.parentnodecode;

       Ext.Ajax.request({
         url: mContextPath+'/menu/delete',
         method: 'post',
         params: {fdId: node.id},
          callback: function(options, success, response)
          {
            if(success)
            {
               Ext.MessageBox.alert('庆祝', '删除成功！', function(btn) {
               node.remove();
               });

            }else
            {
              Ext.MessageBox.alert('提示', '删除失败！'+response, function(btn) {
              });

            }
          }
       });
     }

  });

}
/*
tree.buttons[3].on("click",function(btn){
  if(tree.buttons[3].text=='收起所有节点'){
    tree.collapseAll();
    tree.buttons[3].text='打开所有节点';
  }else if(tree.buttons[3].text=='打开所有节点'){
    tree.expandAll();
    tree.buttons[3].text='收起所有节点';
  }
});*/


//增加节点
tree.buttons[0].on("click",function(btn){
  var nodeArray=tree.getChecked();
  var str="";
  if(nodeArray==null||nodeArray==''||nodeArray.length==0)
  {
    Ext.MessageBox.alert('警告1', '你未选择任何节点', function(btn) {

    });
    return;
  }
  var selectnode=nodeArray[0];
  var isChild=false;

  if(checkbox1.checked==true) {
     isChild=true;
  }else {
     isChild=false;
  }

  if(NodeName.value=='') {
     Ext.MessageBox.alert('警告', '菜单节点名称不能为空', function(btn) {
    });
     return ;
  }

  if(fdIframe.value=='') {
     Ext.MessageBox.alert('警告', '是否为页面显示不能为空', function(btn) {
    });
     return ;
  }
  
  var fdIsChild = "0";
  if(isChild) {
	  fdIsChild = "1";
  }

  if(fdIsChild == '0' && selectnode.attributes.parentnodecode == '0') {
	  Ext.MessageBox.alert('提示', '插入失败，不能插入根结点平级菜单！', function(btn) {
      });
	  return;
  }

  Ext.Ajax.request({
         url: mContextPath+'/menu/insert',
         method: 'post',
         params: {
           fdIsChild:fdIsChild,
           fdName:NodeName.value,
           fdRunScript:RunScript.value,
           fdTerm:FdTerm.value,
           fdDueTime:document.getElementById("FdDueTime").value,
           fdId:selectnode.id,
           fdParentId:selectnode.attributes.parentnodecode,
           fdChildCount:selectnode.attributes.childflag,
           fdIframe:fdIframe.value,
           fdState:fdState.value,
           fdCls:fdCls.value
         },
          callback: function(options, success, response) {
            if(success) {
                Ext.MessageBox.alert('提示', '插入成功！', function(btn) {
                var responseArray=Ext.util.JSON.decode(response.responseText); //获得返回值
                var info=responseArray.info;
                var str=info.split(",");
                var node=new Ext.tree.TreeNode({
                     uiProvider: Ext.tree.TreeCheckNodeUI
                });
                node.id=str[0];
                node.text=str[2];
                node.attributes.parentnodecode=str[1];
                node.attributes.childflag=str[3];
                node.leaf="true";
                node.attributes.isLeafx="true";

                if(isChild) {
                  selectnode.insertBefore(node, selectnode.firstChild);
                } else {
                   var parent=tree.getNodeById(selectnode.attributes.parentnodecode);
                   parent.insertBefore(node,selectnode);
                }
              });

            }else {
              Ext.MessageBox.alert('提示', '插入失败！'+response, function(btn) {
              });

            }
          }
    });
});


data.on('beforeload',function(treeLoader,node){
               this.baseParams.id=node.attributes.id;
            },data);
//设置树可以被直接更改
this.treeEditer = new Tree.TreeEditor(
         this.tree,
         {allowBlank: false}
      );
 this.treeEditer.on("beforestartedit", function(treeEditer){
         var tempNode = treeEditer.editNode;//将要编辑的节点
       });


       this.treeEditer.on("complete", function(treeEditer,updateValue,baseValue){//编辑完成

           Ext.Ajax.request({
             url: mContextPath+'/menu/update',
             method: 'post',
             params: {fdName:updateValue , fdId: treeEditer.editNode.id}
           });
       });

     this.tree.on('nodedrop',function(e){//拖拽
          var tempArray=new Array();

          tempArray[0]=e.dropNode.id;
          tempArray[1]=e.target.id;
          tempArray[2]=e.point;
          moveArray.push(tempArray);
          tree.buttons[0].disable();
      });

//移动节点
tree.buttons[1].on("click",function(btn){
  Ext.MessageBox.show({
    msg: '正在存数据, 请等待...',
    progressText: 'Saving...',
    width:300,
    wait:true,
    waitConfig: {interval:200},
    icon:'ext-mb-download', //custom class in msg-box.html
    animEl: 'mb7'
  });

  Ext.Ajax.request({
    url: mContextPath+'/menu/move',
    method: 'post',
    params: {moves: moveArray},
    callback: function(options, success, response)
    {
      moveArray=new Array();


      Ext.MessageBox.hide();
      Ext.MessageBox.alert('庆祝', '菜单调整成功！', function(btn) {
            tree.root.reload();
            tree.buttons[0].enable();
      });
    }
  });
});

//刷新节点
tree.buttons[2].on("click",function(btn){
 tree.root.reload();
 tree.expandAll();
 tree.buttons[0].enable();

});
var root = new Ext.tree.AsyncTreeNode({id:'0',text:'菜单树'});
tree.setRootNode(root);//设置根
root.expand();
//tree.expandAll();
tree.render();
//tree.collapseAll();
}

