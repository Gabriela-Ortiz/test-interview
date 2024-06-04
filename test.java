//Gabriela Ortiz Vargas
package interview;

import java.util.Map;
import java.util.HashMap;

public class test {

//convert a roman number in an integer number
	
	public static int romanToInt() {
			
		//input
		
		String input = "CLVII"; //153
		//String input = "IV" //4
	
		int result = 0;
		
		//Define a map which help us to associate thought the key-value assignment the Roman number with the integer number by itself
	        Map<Character, Integer> romanNumber= new HashMap<>();
	        romanNumber.put('I', 1);
	        romanNumber.put('V', 5);
	        romanNumber.put('X', 10);
	        romanNumber.put('L', 50);
	        romanNumber.put('C', 100);
	    
			
	        for (int i = 0; i < input.length(); i++) { //defining interval to know how many characters should be read, in this case 4
	        
	            int initialValue = romanNumber.get(input.charAt(i)); //this function gets the value in the map for the corresponding key or roman symbol
	        	//for example 
	            //position input[0] = C -> 100
	                
	            /// this second value helps to define a range to compare the current number obtained
	            //with the second position (in case the input have more than one character)
	            int finalValue = (i + 1 < input.length()) ? romanNumber.get(input.charAt(i + 1)) : 0;
	            //if the next position is lower than the array size, then get the next value associated in the map otherwise set 0
	            //position input[1] = L -> 50
	            
		            
	            if (initialValue < finalValue) { // if the first number is lower than the next one it means a negative number will be 
	            
	                result = result - initialValue; // Subtract the second value       
	                
	            } else {
	                // add the initial value //  100 > 50 
	                result = result + initialValue;  //result = result + 100 -> 100
	                
	                /* it will happen with the next values, until now we got 100
	                	in the next execution we will have 50 > 4 so 100 + 50
	                 in the last execution we will have 3 > 0 so 150 + 3 = 153 */
	                
	                
	                /* On the other hand if the input would be for example: IV, the execution will be the next:
	                	the initial value will be 1 and the final 5 so, at the fist validation 
	                	1 < 5 so the substraction will run then result = -1
	                	for the next execution the initial value is 5 and the final is 0 so 5 > 0 then the addition will be implemented
	                	result = -1 + 5 = 4
	                	finalResult = 4
	                */
	                        
	            }
	    }
	           
	    return result;  // return the integer number
	}

	public static void main(String[] args) {
	    
	    System.out.println("Final Result " + romanToInt());
	}
     
}
