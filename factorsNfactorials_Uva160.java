import java.math.BigInteger;
import java.util.Scanner;

public class factorsNfactorials_Uva160 {

public static BigInteger array[] = new BigInteger[101];  
    
    
    public static void main(String[] args){
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        int count;
        int elements;
        factorial(101);
        BigInteger fact;
        BigInteger current;
        while(number!=0){
            
           System.out.printf("%3s! =",number); 
           fact = array[number]; 
           
           elements = 1;
           count = 0;
           while(fact.mod(BigInteger.valueOf(2))==BigInteger.ZERO){
               fact = fact.divide(BigInteger.valueOf(2));
               count++;
           }
           
           System.out.printf("%3s",count); 
           
           for(int i = 3;i<=number;i+=2) {
               count = 0;
               current = BigInteger.valueOf(i);
               while(fact.mod(current)==BigInteger.ZERO){
                   fact = fact.divide(current);
                   count++;
               }
               
               
               
               if(count!=0) {
                   elements++;
                   
                   if(elements == 16) {
                       System.out.print("\n      ");
                   }
                   
                   System.out.printf("%3s",count);
                   
               }
               
               
           }
           System.out.print("\n");
            number = input.nextInt();
        }
    }

    
    public static void factorial(int n){
       
        
        
        array[0] = BigInteger.ONE;
        
        for(int i=1;i<n;i++) 
        {
            array[i] = BigInteger.valueOf(i).multiply(array[i-1]) ;
        }
        
        
    }
    
    
}
