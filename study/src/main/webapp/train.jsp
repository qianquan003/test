<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/12/30
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
  <script type="text/javascript">
    $(function()
    {
      $("#button1").click(function()
      {
        $.get("GsonServlet",{}, function(returnedData, status)
        {
          var html = "<table width='60%' border='1' align='center'><tr><th>id</th><th>name</th><th>companyAddress</th><th>homeAddress</th>"
          alert(returnedData);
          for(var i = 0; i < returnedData.length; i++)
          {
            var people = returnedData[i];
            var id = people.id;
            var name = people.name;
            var companyAddress = people.address.companyAddress;
            var homeAddress = people.address.homeAddress;
            html += "<tr align='center'><td>" + id + "</td><td>" + name + "</td><td>" + companyAddress + "</td><td>" + homeAddress + "</td></tr>";
          }
          html += "</table>";

          $("#theBody table:eq(0)").remove();

          $("#theBody").append(html);
        });
      });
    });
  </script>
</head>
<body id="theBody">
<input type="button" value="get json content from server" id="button1">
</body>
</html>
