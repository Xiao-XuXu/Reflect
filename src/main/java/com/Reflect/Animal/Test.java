package com.Reflect.Animal;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
/*        //父类引用指向子类对象
        Animal animal1=new Cat();
        Animal animal2=new Dog();

        animal1.makeSound();
        animal2.makeSound();*/

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        Class c1= classLoader.loadClass("com.Reflect.Animal.Dog");
        System.out.println(c1);


    }
}
