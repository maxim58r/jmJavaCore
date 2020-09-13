package ru.max.lsn4_2_9;

/**
 * @author Serov Maxim
 */
public class RobotConnectionManager implements RobotConnection {

    @Override
    public RobotConnection getConnection() {
        return new RobotConnection() {
            @Override
            public void close() throws Exception {

            }

            @Override
            public RobotConnection getConnection() {
                return null;
            }

            @Override
            public void moveRobotTo(int toX, int toY) {

            }
        };
    }

    @Override
    public void moveRobotTo(int toX, int toY) {

    }

    @Override
    public void close() throws Exception {

    }
}
