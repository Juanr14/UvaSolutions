import java.util.Scanner;

public class CellularAutomata_Uva467 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();

        String symbol[] = { " ", ".", "x", "W" };
        int DNA[] = new int[10];
        int dish[];
        int sum;
        int nextDish[] = new int[40];
        int density = 0;

        for (int current = 1; current <= cases; current++) {

            input.nextLine();
            input.nextLine();

            if (current > 1) {
                System.out.println("");
            }

            // Llenar el plato inicialmente
            dish = new int[40];
            dish[19] = 1;

            // Llenar DNA
            for (int i = 0; i < DNA.length; i++) {
                DNA[i] = input.nextInt();
            }

            // Imprimir primer dia
            for (int i = 0; i < dish.length; i++) {
                density = dish[i];
                System.out.print(symbol[density]);
            }

            System.out.print("\n");
            // Paso de los días
            for (int i = 1; i < 50; i++) {

                // Platos de los extremos
                sum = dish[0] + dish[1];
                nextDish[0] = DNA[sum];
                sum = dish[39] + dish[38];
                nextDish[39] = DNA[sum];

                // Platos restantes

                for (int j = 1; j < 39; j++) {
                    sum = dish[j - 1] + dish[j] + dish[j + 1];
                    nextDish[j] = DNA[sum];
                }

                // Imprimir cada dia restante
                for (int j = 0; j < dish.length; j++) {
                    density = nextDish[j];
                    System.out.print(symbol[density]);
                }

                System.out.print("\n");

                System.arraycopy(nextDish, 0, dish, 0, nextDish.length);
            }

        }

    }

}
