package elc09.floors;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://mendo.mk/Task.do?id=2
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        Floor[] floors = new Floor[numberOfFloors];

        for (int i = 0; i < numberOfFloors; i++) {
            String[] floorInfo = scanner.nextLine().split("\\s++");
            floors[i] = new Floor(Integer.parseInt(floorInfo[0]), floorInfo[1]);
        }

        Arrays.sort(floors);

        for (int i = 0; i < numberOfFloors; i++) {
            if (floors[i].getWillBallBreak()) {
                System.out.printf("%d %d", floors[i - 1].getNumberOfFloor() + 1, floors[i].getNumberOfFloor() - 1);
                return;
            }
        }
    }
}
