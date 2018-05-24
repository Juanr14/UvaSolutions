import java.math.BigInteger;
import java.util.Scanner;

public class LeapYear_Uva10070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		BigInteger year;
		BigInteger zero;
		
		while(input.hasNext()){
			year=input.nextBigInteger();
			zero = BigInteger.ZERO;

			if(year.mod(BigInteger.valueOf(400))==zero || 
			        (year.mod(BigInteger.valueOf(4))==zero && year.mod(BigInteger.valueOf(100))!=zero) ){
			    
				System.out.println("This is leap year.");
				
				if(year.mod(BigInteger.valueOf(15))==zero){
					System.out.println("This is huluculu festival year.");
				}
				if(year.mod(BigInteger.valueOf(55))==zero){
					System.out.println("This is bulukulu festival year.");
				}
			} else {
				if(year.mod(BigInteger.valueOf(15))==zero){
					System.out.println("This is huluculu festival year.");
				} else {
					System.out.println("This is an ordinary year.");
				}
			}
			if(input.hasNext()) System.out.println();
		}
	}

}
