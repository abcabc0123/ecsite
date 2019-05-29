<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>商品一覧</title>
<style type="text/css">

  body{
    margin:0;
    padding:0;
    line-height:1.6;
    font-size:12px;
    font-family:Verdana, Helvetica, sans-serif;
    color:#333;
    background:#fff;
  }

  table{
    text-align:center;
    margin:0 auto;
  }

  #top{
    width:780px;
    margin:30px auto;
    border:1px solid #333;
  }

  #header{
    width:100%;
    height:80px;
    background-color:black;
  }

  #main{
    width:100%;
    height:500px;
    text-align:center
  }

  #footer{
    width:100%;
    height:80px;
    background-color:black;
    clear:both;
  }

</style>
</head>
<body>

  <div id="header">
    <div id="pr">
    </div>
  </div>

  <div id="main">
    <div id="top">
      <p>一覧</p>
    </div>

    <div>
      <table border="1">
        <tr>
          <th>商品名</th>
          <th>値段</th>
          <th>在庫</th>
          <th>日付</th>
        </tr>

        <s:iterator value="itemListDTO">
        <tr>
          <td><s:property value="itemName"/></td>
          <td><s:property value="itemPrice"/></td>
          <td><s:property value="itemStock"/></td>
          <td><s:property value="insertDate"/></td>
        </s:iterator>
      </table>

      <s:form action="ItemDeleteConfirmAction">
        <s:submit value="削除"/>
      </s:form>
    </div>
  </div>

  <div id="footer">
    <div id="pr">
    </div>
  </div>

</body>
</html>