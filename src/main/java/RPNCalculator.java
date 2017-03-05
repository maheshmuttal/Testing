import javax.naming.OperationNotSupportedException;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/**
 * Created by Maheshwar Muttal on 3/4/2017.
 */
public class RPNCalculator {
     public int doCalculation(String input) throws OperationNotSupportedException ,NoSuchElementException{
         StringTokenizer tokenizer = new StringTokenizer(input, ",");
         int result =0;
         while (tokenizer.hasMoreElements()) {

             int firstelemnt = Integer.valueOf(tokenizer.nextToken());
             int secondElement = Integer.valueOf(tokenizer.nextToken());
             String thirdElement = tokenizer.nextToken();
             if (thirdElement != null && (thirdElement.equalsIgnoreCase("+") || thirdElement.equalsIgnoreCase("-") ||
                     thirdElement.equalsIgnoreCase("*") || thirdElement.equalsIgnoreCase("/"))) {
                 switch (thirdElement) {
                     case "+":
                         result = secondElement + firstelemnt;
                         break;
                     case "-":
                         result = secondElement - firstelemnt;
                         break;
                     case "*":
                         result = secondElement * firstelemnt;
                         break;

                     case "/":
                         result = secondElement / firstelemnt;
                         break;
                 }
             } else {

                 throw new OperationNotSupportedException();
             }
         }
         return result;
     }
}
