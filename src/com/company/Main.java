package com.company;

import BoxPackage.Box;

public class Main {

    public static void main(String[] args) {

        Box box1 = new Box(5, 2, 3);
        Box box2 = new Box(1.2, 3, 4.5);
        Box box3 = new Box(1, 2, 3);
        Box box4 = new Box(3.4, 7.1, 2.2);
        Box box5 = new Box(5.3, 2, 6);

        double v1 = box1.volume();
        double v2 = box2.volume();
        double v3 = box3.volume();
        double v4 = box4.volume();
        double v5 = box5.volume();

        System.out.println("Volumes of Box1 is: " + v1 + "\nVolumes of Box2 is: " + v2 + "\nVolumes of Box3 is: " + v3 +
                "\nVolumes of Box4 is: " + v4 + "\nVolumes of Box5 is: " + v5);
    }
}
