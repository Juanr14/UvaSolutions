
import java.math.BigInteger;
import java.util.Scanner;

public class JustTheFacts_Uva568 {

public static BigInteger facts[] = new BigInteger[10001];  
    
    
    public static void main(String[] args){
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        int number;
        String fact="";
        
        factorial(10000);
        while(input.hasNextInt()){
            number = input.nextInt();
            
           
             fact=facts[number].toString();
            for(int i=fact.length()-1;i>=0;i--){
                if(fact.charAt(i)!='0'){
                    System.out.printf("%5s -> ",number);
                    System.out.printf("%s\n",fact.charAt(i));
                    break;
                }
            }
        }
    }

    
    public static void factorial(int n){
       
        
        
        facts[0] = BigInteger.ONE;
        
        for(int i=1;i<=n;i++) 
        {
            facts[i] = BigInteger.valueOf(i).multiply(facts[i-1]) ;
        }
        
        
    }
}
