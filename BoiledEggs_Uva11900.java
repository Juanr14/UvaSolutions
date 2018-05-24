import java.util.Scanner;

public class BoiledEggs_Uva11900 {
    
    static int weights[];
    static int maxW; //Max weight supported
    static int elements;
    static int risk; //Max elements in the bowl
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner (System.in);
        
        int cases = input.nextInt();
       

        for(int i = 1;i<cases+1;i++) {
            elements = input.nextInt();
            risk = input.nextInt();
            maxW = input.nextInt();
            weights = new int[elements];
            
            
            for(int j = 0; j<elements;j++) {
                weights[j] = input.nextInt(); //Create the vector of weights
            }
            
            System.out.println("Case "+i+": "+max_weight(0,0,0));
            
        }

    }

    private static int max_weight(int pos, int currentW, int currentE) {
       
        if(currentE == risk) { //Max number of elements reached
            return currentE;
        }
        
        
        
        if(pos >=elements) {//Last position of the given elements reached 
            return currentE;
        }
        
        
        if(currentW+weights[pos]>maxW) { //The item is too heavy
            return currentE;
        }
        
        
        int temp1 = max_weight(pos+1,currentW+weights[pos],currentE+1);//Insert the current element
        
        int temp2 = max_weight(pos+1,currentW,currentE);//not insert the element
        
        return Math.max(temp1,temp2);
               
        
    }

}
