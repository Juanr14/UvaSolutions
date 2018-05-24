import java.util.Scanner;

public class InBraile_Uva12364 {

	public static void main(String[] args) {
	
		String[] row1 = new String[10];
		row1[1] = "*.";
		row1[2] = "*.";
		row1[3] = "**";
		row1[4] = "**";
		row1[5] = "*.";
		row1[6] = "**";
		row1[7] = "**";
		row1[8] = "*.";
		row1[9] = ".*";
		row1[0] = ".*";
		
		String[] row2 = new String[10];
		row2[1] ="..";
		row2[2] ="*.";
		row2[3] ="..";
		row2[4] =".*";
		row2[5] =".*";
		row2[6] ="*.";
		row2[7] ="**";
		row2[8] ="**";
		row2[9] ="*.";
		row2[0] ="**";
		
		Scanner input = new Scanner(System.in);
		String[] input1;
		String[] input2;

		while(input.hasNextLine() && !(input.nextLine()).equals("0")){
			if(input.nextLine().equals("S")){
				numberToBraile(row1,row2,input.nextLine());
			} else {
				input1=input.nextLine().split("\\s");
				input2=input.nextLine().split("\\s");
				input.nextLine();
				braileToNumber(row1,row2,input1,input2);
			}
		}
		
	}
	
	public static void braileToNumber(String[] row1, String[] row2, String[] input1, String[] input2) {
		for (int i = 0; i < input1.length; i++) {
			for (int j = 0; j < 10; j++) {
				if (input1[i].equals(row1[j])) {
					if(input2[i].equals(row2[j])){
						System.out.printf(""+j);
						break;
					}
				}
			}
		}
		System.out.println();
	}
	
	public static void numberToBraile(String[] row1,String[] row2, String line){
		String output1="";
		String output2="";
		String output3="";
		
		for(int i=0;i<line.length();i++){
			output1+=row1[Integer.parseInt(""+line.charAt(i))]+" ";		
			output2+=row2[Integer.parseInt(""+line.charAt(i))]+" ";	
			output3+=".. ";
			}
		
		System.out.println(output1.substring(0, output1.length()-1));
		System.out.println(output2.substring(0, output2.length()-1));
		System.out.println(output3.substring(0, output3.length()-1));
	}

}
