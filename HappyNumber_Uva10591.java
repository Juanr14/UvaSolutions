import java.util.Scanner;

public class HappyNumber_Uva10591 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		int number;
		int sumValue=0;
		String sum="";
		for(int i =0;i<cases;i++){
			number=input.nextInt();
			sum=""+number;
			
			while(sumValue!=1){
				sumValue=0;
				for(int j=0;j<sum.length();j++){
					sumValue+=Integer.parseInt(sum.charAt(j)+"")*Integer.parseInt(sum.charAt(j)+"");
				}
				sum=Integer.toString(sumValue);
				if(sum.length()==1 && sumValue!=1){
					break;
				}
			}
			if(sumValue==1){
				System.out.println("Case #"+(i+1)+": "+number+" is a Happy number.");
			}else {
				System.out.println("Case #"+(i+1)+": "+number+" is a Unhappy number.");
			}
			
			sumValue=0;
		}
		
		
	}

}
