package Challenges;

public class LeftAllignPyramid {

	public static void main(String[] args) {
		/**
		 *    *
		 *    * *
		 *    * * *
		 *    * * * *
		 *    * * * * *
		 */
		int rows = 5;
		createLeftAllignPyramid(rows);
	}
	
	public static void createLeftAllignPyramid(int rows) {
		if(rows>0) {
			for(int i=1;i<=5;i++) {
				for(int j=0;j<i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}

}
