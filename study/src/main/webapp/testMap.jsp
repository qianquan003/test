<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <title>struts2中的map遍历总结</title>
</head>
<body>
<b>1.map中的value为String字符串</b><br>
<s:iterator value="map" id="column">
  <s:property value="#column"/><br>
  key: <s:property value="key"/><br>
  value:<s:property value="value"/><br>
</s:iterator>


<b>2.map中的value为Student对象</b>
<table border="1" width="50%"  cellspacing="0" cellpadding="0">
  <tr>
    <td>key=value</td>
    <td>ID</td>
    <td>num</td>
    <td>name</td>
    <td>sex</td>
    <td>age</td>
  </tr>
  <s:iterator value="studentMap" id="column">
    <tr>
      <td><s:property value="#column"/></td>
      <td><s:property value="value.id"/></td>
      <td><s:property value="value.num"/></td>
      <td><s:property value="value.name"/></td>
      <td><s:property value="value.sex"/></td>
      <td><s:property value="value.age"/></td>
    </tr>
  </s:iterator>
</table>
<p>


  <b>3.map中的value为String数组</b>
<table border="1" width="50%" cellspacing="0" cellpadding="0">
  <tr>
    <td>key=value</td>
    <td>ID</td>
    <td>num</td>
    <td>name</td>
    <td>sex</td>
    <td>age</td>
  </tr>
  <s:iterator value="arrayMap" id="column">
    <tr>
      <td><s:property value="#column"/></td>
      <td><s:property value="value[0]"/></td>
      <td><s:property value="value[1]"/></td>
      <td><s:property value="value[2]"/></td>
      <td><s:property value="value[3]"/></td>
      <td><s:property value="value[4]"/></td>
    </tr>
  </s:iterator>
</table>
<p>
  <b>4.map中的value为list集合</b>
<table border="1" width="50%"  cellspacing="0" cellpadding="0">
  <tr>
    <td>class</td>
    <td>ID</td>
    <td>num</td>
    <td>name</td>
    <td>sex</td>
    <td>age</td>
  </tr>

  <1.<s:iterator value="listHashMap" id="listid">
  <s:iterator value="#listid.value" id="listidsub">
    <tr>
      <td><s:property value="key"/></td>
      <td><s:property value="id"/></td>
      <td><s:property value="num"/></td>
      <td><s:property value="name"/></td>
      <td><s:property value="sex"/></td>
      <td><s:property value="age"/></td>
    </tr>
  </s:iterator>
</s:iterator>
</table>


</body>
</html>