
public class UglyNumbers_Uva136 {

	public static void main(String[] args) {

		int i=15;
		int uglyCount=11;
		
		
		while(uglyCount!=1500){
			i++;
			uglyCount+=isUgly(i);
		}
		
		
		System.out.println(i);

		
	}
	
	public static int isUgly(int n){
		
		while(n%2==0){
			n=n>>1;
		}
		
		while(n%3==0){
			n=n/3;
		}
		
		while(n%5==0){
			n=n/5;
		}
		
		if(n==1){
			return 1;
		}
		return 0;
	}

}
