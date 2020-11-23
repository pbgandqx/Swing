package pac;

public class App02 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int arr[][]={
				{200,300},
				{400,500},
				{600,700},
				{800,900},
		};
		while (true) {
			Thread.sleep(2000);
			System.out.println("这是一个新的二维坐标！");
			int rdm=(int)(Math.random()*10%4);
			System.out.println(arr[rdm][0]+","+arr[rdm][1]);
		}
	}

}
