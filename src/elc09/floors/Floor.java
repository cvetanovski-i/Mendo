package elc09.floors;

public class Floor implements Comparable<Floor> {
    private int numberOfFloor;
    private boolean willBallBreak;

    public Floor(int numberOfFloor, String willBallBreak) {
        this.numberOfFloor = numberOfFloor;
        this.willBallBreak = formatWillBallBrake(willBallBreak);
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public boolean getWillBallBreak() {
        return willBallBreak;
    }

    private boolean formatWillBallBrake(String value) {
        return value.equals("DA");
    }

    @Override
    public int compareTo(Floor o) {
        return Integer.compare(numberOfFloor, o.numberOfFloor);
    }

    @Override
    public String toString() {
        return "Floor{" +
                "numberOfFloor=" + numberOfFloor +
                ", willBallBreak=" + willBallBreak +
                '}';
    }
}
