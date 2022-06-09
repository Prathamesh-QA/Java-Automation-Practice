package Challenges;

public class RotateRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,20,30,40,50};
		int rotation = 3;
		rotate(nums, rotation);
	}
	
	public static void rotate(int[] nums,int rotation) {
		int[] rotatedNums = new int[nums.length];
		
		for(int i=0;i<rotatedNums.length;i++) {
			int move = (i + rotation) % nums.length;
			rotatedNums[move] = nums[i];
		}
		//printing number
		for(int i=0;i<rotatedNums.length;i++) {
			System.out.print(rotatedNums[i] + " ");
		}
	}

}
