package com.Reflect.Field;

import java.lang.reflect.Field;

public class TEST {
    public static void main(String[] args) throws Exception{
       Class c3= Class.forName("com.Reflect.Field.sonClass");

       Field field=c3.getField("publicSonField");

       Object instance=c3.newInstance();
       field.set(instance,"private");
       System.out.println("新的公有属性值："+field.get(instance));

        /*Field field2=c3.getDeclaredField("privateSonField");
        System.out.println(field2);*/

    }
}
