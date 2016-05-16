package Math;
/**
 * ClassName   :NumberOf1Bits
 * Description :The purpose of this class is to calculate 
 *              the hamming weight of a given integer.
 * Author      :Manasa Elapakurthi
 */
public class NumberOf1Bits {
	/**
	 * Count the number of 1 bits for an input integer
	 * @param  n the input integer 
	 * @return integer value count
	 */
	 public int hammingWeight(int n) {
	   int count = 0;
	   while(n > 0){
		n &= n-1;
		count++;
	   }
	   return count;
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumberOf1Bits ob = new NumberOf1Bits();
		System.out.print(ob.hammingWeight(7));
	}

}
