<html>
<head>
    <title>index</title>
</head>
<body>

<#list ["hello","welcome","hi"] as word>
    <p>你好，${u.username}</p>
    <span>${word}</span></br>
</#list>
</body>
</html>