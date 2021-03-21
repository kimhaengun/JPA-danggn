<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div style="margin-top: 100px; display: flex; justify-content: center; align-items: center;">
	<div>
		<div style="display: flex; justify-content: center; align-items: center;">
			<h1 style="font-size: 36px; margin-bottom: 50px; font-weight: 600;">중고거래 인기매물</h1>
		</div>

		<div style="width: 980px; text-align: right;">
			<select id="addresssi" style="margin-right: 10px; font-size: 17px; padding: 10px">
				<option value = "">지역을 선택하세요.</option>
				<option value = "서울특별시">서울특별시</option>
				<option value = "부산광역시">부산광역시</option>
				<option value = "대구광역시">대구광역시</option>
			</select> 
			
			<select style="font-size: 17px; padding: 10px">
				<option>동네를 선택하세요.</option>
				<option>서울특별시</option>
				<option>부산광역시</option>
				<option>대구광역시</option>
			</select>
		</div>

		<div style="margin:0 auto; margin-top: 100px; width: 980px; display: grid; grid-template-columns: repeat(4, 1fr); grid-auto-rows: 300px;">
			<c:forEach var="post" items="${posts}">
			<div style="border: 1px black solid; margin-bottom: 55px;margin-right: 44px">
				<a href="#" style="" >
					<div>사진</div>
					<p>${post.title}</p>
					<p>${post.price}</p>
					<p>${post.user.address}</p>
					<p>관심 ${post.favorite}</p>
				</a>
			</div>
			</c:forEach>
		</div>
		<div>
			<button>안녕</button>
			<button>안녕</button><button>안녕</button>
		</div>
	</div>
</div>
<script>
	let addressInfo = document.getElementById("addresssi");
	addressInfo = selectOption.option[selectOption.selectedIndex].value;
	console.log(addressInfo);
	
</script>
<%@ include file="../layout/footer.jsp"%>