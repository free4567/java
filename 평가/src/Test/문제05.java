package Test;

public class 문제05 {

	public static void main(String[] args) {
		for (int i=1; i<6; i++) {
			
			for (int j=5; j>0; j--) {
					System.out.print("☆");
				}
		        for(int k=1; k<=(i*2)-1; k++) {
		        	System.out.print("★");
		        }
		        for(int k=1; k<=(i*2)-1; k++) {
		        	System.out.print("☆");
		        }	
		        System.out.println();
		}
	}
}	
	