package pacc;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int	array2d[ ][ ]={
		{1,2,3,4,5,6},
		{7,8,9,10,0,12},
		{8,8,9,10,11,12},
		{7,8,3,10,11,12},
		{88,66,92,102,151,999}
		};
		
	new find().findZero(array2d);
	new find().findleft(array2d);
	new find().findright(array2d);
	new find().findup(array2d);
	new find().finddown(array2d);
	}

}
