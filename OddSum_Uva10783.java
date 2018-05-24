import java.util.Scanner;

public class OddSum_Uva10783 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int suma,a,b,cases;
		cases = input.nextInt();
		
		for(int i=0;i<cases;i++){
			suma=0;
			a=input.nextInt();
			b=input.nextInt();
			
			for(int j=a;j<=b;j++){
				if(j%2!=0){
					suma+=j;
				}
			}
			System.out.println("Case "+(i+1)+": "+suma);
		}
	}

}
