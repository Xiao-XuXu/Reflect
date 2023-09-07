package com.Reflect.Method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TEST {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException {
       Class c1= Class.forName("com.Reflect.Method.SonClass");
      /* Method[] methods=c1.getMethods();
       for (Method method:methods){
           System.out.println(method);
       }*/
       /* Method[] declaredmethods=c1.getDeclaredMethods();
        for(Method m:declaredmethods){
            System.out.println(m);
        }*/
        /*Method method=c1.getMethod("publicMethodSonClass2",int.class,double.class);
        System.out.println(method);*/
        Method method=c1.getDeclaredMethod("privateMethodSonClass2",int.class,String.class);
        method.setAccessible(true);
        //创建对象
        Object instance=c1.newInstance();
        try {
            //通过对象调用方法
            method.invoke(instance,33,"hello");
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
