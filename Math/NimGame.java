package Math;
/**
 * ClassName   :NimGame
 * Description :The purpose of this class is to predict 
 *              which player will win the nim game
 * Author      :Manasa Elapakurthi
 */
public class NimGame {
	/**
	 * Predict whether player 1 will win the game or not
	 * @param  numOfStones the input number of stones 
	 * @return boolean value true or false
	 */
	 public boolean canWinNim(int numOfStones){
		// The below logic is based upon the divisibility rule of 4
		 if(numOfStones <= 0) return false;
		 if(numOfStones%4 == 0) return false;
		 else
		  return true; 
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 NimGame gameObj = new NimGame();
	 if(gameObj.canWinNim(3)){
		 System.out.print("Player 1 wins");
     }
	 else
		 System.out.print("Player 2 wins");
	}

}
