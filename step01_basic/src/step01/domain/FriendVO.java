//한라인 주석
/* 블록 단위의 주석
 * 1. 데이터를 자바 언어로 표현하는 방법 연습
 * 2. 데이터 = 자바 관점(변수)
 * 3. 로직
 * 		1. 친구들 정보를 프로그램화
 * 			- 이름(문자열, String)
 * 			- 거주지(문자열, String)
 * 			- 나이(정수, int)
 * 		2. 수정,저장,삭제
 * 4. 고려 사항
 * 		1. 친구들이 몇명?
 * 5. 필수 암기 사항
 * 	1. 데이터 생성/삭제/수정/검색
 * 		 create/delete/update/select
 * 	2. CRUD[씨알유디]
 * 			C[create]/R[select]/U[update]/D[delete]
 * 6. 문법
 * 	1. class 선언구
 *  2. 변수 선언, 변수 호출(사용)
 * 		타입 변수명 [= 데이터];
 *  3. 객체 생성
 *  	- 클래스는 객체가 아님
 *  	- 메모리에서 실제 사용 가능한 구조는
 *  		데이터들을 보유한 메모리 점유
 *  		이 메모리는 수정, 삭제등이 가능
 *  	- 문법
 *  		FriendVO p1 = new FriendVO()
 *  7. 생성자
 *  	1. 객체(instance)를 생성하게 하는 유일한 
 *  		구성요소 
 *  	2. 모든 클래스에 무조건 존재
 *  		- 개발자가 미코딩시 컴파일 시점에 자동생성
 *  		- 단, 필요에 의해서 코드로 개발해 놓은 
 *  		   생성자 존재시 컴파일러는 절대 자동추가 
 *  		   하지 않음
 *  
 *  8. 학습내용
 *  	1. 클래스 구현 방법
 *  	2. 변수 선언 방법
 *  	3. 객체 생성 문법 방법
 *  	4. 여러개의 클래스로 구분하는 방법
 *  	5. import
 *  	6. public
 *  	7. 실제 메모리에 생성해서 사용 가능한
 *  		객체는 instance 라고 함
 *  	8. 생성자
 *  		- 생성자의 () 용도
 *  		- ()안에 선언된 변수들 지칭 용어
 *  			- 매개변수, argument,
 *  			 parameter..
 */
package step01.domain;
	
public class FriendVO {
	public String name = "황인범";
	public String cellPhone = "000-0000-0000";
	public int age = 27;
	
	//생성자
	public FriendVO() {}
	//멤버 변수값 새로 대입하는(초기화) 생성자 
	//3개의 데이터를 받아서 멤버 변수에 대입
	public FriendVO(String n, String c, int a) {
		name = n;
		cellPhone = c;
		age = a;
	}

}















