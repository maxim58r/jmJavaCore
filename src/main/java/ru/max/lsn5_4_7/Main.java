package ru.max.lsn5_4_7;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Mike");
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(animal);


            ByteArrayInputStream bais = new ByteArrayInputStream();
            ObjectInputStream ois = new ObjectInputStream(bais);
            ois.read();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Animal[] deserializeAnimalArray(byte[] data) {

        return null;
    }
}
