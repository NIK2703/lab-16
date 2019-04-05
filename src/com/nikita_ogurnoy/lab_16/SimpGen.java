package com.nikita_ogurnoy.lab_16;

public class SimpGen {

    SimpGen()
    {
        System.out.println("\nПример с использованием обощений из двух типов.");

        TwoGen<Integer, String> tg = new TwoGen<Integer, String>(103, "Привет 3.");
        System.out.println("Типы объектов в TwoGen:" + tg.showTypes());
        System.out.println("Значение объекта Integer из TwoGen: " + tg.getOb1());
        System.out.println("Значение объекта String из TwoGen: " + tg.getOb2());
    }

}
