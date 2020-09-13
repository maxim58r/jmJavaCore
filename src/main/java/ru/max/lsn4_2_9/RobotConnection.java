package ru.max.lsn4_2_9;

/**
 * @author Serov Maxim
 */
public interface RobotConnection extends AutoCloseable {
    RobotConnection getConnection();

    void moveRobotTo(int toX, int toY);
}
