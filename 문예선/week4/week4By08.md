`Tomcat initialized with port 8080 (http)`
### 톰캣
인터넷 세상에 공간(웹 서버) 만들어줌. 그 공간의 기반은 로컬 환경
### 포트
- 서버에 들어오는 입구들
- 제공하는 서비스 구분을 위해 각 서비스 별로 달라짐.
### @Controller
이 클래스는 컨트롤러로 쓸 거야! 아래 친구들이랑 같이!(컴포넌트를 포함한 어노테이션)
- @RequestMapping: 사용자가 요청하면 이 메소드 줄 거야
- handler method

- 핸들러? : 사용자의 요청에 의해 자동으로 호출되는 메소드/ 일반 메소드는 개발자의 요청에 의해 호출됨.

### http
#### 요청할 때의 약속
- 알고 있는 주소로 가고싶어요 => 주소 = URL
- 왜 가냐면요 => 조회, 수정, 삭제..... => 목적 = Method (엥)
##### http 메소드 종류
1. 조회 : GET
2. 삽입/등록/생성 : POST
3. 수정 : PUT(전체 수정)
4. 삭제 : DELETE
*CRUD
#### 응답가져갈 때의 약속
- http response
1. Body에 데이터 담아줌.
##### RestController 
http를 잘 지키는 컨트롤러
@ResponseBody 가 포함됨.
