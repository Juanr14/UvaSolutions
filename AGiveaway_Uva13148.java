import java.util.Scanner;

public class AGiveaway_Uva13148 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int num;
		double sqrt,cbrt;
		
		while((num=input.nextInt())!=0){
			sqrt=Math.sqrt(num);
			cbrt=Math.cbrt(num);
			
			if(sqrt%1==0 && cbrt%1==0){
				System.out.println("Special");
			} else {
				System.out.println("Ordinary");
			}
			
			
		}

	}

}
