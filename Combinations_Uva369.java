import java.math.BigInteger;
import java.util.Scanner;

public class Combinations_Uva369 {

    public static void main(String[] args){
        // TODO Auto-generated method stub
        
        Scanner input = new Scanner(System.in);
        int n,m;
        
        n=input.nextInt();
        m=input.nextInt();
        BigInteger combination;
        BigInteger facts[]= new BigInteger[101];
        factorial(100,facts);
        
        while(n!=0 && m!=0){
            combination=facts[n].divide((facts[n-m].multiply(facts[m])));
            System.out.println(n+" things taken "+m+" at a time is "+combination+" exactly.");
          
            n=input.nextInt();
            m=input.nextInt();
        }
    }

    
public static void factorial(int n, BigInteger[] facts){
       
        
        
        facts[0] = BigInteger.ONE;
        
        for(int i=1;i<=n;i++) 
        {
            facts[i] = BigInteger.valueOf(i).multiply(facts[i-1]) ;
        }
        
        
    }
    
}
