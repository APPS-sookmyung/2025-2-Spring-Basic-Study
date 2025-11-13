### DDD
도메인 기반 개발
- 도메인 : in 프로그래밍) 사용자가 원하는 요구사항을 구현하는 기능을 묶는 덩어리. ~~ 서비스라 부름. 주관적 범위.

* 예) 쇼핑몰: 회원가입, 로그인, 마이페이지...=> [회원 서비스]/ 상품조회, 상품 등록, 상품 삭제...[상품 서비스]

product

ㄴ ProductController

ㄴ ProductService

ㄴ ProductRepository
...

### REST API URL 설계 규칙
톰캣이 만들어둔 localhost 8080에 먼저 방문
* /는 ~ 의 라는 것
- 상품 조회
: method = "GET"
http://locallhost:8080/product

- 상품 등록: method = "POST"