package pacc;

public class find {
	/*输出:
	 * R_zero(4,1)
	 * 、R_left（3,1）、
	 * R_right（5,1）、
	 * R_up(4,0)、
	 * R_down(4,2)
*/
	int x=0;
	int y=0;
	
   void findZero(int array2d[][]){
		
		for (int row = 0; row < array2d.length; row++) {
			for (int colunm = 0; colunm < array2d[0].length; colunm++) {
				if (array2d[row][colunm]==0) {
					System.out.println("0的位置是："+"R_zero("+colunm+","+row+")");
				}
			}
		}
	}
  /* 左边*/
   void findleft(int array2d[][]){
		
		for (int row = 0; row < array2d.length; row++) {
			for (int colunm = 0; colunm < array2d[0].length; colunm++) {
				if (array2d[row][colunm]==0) {
					x=colunm;
					y=row;
					System.out.println("0的左边数组位置是："+"R_left("+(x-1)+","+(y)+")");
				}
			}
		}
	}
   /* 右边*/
   void findright(int array2d[][]){
		
		for (int row = 0; row < array2d.length; row++) {
			for (int colunm = 0; colunm < array2d[0].length; colunm++) {
				if (array2d[row][colunm]==0) {
					x=colunm;
					y=row;
					System.out.println("0的右边数组位置是："+"R_right("+(x+1)+","+(y)+")");
				}
			}
		}
	}
   /* 上面*/
   void findup(int array2d[][]){
		
		for (int row = 0; row < array2d.length; row++) {
			for (int colunm = 0; colunm < array2d[0].length; colunm++) {
				if (array2d[row][colunm]==0) {
					x=colunm;
					y=row;
					System.out.println("0上面数组位置是："+"R_up("+(x)+","+(y-1)+")");
				}
			}
		}
	}
   /* 下面*/
   void finddown(int array2d[][]){
		
		for (int row = 0; row < array2d.length; row++) {
			for (int colunm = 0; colunm < array2d[0].length; colunm++) {
				if (array2d[row][colunm]==0) {
					x=colunm;
					y=row;
					System.out.println("0下面数组位置是："+"R_down("+(x)+","+(y+1)+")");
				}
			}
		}
	}
}
