package rover;

import java.util.Arrays;
import java.util.List;

class MarsRover {
    private static final List<String> VALID_COMMANDS = Arrays.asList("L", "R", "M");

    private Direction direction;
    private RoverPosition position;


    MarsRover(RoverPosition roverPosition, Direction direction) {
        this.position = roverPosition;
        this.direction = direction;
    }

    String run(String input) {
        String[] commands = convertInputIntoCommands(input);

        for (String command : commands) {
            if (command.equals("M")) {
                position = direction.move(position);
            } else if (command.equals("R")) {
                direction = direction.turnRight();
            } else if (command.equals("L")) {
                direction = direction.turnLeft();
            }
        }
        return asString();
    }

    private String asString() {
        return position.asString() + " " + direction.toString();
    }



    private static String[] convertInputIntoCommands(String input) {
        String[] commandArray = input.split("(?!^)");

        validateCommands(input, commandArray);

        return commandArray;
    }

    private static void validateCommands(String input, String[] commandArray) {
        for (String command : commandArray) {
            if (!VALID_COMMANDS.contains(command)) {
                throw new IllegalArgumentException("Invalid command sequence: " + input);
            }
        }
    }


}
