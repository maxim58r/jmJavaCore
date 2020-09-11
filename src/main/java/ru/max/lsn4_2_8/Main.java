package ru.max.lsn4_2_8;

public class Main {
    public static void main(String[] args) {

    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) throws Exception {
        int count = 3;
        RobotConnection robotConnection = null;
        while (count-- > 0) {
            try {
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
            } catch (RobotConnectionException rce) {

            } finally {
                robotConnection.close();
            }
        }
    }
}
