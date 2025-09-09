package com.example.demo.Java17Feature;

public class Singleton {
   
    public static Singleton instance = new Singleton();

    private Singleton(){

    }

    public static  Singleton getInstance(){
        synchronized(Singleton.class){
        if(instance == null){
            instance = new Singleton();
        }
    }
        return instance;
    }
    


}
