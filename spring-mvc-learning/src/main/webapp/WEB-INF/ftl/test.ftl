<html>
<head>
    <meta charset="UTF-8">
    <title>ftl</title>
</head>
<style>
    * {
        margin: 0;
        padding: 0;
    }

    .parent {
        width: 1060px;
        flex-direction: row;
        margin: 10px auto;
    }

    .child {
        display: inline-block;
        width: 280px;
        height: 350px;
        margin-bottom: 20px;
        margin-right: 10px;
        border:1px solid gray;
        border-radius: 2%;
        padding-left: 5px;
    }

    p {
        font-family: "微软雅黑 Light";
        font-size: 20px;
        font-weight: 400;
    }
    h2{
        padding-top: 20px;
        padding-left: 200px;
        font-weight: 800;
    }
    img{
        padding-left: 50px;
        vertical-align: middle;
        display: table-cell;//
        text-align: center;
    }
    h1,p{
        text-align: center;
    }
</style>
<body>
<h2>What Spring can do</h2>
<br><br><br><br>
<div class="parent">
    <#list list as en >
        <div class="child" >
            <img src="${en.imgUrl}" style="max-width: 120px;">
            <h1>${en.title}</h1>
            <br><br>
            <p>
                ${en.content}
            </p>
        </div>
    </#list>
</div>
</body>
</html>


