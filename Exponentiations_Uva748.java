import java.math.BigDecimal;
import java.util.Scanner;

public class Exponentiations_Uva748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String numbers[]=new String[2];
		String text;
		BigDecimal exp;
		int low;
		
		while(input.hasNextLine()){
			numbers=input.nextLine().trim().split("\\s+");
		
			
			exp = new BigDecimal(numbers[0]);
			
			exp=exp.pow(Integer.parseInt(numbers[1])).stripTrailingZeros();
			text=exp.toPlainString();
			
			low=0;
			
			while(text.charAt(low)=='0'){
				low++;
				
			}
	
			System.out.println(text.substring(low));
		}
		
		
		
	}

}
