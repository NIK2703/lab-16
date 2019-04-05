package com.nikita_ogurnoy.lab_16;

public class Gen<T> {
    T ob;

    Gen(T o)
    {
        ob = o;
    }

    T getOb()
    {
        return ob;
    }

    String showType()
    {
        return ob.getClass().toString();
    }
}
