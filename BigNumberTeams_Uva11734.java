import java.util.Scanner;

public class BigNumberTeams_Uva11734 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
            
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        input.nextLine();
        String teamOut, judgeOut;
        
        
        for(int i = 1;i<=cases;i++) {
            teamOut = input.nextLine();
            judgeOut = input.nextLine();
            
            if (judgeOut.equals(teamOut)) {
                
                System.out.println("Case "+i+": Yes");
            } else {
                if(judgeOut.replaceAll("\\s", "").equals(teamOut.replaceAll("\\s", ""))) {
                    System.out.println("Case "+i+": Output Format Error");
                } else {
                    System.out.println("Case "+i+": Wrong Answer");
                }
            }
            
        }
        
  
 
        
        
        
        
    }

}
