import java.util.Scanner;

public class CandleBox_Uva13161 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ritaBox; 
		int theoBox;
		
		int ritaAge=4;
		int theoAge=3;
		
		int ritaCandles;
		int theoCandles;
		
		int ageDifference;
		boolean solved;
		
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			
			solved = false;
			
			ageDifference = input.nextInt();
			ritaBox = input.nextInt();
			theoBox = input.nextInt();
			
			ritaCandles=0;
			theoCandles=0;
			
			ritaAge=4;
			theoAge = 4 - ageDifference; 
			
			
			while(!solved){
				
				ritaCandles += ritaAge;
				
				if(theoAge>=3){
					theoCandles += theoAge;
				}
				
				if((ritaBox - ritaCandles)==(theoCandles - theoBox)){
					System.out.println((ritaBox - ritaCandles));
					solved=true;
				}
				
				ritaAge++;
				theoAge++;
			}
			
		}
		
		
		
	}

}
