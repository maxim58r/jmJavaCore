package ru.max.lsn3_3_13;

public class Main {
    public static void main(String[] args) {
        System.out.println(-5);
        System.out.println(Math.abs(-5));
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int tempX = robot.getX() - toX;
        int tempY = robot.getY() - toY;

        if (tempX < 0) {
            if (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            } else {
                for (int i = 0; i < Math.abs(tempX); i++) {
                    robot.stepForward();
                }
            }
        }
        if (tempX > 0) {
            if (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            } else {
                for (int i = 0; i < Math.abs(tempX); i++) {
                    robot.stepForward();
                }
            }
        }
        if (tempY < 0) {
            if (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            } else {
                for (int i = 0; i < Math.abs(tempY); i++) {
                    robot.stepForward();
                }
            }
        }
        if (tempY > 0) {
            if (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            } else {
                for (int i = 0; i < Math.abs(tempY); i++) {
                    robot.stepForward();
                }
            }
        }
    }

    public class Robot {
        private int coordX;
        private int coordY;

        public Direction getDirection() {
            return Direction.DOWN;
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
