package finalexam.src;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public static int add(final String numbers) {
       int returnValue = 0;
       String[] numbersArray = numbers.split(",|\n"); 
       List negNumbers = new ArrayList(); 
       for (String number : numbersArray) {
          if (!number.trim().isEmpty()) {
             int num = Integer.parseInt(number.trim());
             if (num < 0) { 
               negNumbers.add(num); 
             } 
             if (Integer.parseInt(number) > 1000) {
               continue; 
             }
             returnValue += num;
          }
       }
       if (negNumbers.size() > 0) { 
            throw new RuntimeException("negatives not allowed.");
       }
       return returnValue;
    }
 }