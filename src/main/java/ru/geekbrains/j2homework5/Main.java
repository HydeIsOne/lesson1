package ru.geekbrains.j2homework5;


import java.util.Arrays;

public class Main {
    private static final int size = 10000000;
    private static final int h = size / 2;

    public static void main(String[] args){
        Main main = new Main();
        main.methodOne();
        main.methodTwo();
    }

    private void methodOne(){
        System.out.println("Старт метода 1");
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);
        long a = System.currentTimeMillis();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Метод 1 завершен за " + (System.currentTimeMillis() - a));
    }

    private void methodTwo(){
        System.out.println("Старт метода 2");
        float[] arr = new float[size];
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        Arrays.fill(arr, 1.0f);
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr, 0, h);
        long split = System.currentTimeMillis();
        System.out.println("Время разделения массива " + (split - a));

        Thread thread1 = new Thread(() ->this.methodTwoInternal(arr1, 1));
        Thread thread2 = new Thread(() ->this.methodTwoInternal(arr2, 2));

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            System.out.println(String.format("Исключение в потоках. %s", e.getMessage()));
        }


        long connect = System.currentTimeMillis();
        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        long end = System.currentTimeMillis();
        System.out.println("Время выполнения склейки массива " + (end - connect));
        System.out.println("Метод 2 завершен за " + (end - a));
    }

    private void methodTwoInternal(float[] arr, int number){
        long a = System.currentTimeMillis();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long end = System.currentTimeMillis();
        System.out.println(String.format("Время выполнния потока %d равно %s", number, (end - a)));
    }
}