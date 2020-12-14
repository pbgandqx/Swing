package pac;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		for (int i = 0; i <=2147483647; i=i+2) {
			sum=sum+i;
		}
		System.out.println("1+3+5+7+...+2147483647="+sum);
	}

}
