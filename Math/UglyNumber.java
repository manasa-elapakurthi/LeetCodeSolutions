package Math;
/**
 * ClassName   :UglyNumber
 * Description :The purpose of this class is to predict 
 *              whether the number is ugly or not
 * Author      :Manasa Elapakurthi
 */
public class UglyNumber {
	/**
	 * Check if number is ugly or not by computing
	 * the modulus operation on 2,3,5 in repetition
	 * @param  num the input number 
	 * @return boolean value true if num == 1 else false
	 */
	 public boolean isUglyNumber(int num) {
	  if(num <=0) return false;
	  int[] primeFactors = {2,3,5};
	  for(int factor : primeFactors){
	   while(num%factor==0)
		num = num/factor;
	  }
	  return num == 1;
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UglyNumber obj = new UglyNumber();
		for(int i=1;i<=20;i++)
		 if(obj.isUglyNumber(i))
		  System.out.print(i+" ");

	}

}
