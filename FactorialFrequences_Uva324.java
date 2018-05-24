
import java.math.BigInteger;
import java.util.Scanner;

public class FactorialFrequences_Uva324 {

    public static void main(String[] args){
        // TODO Auto-generated method stub
        
        Scanner input = new Scanner(System.in);
        int digits[];
        int number=Integer.parseInt(input.nextLine());
        BigInteger facts[]= new BigInteger[367];
        String factorialN;
        String output="";
        
        factorial(366,facts);

        while(number!=0){
        digits  = new int[10];
        factorialN=facts[number].toString();  
        output+=number+"!  --\n";
        for(int i=0;i<factorialN.length();i++){
            digits[Integer.parseInt(factorialN.charAt(i)+"")]++;
            
        }
        
        
        for(int i=0;i<9;i++) {
            
            output += "("+i+")  "+digits[i]+" ";
            
            if(i==4) output+="\n";
        }
        
        output+="("+9+")  "+digits[9];
   
        System.out.println(output);
        output="";
        number=Integer.parseInt(input.nextLine());
        
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
    
    


