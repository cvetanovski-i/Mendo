package reg21.incomingvaccines;

import java.util.Scanner;

/**
 * https://mendo.mk/Task.do?id=902
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s++");
        int result = 0;

        for (String inputEntry : input) {
            result += Integer.parseInt(inputEntry) / 2;
        }

        System.out.println(result);
    }
}
