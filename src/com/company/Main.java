package com.company;

public class Main {

    public static void main(String[] args) {
	new Thread(){

        @Override
        public void run() {
            for(int i=0;i<1000;i++){
                System.out.println(Thread.currentThread().getName()+""+i);
            }

        }
    }.start();

        for (int i=0;i<1000; i++){
            System.out.println(Thread.currentThread().getName()+""+i);
        }
    }
}
