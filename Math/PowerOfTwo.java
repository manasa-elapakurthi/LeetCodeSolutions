package Math;
/**
 * ClassName   :PowerOfTwo
 * Description :The purpose of this class is to predict 
 *              whether the number is a power of 2
 * Author      :Manasa Elapakurthi
 */
public class PowerOfTwo {
	/**
	 * Perform bitwise AND operation on input number
	 * and 1 less than the input number
	 * @param  num the input integer 
	 * @return boolean value true if number power of 2 else false
	 */
	 public boolean isPowerOfTwo(int num) {
	  if((num > 0) && ((num & (num - 1)) == 0))
	   return true;
	  else 
	   return false;
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 PowerOfTwo obj = new PowerOfTwo();
	 for(int i=0;i<100;i++)
	  if(obj.isPowerOfTwo(i)) 
	   System.out.print(i+" ");
	}

}