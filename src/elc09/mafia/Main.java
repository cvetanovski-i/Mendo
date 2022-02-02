package elc09.mafia;

import java.util.Scanner;

/**
 * https://mendo.mk/Task.do?id=5
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfNeighbours = Integer.parseInt(scanner.nextLine());
        int[] neighbours = new int[numberOfNeighbours];
        int average = 0;
        int result = -1;
        int resultToAverageOffset = Integer.MAX_VALUE;

        for (int i = 0; i < numberOfNeighbours; i++) {
            neighbours[i] = Integer.parseInt(scanner.nextLine());
            average += neighbours[i];
        }

        average /= numberOfNeighbours;

        for (int i = 0; i < numberOfNeighbours; i++) {
            int offset = Math.abs(neighbours[i] - average);
            if (offset < resultToAverageOffset) {
                resultToAverageOffset = offset;
                result = neighbours[i];
            }
        }

        System.out.println(result);
    }
}
