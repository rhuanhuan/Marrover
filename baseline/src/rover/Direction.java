package rover;

enum Direction {
    NORTH(0,1),
    EAST(1,0),
    SOUTH(0,-1),
    WEST(-1,0);


    private final int xArray;
    private final int yArray;

    Direction(int xArray, int yArray) {
        this.xArray = xArray;
        this.yArray = yArray;
    }

    public RoverPosition move(RoverPosition roverPosition) {
        return new RoverPosition(roverPosition.getX()+xArray,roverPosition.getY()+yArray);
    }

    public Direction turnLeft() {
        return values()[(this.ordinal()+3)%4];
    }

    public Direction turnRight() {
        return values()[(this.ordinal()+1)%4];
    }

}
