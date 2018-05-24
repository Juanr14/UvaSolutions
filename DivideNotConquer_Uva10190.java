import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DivideNotConquer_Uva10190 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(new File("cases.txt"));
		
		int n;
		int m;
		
		while(input.hasNext()){
			n=input.nextInt();
			m=input.nextInt();
			divide(n,m);
		}
	}
	
	public static void divide(int n,int m){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		boolean isBoring=false;
	
		if(n<2 || m<2 || n<m || n%m!=0){
			System.out.println("Boring!");
			return;
		}
		
		
		while(n>1){
			if(n%m!=0){
				isBoring=true;
			}else{
				numbers.add(n);
			}
			n/=m;
		}
		
		if(isBoring){
			System.out.println("Boring!");
		} else{
			for(int i=0;i<numbers.size();i++){
				System.out.print(numbers.get(i)+" ");
			}
			System.out.println(1);
		}
		
	}

}
