package com.nikita_ogurnoy.lab_16;

public class NonGen {
    Object ob;

    NonGen(Object o)
    {
        ob = o;
    }

    Object getOb()
    {
        return ob;
    }

    String showType()
    {
        return ob.getClass().toString();
    }
}
