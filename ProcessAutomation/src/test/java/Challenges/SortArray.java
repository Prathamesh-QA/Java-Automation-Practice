package Challenges;

public class SortArray {

	public static void main(String[] args) {
		
		int[] nums = {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
		sortArrayAscending(nums);
	}
	
	public static void sortArrayAscending(int[] nums) {
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i] > nums[j]){
					nums[i] = nums[i] + nums[j];
					nums[j] = nums[i] - nums[j];
					nums[i] = nums[i] - nums[j];
				}
			}
		}
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i] + " ");
		}
		
	}

}
