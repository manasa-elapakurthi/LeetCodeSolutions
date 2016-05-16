package Math;
/**
 * ClassName   :PowerOfThree
 * Description :The purpose of this class is to predict 
 *              whether the number is a power of 3
 * Author      :Manasa Elapakurthi
 */
public class PowerOfThree {
	/**
	 * Check if the number is divisible by 3.Repeat
	 * this till the quotient value goes down to 1
	 * @param  num the input integer 
	 * @return boolean value true if num == 1 else false
	 */
     public boolean isPowerOfThree(int n) {
    	 if (n <= 0) return false;
         if (n == 1) return true;
         else if (n%3 == 0) return isPowerOfThree(n/3);
         else return false;
     }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 PowerOfThree obj = new PowerOfThree();
	 System.out.print(obj.isPowerOfThree(-3));

	}

}
