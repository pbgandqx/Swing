package pac;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	while (true) {
		int a=sc.nextInt();
		if (a==1) {
			System.out.println("R("+(int)(Math.random()*100)+","+(int)(Math.random()*100)+")");
		}
		
	}
	
}
}
