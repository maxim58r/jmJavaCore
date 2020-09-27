package ru.max.lsn5_4_7;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Animal[] animals = {
//                new Animal("Mike"),
//                new Animal("Lion"),
//                new Animal("Shark")
//        };
//        byte[] buff = serializeAnimalArray(animals);
//        Animal[] objects = deserializeAnimalArray(buff);
//        for (Animal animal : objects) {
//            System.out.println(animal.getName());
//        }
        byte[] intermediate = null;
        try (
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(output)) {

            oos.writeInt(3);
            oos.writeObject(new Animal("Dog"));
            oos.writeObject(new Animal("Cat"));
            oos.writeObject(new Animal("Mouse"));

            output.flush();
            intermediate = output.toByteArray();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(intermediate));
        Animal[] animals = deserializeAnimalArray(intermediate);
        System.out.println(Arrays.toString(animals));


    }

    public static byte[] serializeAnimalArray(Object[] objects) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutput oos = new ObjectOutputStream(baos)) {
            oos.writeInt(objects.length);
            for (var o : objects) {
                oos.writeObject(o);
                oos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return baos.toByteArray();
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             ObjectInput oi = new ObjectInputStream(bais)) {
            int i = oi.readInt();
            Animal[] animals = new Animal[i];
            for (int j = 0; j < i; j++) {
                animals[j] = (Animal) oi.readObject();
            }
            return animals;
        } catch (Exception es) {
            es.printStackTrace();
           throw  new  java.lang.IllegalArgumentException();
        }
    }
}
