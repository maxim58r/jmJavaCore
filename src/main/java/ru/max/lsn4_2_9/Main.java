package ru.max.lsn4_2_9;

import ru.max.lsn4_2_8.RobotConnectionException;

public class Main {
    public static void main(String[] args) {

    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) throws Exception {
        int count = 3;
        while (count-- > 0) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                count = -1;
            } catch (RobotConnectionException rce) {
                if (count == 0) {
                    throw new RobotConnectionException("");
                }
            }
        }
    }
}