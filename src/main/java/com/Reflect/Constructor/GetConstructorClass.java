package com.Reflect.Constructor;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class GetConstructorClass {
    int age;
    double weight;
    String sex;
    public GetConstructorClass() {
    }

    public GetConstructorClass(int age, double weight, String sex) {
        this.age = age;
        this.weight = weight;
        this.sex = sex;
    }

    public static void main(String[] args) throws Exception{
        Class c1 = Class.forName("com.Reflect.Constructor.GetConstructorClass");

        //获取有参构造器，它们可能是私有的，如果是私有的需要设置可访问性
        Constructor constructor= c1.getDeclaredConstructor(int.class,double.class,String.class);
        constructor.setAccessible(true);
        //利用这个有参构造器创建对象，分配一个instance实例,这个类型是object，需要向下转型为GetConstructorClass
        GetConstructorClass instance= (GetConstructorClass) constructor.newInstance(18,176.3,"man");

        //获取对象的属性值需要用到Field类,和获取构造器的方式是一样的
        Field ageField=c1.getDeclaredField("age");
        Field weightField=c1.getDeclaredField("weight");
        Field sexField=c1.getDeclaredField("sex");
        //设置属性的可访问性，它们可能是私有的
        ageField.setAccessible(true);
        weightField.setAccessible(true);
        sexField.setAccessible(true);

        //通过这个创建的对象获取属性的值
        int ageValue=ageField.getInt(instance);
        double weightValue=weightField.getDouble(instance);
        String sexValue= (String) sexField.get(instance);
        System.out.println(ageValue);
        System.out.println(weightValue);
        System.out.println(sexValue);
    }
}
