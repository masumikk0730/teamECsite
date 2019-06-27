<%@ page language = "java" contentType = "text/html; charset = UTF-8" pageEncoding = "UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>

<!DOCTYPE html>

<html>

<head>

	<meta charset = "UTF-8"/>

	<link rel = "stylesheet" href = "css/style_main.css">
	<link rel = "stylesheet" href = "css/style_cart.css">

	<title>カート画面</title>

</head>

<body>

	<jsp:include page = "header.jsp" />

	<script src = "./js/cart.js"></script>

	<h1>カート画面</h1>

	<s:if test = "cartInfoDTOList != null && cartInfoDTOList.size() > 0">
		<form id = "cartForm" method = "post">
		<div id = "cartTable">

			<table class = "cart">

				<thead>
					<tr>
					<th id = "checkArea"><label>#</label></th>
					<th id = "productName"><label>商品名</label></th>
					<th id = "productNameKana"><label>ふりがな</label></th>
					<th id = "productImage"><label>商品画像</label></th>
					<th id = "price"><label>値段</label></th>
					<th id = "releaseCompany"><label>発売会社名</label></th>
					<th id = "releaseDate"><label>発売年月日</label></th>
					<th id = "count"><label>購入個数</label></th>
					<th id = "totalPrice"><label>合計金額</label></th>
					</tr>
				</thead>

				<tbody>
					<s:iterator value = "cartInfoDTOList">
					<tr>
						<td id = "checkCenter">
							<input type = "checkbox" name = "checkList" class = "checkList" value = '<s:property value = "productId" />' onchange = "checkValue(this)" />
							<input type = "hidden" name = "productId" value = '<s:property value = "productId" />' />
						</td>
						<td><s:property value = "productName "/></td>
						<td><s:property value = "productNameKana" /></td>
						<td><img src = '<s:property value = "imageFilePath"/><s:property value = "imageFileName"/>.jpg'/></td>
						<td><s:property value = "price" />円</td>
						<td><s:property value = "releaseCompany" /></td>
						<td><s:property value = "releaseDate" /></td>
						<td><s:property value = "productCount" />個</td>
						<td><s:property value = "subTotal" />円</td>
					</tr>
					</s:iterator>
				</tbody>

			</table>
			</div>

		<div id ="tp">

			<p id = "totalPrice"><label>カート合計金額 :</label><s:property value = "totalPrice"/>円</p><br>

		</div>
		<div id ="btn">

			<div id = "settlementButtonArea">
				<input type = "submit" value = "決済" class = "button" onclick = "goSettlementConfirmAction()"/>
			</div>

			<div id = "deleteButtonArea">
				<input type = "submit" value = "削除" id = "deleteButton" onclick = "goDeleteCartAction()" disabled />
			</div>
		</div>

		</form>

	</s:if>

	<s:else>
		<div id = "message">カート情報がありません。</div>
	</s:else>

</body>

</html>
