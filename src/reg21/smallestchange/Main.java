package reg21.smallestchange;

import java.util.Scanner;

/**
 * https://mendo.mk/Task.do?id=904
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s++");
        Integer[] candyPrices = {Integer.parseInt(input[0]),
                Integer.parseInt(input[1]),
                Integer.parseInt(input[2])};

        int cash = Integer.parseInt(input[3]);
        int[] result = {0, 0, 0};
        int[] bestResult = {0, 0, 0};

        int change;
        int bestChange = Integer.MAX_VALUE;
        for (int i = cash / candyPrices[0]; i >= 0; i--) {
            change = cash - i * candyPrices[0];
            result[0] = i;

            if (change < bestChange && change >= 0) {
                bestChange = change;
                bestResult = result.clone();

                if (bestChange == 0) {
                    printResult(bestResult, bestChange);
                    return;
                }
            }

            for (int j = change / candyPrices[1]; j >= 0; j--) {
                change = cash - (result[0] * candyPrices[0] + j * candyPrices[1]);
                result[1] = j;

                if (change < bestChange && change >= 0) {
                    bestChange = change;
                    bestResult = result.clone();
                }

                if (bestChange == 0) {
                    printResult(bestResult, bestChange);
                    return;
                }

                for (int q = change / candyPrices[2]; q >= 0; q--) {
                    change = cash - (result[0] * candyPrices[0] + result[1] * candyPrices[1] + q * candyPrices[2]);
                    result[2] = q;

                    if (change < bestChange && change >= 0) {
                        bestChange = change;
                        bestResult = result.clone();
                    }

                    if (bestChange == 0) {
                        printResult(bestResult, bestChange);
                        return;
                    }
                }
            }


        }

        printResult(bestResult, bestChange);
    }

    public static void printResult(int[] result, int change) {
        System.out.printf("%d\n%d %d %d", change, result[0], result[1], result[2]);
    }
}
