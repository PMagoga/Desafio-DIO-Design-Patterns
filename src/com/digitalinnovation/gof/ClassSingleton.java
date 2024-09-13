package com.digitalinnovation.gof;

public class ClassSingleton {

    private static ClassSingleton instancia;
    public String value;

    // construtor da classe Singleton
    private ClassSingleton(String value){
        this.value = value;
    }

    public static ClassSingleton getInstance(String value){
        if (instancia == null) {
            instancia = new ClassSingleton(value);
        }
        return instancia;
    }
}
