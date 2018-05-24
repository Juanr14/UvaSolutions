import java.util.Scanner;

public class F91_Uva10696 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		int number;

		
		while((number=input.nextInt())!=0){
			
			System.out.println("f91("+number+") = "+f91(number));
			
		}

		
	}
	
	public static int f91(int n){
		
		if(n<=100){
			return f91(f91(n+11));
		}else{
			return n-10;
		}
		
	}

}
