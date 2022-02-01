package elc09.powerfulartifact;

import java.util.Scanner;

/**
 * https://mendo.mk/Task.do?id=1
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfSorcerers = Integer.parseInt(scanner.nextLine());
        int[] sorcerers = new int[numberOfSorcerers];
        int result = 0;

        for (int i = 0; i < numberOfSorcerers; i++) {
            sorcerers[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int sorcerer : sorcerers) {
            numberOfSorcerers--;
            numberOfSorcerers -= sorcerer;
            result++;

            if (numberOfSorcerers <= 0) {
                System.out.println(result);
                return;
            }
        }
    }
}
