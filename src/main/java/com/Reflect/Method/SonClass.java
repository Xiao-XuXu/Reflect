package com.Reflect.Method;

public class SonClass {
    public void publicMethodSonClass1(){
        System.out.println("子类无参公有方法");
    }
    public void publicMethodSonClass2(int a,double b){
        System.out.println("子类1个参数公有方法");
    }
    private void privateMethodSonClass1(){
        System.out.println("子类无参私有方法");
    }
    private void privateMethodSonClass2(int a,String c){
        System.out.println("子类2个参数私有方法");
    }
}
