package elc09.message;

import java.util.Scanner;

/**
 * https://mendo.mk/Task.do?id=4
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfMessages = Integer.parseInt(scanner.nextLine());
        EncryptedMessage[] encryptedMessages = new EncryptedMessage[numberOfMessages];

        for (int i = 0; i < numberOfMessages; i++) {
            String[] input = scanner.nextLine().split("\\s++");
            encryptedMessages[i] = new EncryptedMessage(input[0], input[1]);
        }

        for (int i = 0; i < numberOfMessages; i++) {
            System.out.println(encryptedMessages[i].isEncryptedCorrectly());
        }
    }
}
