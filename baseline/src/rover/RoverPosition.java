package rover;

class RoverPosition {

    private int x;

    private int y;

    RoverPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String asString() {
        return x + " " + y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}
