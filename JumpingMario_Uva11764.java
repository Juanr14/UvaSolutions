import java.util.Scanner;

public class JumpingMario_Uva11764 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		input.nextLine();
		int walls;
		String[] wallList;
		int high = 0, low = 0;

		for (int i = 0; i < cases; i++) {
			walls = input.nextInt();
			input.nextLine();
			wallList = input.nextLine().split("\\s+");
			for (int j = 0; j < walls - 1; j++) {
				if (Integer.parseInt(wallList[j]) > Integer.parseInt(wallList[j + 1])) {
					low++;
				}
				if (Integer.parseInt(wallList[j]) < Integer.parseInt(wallList[j + 1])) {
					high++;
				}

			}

			System.out.println("Case " + (i + 1) + ": " + high + " " + low);
			high = low = 0;
		}
	}

}
