package com.nikita_ogurnoy.lab_16;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2)
    {
        ob1 = o1;
        ob2 = o2;
    }

    String showTypes ()
    {
        return ob1.getClass().toString()+ " AND " + ob2.getClass().toString();
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }
}
