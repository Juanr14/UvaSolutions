
import java.util.Scanner;

public class ReverseAndAdd_Uva10018{

    public static void main(String[] args) {
    	
        Scanner file = new Scanner(System.in);
        int cases = Integer.parseInt(file.nextLine());

        String number;
        String palindrome;
        int iterations = 0;

        boolean found;
        for (int i = 0; i < cases; i++) {
            found = false;
            number = file.nextLine();
            while (!found) {

                palindrome = reverse(number);

                number = "" + ((Long.parseLong(number)) + Long.parseLong(palindrome));
                if (number.equals(reverse(number))) {
                    found = true;
                }
                iterations++;
            }

            System.out.println(iterations + " " + number);
            iterations = 0;
        }

    }

    public static String reverse(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }
        return reversed;
    }

}

