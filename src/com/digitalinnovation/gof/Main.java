package com.digitalinnovation.gof;

public class Main {
    public static void main(String[] args) {
        // criando os objetos Singleton
        ClassSingleton singleton1 = ClassSingleton.getInstance("Instancia1");
        ClassSingleton singleton2 = ClassSingleton.getInstance("Instancia2");

        System.out.println(singleton1.value);
        System.out.println(singleton2.value);

    }
}
