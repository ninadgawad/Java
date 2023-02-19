package org.ninad.spring.app;

public class BasicThreadExample extends Thread{

    private int threadNumber;

    public BasicThreadExample(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i=1 ;i <= 100; i++){
            System.out.println(i+ " from Thread:"+threadNumber);
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){

            }

        }
    }
}

