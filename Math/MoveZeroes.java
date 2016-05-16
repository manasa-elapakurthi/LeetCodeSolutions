package Math;
/**
 * ClassName   :MoveZeroes
 * Description :The purpose of this class is to shift all 
 *              the zeroes to the end of the given input array
 * Author      :Manasa Elapakurthi
 */
public class MoveZeroes {
	/**
	 * Shift all the zeroes to the end of the array
	 * @param  nums the input integer array 
	 */
	 public void moveZeroes(int[] nums) {
	   int count = 0, len=nums.length;
	   for(int i=0;i<len;i++){
		if(nums[i] != 0) {
		  nums[count++]=nums[i];
		}
	   }
	   while(count < len){
	    nums[count++]=0;
	   }
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 int[] nums = {0,1,0,3,0};
	 MoveZeroes numObj = new MoveZeroes();
	 numObj.moveZeroes(nums);
	 for(int i=0;i<nums.length;i++)
		 System.out.print(nums[i]);
	}

}
