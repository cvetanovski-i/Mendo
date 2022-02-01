package reg21.dogyears;

import java.util.Scanner;

/**
 * https://mendo.mk/Task.do?id=903
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        int[] dogToHumanYearRatio = {15, 9, 4, 5};
        int result = 0;

        for (int i = 1; i <= input; i++) {
            if (i == 1) {
                result += dogToHumanYearRatio[0];
            } else if (i == 2) {
                result += dogToHumanYearRatio[1];
            } else if (i >= 3 && i <= 6) {
                result += dogToHumanYearRatio[2];
            } else {
                result += dogToHumanYearRatio[3];
            }
        }

        System.out.println(result);
    }
}
