/* Project:			4.1.6 Print a random upper-case character 
 * Author:			Devin Smoot
 * Class: 			COMSC 1033
 * Date:			2015-11-1
 */
public class COMSC_1033_HW8 {
	public static void main(String[] args) {
		
		char letter = randomLetter();
		System.out.println(letter);
	}
	public static char randomLetter () {
		char result; // This will hold our randomly generated number for return.
		// Set integers to hold number range
		
		int startingValue = 65; // 'A' begins at 65
		int endingValue = 90 - startingValue + 1; // 'Z' is 90
		//System.out.println(startingValue); //Debug statement: View startingValue
		//System.out.println(endingValue); //Debug statement: View endingValue
		//randomNum (startingValue ,endingValue); //Debug statement: Call randomChar method
		//char letter = (char)randomNum(startingValue,endingValue);
		result = (char)(startingValue + Math.random()*endingValue);
		
		//System.out.println(randomNumber); //Debug statement: View randomNumber
		return result;
	}
}
