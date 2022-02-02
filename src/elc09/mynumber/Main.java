package elc09.mynumber;

import java.util.Scanner;

/**
 * https://mendo.mk/Task.do?id=3
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anaScore = 0;
        int stefanScore = 0;
        int anaHighestNumber = Integer.MIN_VALUE;
        int stefanHighestNumber = Integer.MIN_VALUE;

        int[][] numbers = new int[3][2];

        for (int i = 0; i < 3; i++) {
            String[] input = scanner.nextLine().split("\\s++");
            numbers[i][0] = Integer.parseInt(input[0]);
            numbers[i][1] = Integer.parseInt(input[1]);
        }

        for (int i = 0; i < 3; i++) {

            if (isDivisibleBySumOfDigits(numbers[i][0])) {
                stefanScore += 2;
                anaScore -= 1;

                if (numbers[i][0] > stefanHighestNumber) {
                    stefanHighestNumber = numbers[i][0];
                }
            }

            if (isDivisibleBySumOfDigits(numbers[i][1])) {
                anaScore += 2;
                stefanScore -= 1;

                if (numbers[i][1] > anaHighestNumber) {
                    anaHighestNumber = numbers[i][1];
                }
            }
        }

        winner(stefanScore, anaScore, stefanHighestNumber, anaHighestNumber);
    }

    public static boolean isDivisibleBySumOfDigits(int number) {
        int sumOfDigits = 0;
        for (int i = number; i > 0; i /= 10) {
            sumOfDigits += i % 10;
        }

        return number % sumOfDigits == 0;
    }

    public static void winner(int scoreStefan, int scoreAna, int highestNumberStefan, int highestNumberAna) {
        String winner;

        if (scoreStefan == scoreAna) {
            if (highestNumberStefan > highestNumberAna) {
                winner = "Stefan";
            } else {
                winner = "Ana";
            }
        } else {
            if (scoreStefan >= scoreAna) {
                winner = "Stefan";
            } else {
                winner = "Ana";
            }
        }

        System.out.printf("%d %d\n%s", scoreStefan, scoreAna, winner);
    }
}
