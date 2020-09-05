package ru.max.lsn3_3_13;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        moveRobot(robot, 10, 12);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int tempX = toX - robot.getX();
        int tempY = toY - robot.getY();

        if (tempX < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            for (int i = 0; i < Math.abs(tempX); i++) {
                robot.stepForward();
            }
        }
        if (tempX > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
            for (int i = 0; i < Math.abs(tempX); i++) {
                robot.stepForward();
            }
        }
        if (tempY < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            for (int i = 0; i < Math.abs(tempY); i++) {
                robot.stepForward();
            }
        }
        if (tempY > 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            for (int i = 0; i < Math.abs(tempY); i++) {
                robot.stepForward();
            }
        }
    }


    public static class Robot {
        private int coordX = 0;
        private int coordY = 0;

        public Direction getDirection() {
            return Direction.UP;
        }

        public int getX() {
            return coordX;
        }

        public int getY() {
            return coordY;
        }

        public void turnLeft() {
            // повернуться на 90 градусов против часовой стрелки
        }

        public void turnRight() {
            // повернуться на 90 градусов по часовой стрелке
        }

        public void stepForward() {
            if (getDirection() == Direction.UP) {
                coordY++;
            }
            if (getDirection() == Direction.DOWN) {
                coordY--;
            }
            if (getDirection() == Direction.RIGHT) {
                coordX++;
            }
            if (getDirection() == Direction.LEFT) {
                coordX--;
            }
            // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
        }
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
}
