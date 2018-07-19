<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>登录</title>
    <link rel="stylesheet" href="/resource/layui/css/layui.css">
    <link rel="stylesheet" href="/backstage/frame/static/css/style.css">
    <link rel="icon" href="/backstage/frame/static/image/code.png">
</head>
<body class="login-body body">

<div class="login-box">
    <form class="layui-form layui-form-pane" method="post" action="">
        <div class="layui-form-item">
            <h3>后台登录系统</h3>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">账号：</label>

            <div class="layui-input-inline">
                <input type="text" name="fdLoginName" class="layui-input" lay-verify="fdLoginName" placeholder="账号"
                       autocomplete="on" maxlength="20"/>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">密码：</label>

            <div class="layui-input-inline">
                <input type="password" name="fdPassword" class="layui-input" lay-verify="fdPassword" placeholder="密码"
                       maxlength="20"/>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">验证码：</label>

            <div class="layui-input-inline">
                <input type="number" name="code" class="layui-input" lay-verify="code" placeholder="验证码" maxlength="4"/><img
                    src="/backstage/frame/static/image/v.png" alt="">
            </div>
        </div>
        <div class="layui-form-item">
            <button type="reset" class="layui-btn layui-btn-danger btn-reset">重置</button>
            <button type="button" class="layui-btn btn-submit" lay-submit="" lay-filter="sub">立即登录</button>
        </div>
    </form>
</div>

<script type="text/javascript" src="/resource/layui/layui.js"></script>
<script type="text/javascript">
    layui.use(['form', 'layer'], function () {

        // 操作对象
        var form = layui.form
            , layer = layui.layer
            , $ = layui.jquery;

        // 验证
        form.verify({
            fdLoginName: function (value) {
                if (value == "") {
                    return "请输入用户名";
                }
            },
            fdPassword: function (value) {
                if (value == "") {
                    return "请输入密码";
                }
            },
            code: function (value) {
                if (value == "") {
                    return "请输入验证码";
                }
            }
        });

        // 提交监听
        form.on('submit(sub)', function (data) {
            $.ajax({
                url:"${pageContext.request.contextPath}/shiro/login",
                type:"post",
                data:$("form").serialize(),
                success:function(pdata){
                    var tData = eval('(' + pdata + ')');
                    if('success' != tData.loginRes){
                        layer.alert(tData.loginRes, {
                            title: '提交失败'
                        });
                    } else {
                        window.location.href="/index.jsp";
                    }
                },
                error:function(e){

                }
            });

            return false;
        });

        // you code ...
    })

</script>
</body>
</html>