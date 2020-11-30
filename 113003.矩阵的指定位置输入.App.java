package pac;

import java.util.Scanner;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array2d[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
		
		int row=sc.nextInt();
		int column=sc.nextInt();
		int value=sc.nextInt();
		
		array2d[row][column]=value;
		
//		输出
		for (int row01 = 0; row01 < array2d.length; row01++) {
			for (int column01 = 0; column01 < array2d.length; column01++) {
				System.out.print(array2d[row01][column01]+" ");
			}
			System.out.println();
		}


	}

}
