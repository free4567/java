package sub07;

import java.security.PublicKey;

/*
 * 날짜 : 2022/09/28
 * 이름 : 홍길동
 * 내용 : 자바 총정리 연습문제
 */
class Bus {
	private String number;
	private int fee;
	?
	?
	?
	?
	?
	?
	
	public void Take(String name) {
		System.out.printf("%s은 %s버스를 탑니다.\n", name,number);
		System.out.printf("버스 요금은 %, d입니다.\n", fee);
	}	
}
	
class Subway {
	private String line;
	private int fee;
	
	?
	?
	?
	?
	
	public void Take (String name){
		System.out.printf("%s은 %s호선 지하철을 탑니다.\n", name, line);
		System.out.printf("지하철 요금은 %,d입니다.\n", fee);
	}
}

class User {
	private String name;
	private int age;
	
	?
	?
	?
	?
	
	public void takebus(????){
		bus.Take(name);
	}
	
	Public void takeSubway(????) {
		subway.Take(name);
	}	
}
public class Test03 {
	public static void main(String[] args) {
		User kim = new User("김유신", 24);
		User lee = new User("이순신", 34);
		
		Bus bus = new Bus("64", 1500);
		subway subway = new Subway("1", 1600);
		
		kim.takebus(bus);
		lee.takebus(subway);
	}
}
