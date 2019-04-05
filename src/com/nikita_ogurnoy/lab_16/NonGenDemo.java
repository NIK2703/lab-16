package com.nikita_ogurnoy.lab_16;

public class NonGenDemo {
    NonGenDemo()
    {
        System.out.println("\nПример БЕЗ использования обобщений 1");

        NonGen iob = new NonGen(88);
        System.out.println("Тип объекта iob: " + iob.showType());
        int v = (Integer) iob.getOb();
        System.out.println("Значение int v: " + v);

        NonGen sob = new NonGen("Привет 2.");
        System.out.println("Тип объекта sob: " + sob.showType());
        String str = (String) sob.getOb();
        System.out.println("Значение String str: " + str);

        iob = sob;
        //v = (Integer) iob.getOb(); //ощшибка

    }
}
