
import java.util.Scanner;

public class RSP {
	public static void main(String[] args) {		
		int num = (int) (Math.random() * 3) + 1;
		
		if(num == 1) System.out.println("컴퓨터 : 바위");
		else if(num == 2) System.out.println("컴퓨터 : 가위"); 
		else if(num == 3) System.out.println("컴퓨터 : 보");
				
		int i = 0;
		
		System.out.print("당 신 : ");
		
		Scanner sc = new Scanner(System.in);
		String us = sc.nextLine();
		
		if(us.equals("바위")) i = 1;
		else if(us.equals("가위")) i = 2;
		else if(us.equals("보")) i = 3;			
			
		int result = i - num;
		
		if(result == -1 || result == 2) System.out.println("결 과 : 당신이 이겼습니다.");
		else if(result == 1 || result == -2) System.out.println("결 과 : 당신이 졌습니다.");
		else if(result == 0) System.out.println("결 과 : 비겼습니다.");
	}
}