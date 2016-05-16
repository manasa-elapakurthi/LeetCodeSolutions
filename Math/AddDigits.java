package Math;
/**
 * ClassName   :AddDigits
 * Description :The purpose of this class is to add all 
 *              the digits of a given input number
 * Author      :Manasa Elapakurthi
 */
public class AddDigits {
	/**
	 * Adds all the digits present in the input number
	 * @param  num the input number 
	 * @return int sum value all digits
	 */
	 private int addDigits(int num){
		// The below logic is based upon the divisibility rule of 9
		 if(num == 0) return 0;
		 if(num <= 9) return num;
		 else
		  return num%9; 
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 AddDigits ad = new AddDigits();
	 System.out.print(ad.addDigits(38));
    }
}
