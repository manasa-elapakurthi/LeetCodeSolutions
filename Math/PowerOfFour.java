package Math;
/**
 * ClassName   :PowerOfFour
 * Description :The purpose of this class is to predict 
 *              whether the number is a power of 4
 * Author      :Manasa Elapakurthi
 */
public class PowerOfFour {
	/**
	 * Check if the number is divisible by 4.Repeat
	 * this till the quotient value goes down to 1
	 * @param  num the input integer 
	 * @return boolean value true if num == 1 else false
	 */
	 public boolean isPowerOfFour(int num) {
    	 if (num <= 0) return false;
         while(num%4 ==0)
          num = num/4;
         return num == 1;
     }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PowerOfFour obj = new PowerOfFour();
		 System.out.print(obj.isPowerOfFour(16));

	}

}
