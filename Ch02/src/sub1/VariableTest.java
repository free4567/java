package sub1;

/*
* 날짜 : 2022/08/16
* 이름 : 이상헌
* 내용 : Java 변수 실습하기 교재
*
* 변수(VAriable)
* -데이터를 처리하기 위한 메모리 공간
* - 데이터 변경이 가능
* 
* 상수 (Contant)
*  - 데이터 변경이 불가능한 고정된 값을 갖는 변수
*/
    	public class VariableTest {
	
    	public static void main(String[] args) { 
		// 변수
		String hello = "Hello World";
		int a = 3;
		int b = 7;

		
		
		System.out.println("hello : " +hello);
		System.out.println( "a : " + a);
		System.out.println( "b : " + b);

		//상수
		int num = 5;
		num = 7;

		System.out.println("num : " + num);
	}

}

