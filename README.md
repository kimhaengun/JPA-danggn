##DB

```sql test
	create user 'product'@'%' identified by 'bitc5600';
	GRANT ALL PRIVILEGES ON *.* TO 'product'@'%';
	create database product;
	
	
	use product;

select * from user;
select * from post;
delete from pos where id='5';
drop table post;pos
update user set role='USER'where role='User';
insert into user(id,username,password,image,email,address,role,creDateTime) value('1',"cos","1234","사진1","cos@naver.com","부산시 사상구","User",now());
insert into user(id,username,password,image,email,address,role,creDateTime) value('2',"ssar","1234","사진2","ssar@naver.com","서울특별시 강남구","User",now());

insert into post(id,title,content,price,image,favorite,view,userId,createDate) value('1',"삼성제습기 13리터", "내용1",'30000',"사진1",'6','0',1,now());
insert into post(id,title,content,price,image,favorite,view,userId,createDate) value('2',"캠핑 감성 나무선반 팝니다", "내용2",'10000',"사진2",'9','0',1,now());
insert into post(id,title,content,price,image,favorite,view,userId,createDate) value('3',"SK 매직 전자레인지 20L", "내용3",'30000',"사진3",'5','0',2,now());
insert into post(id,title,content,price,image,favorite,view,userId,createDate) value('4',"삼성 전자렌지 중고 2만원", "내용4",'20000',"사진4",'2','0',1,now());
insert into post(id,title,content,price,image,favorite,view,userId,createDate) value('5',"선반", "내용5",'5000',"사진5",'10','0',2,now());

SELECT DISTINCT * FROM post p inner join user u WHERE p.title  LIKE '%삼성%' or u.address LIKE '%부산%';

SELECT DISTINCT p.title, u.address FROM post p inner join user u WHERE p.title  LIKE '%삼성%' or u.address LIKE '%부산%';

SELECT * FROM post p inner join user u
ON p.userId = p.id;


SELECT pm.id, pm.username,pd.name,pd.code 
FROM paname pm inner join product pd 
ON pm.productId = pd.id 
WHERE pm.id =1;







	
```