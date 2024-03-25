public class NumberProgram { 
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = 0; 
    int count = 0;
    int maxValue = 0;
    int minValue = 0;
   
    
    
    System.out.print("Enter any number to continue. Enter 0 to stop.");
  
    num = scan.nextInt();

  
    while (num != 0) {
        
        count ++;
      int average = count / num;
     
    if (num > maxValue) {
    maxValue = num;
     } 
      
    if (num < minValue) {
    minValue = num;
     } 
    }

    System.out.printf("The total from the numbers you entered is" , count);
    System.out.printf("the average of the numbers you entered is" , average); 
    System.out.printf(" the minimum numer you entered was", minValue );
    System.out.printf("the max number you entered was" , maxValue ); 
} 
} 