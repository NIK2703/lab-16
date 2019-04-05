package com.nikita_ogurnoy.lab_16;

import java.util.ArrayList;

public class GenDemo {

    GenDemo() {
        System.out.println("\nПример использования обобщений 1");

        Gen<Integer> iob = new Gen<Integer>(99);
        Gen<String> sob = new Gen<String>("Привет.");

        System.out.println("iob является объектом типа " + iob.showType() + ".  Его значение: " + iob.getOb());
        System.out.println("sob является объектом типа " + sob.showType() + ".  Его значение: " + sob.getOb());
    }
}
