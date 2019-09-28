package com.example.login.phixtre.ticket;

public class Ticket extends Thread {
//public class Ticket implements Runnable {
    private static int tick = 100;

    public void run() {
        while (true) {
            synchronized(Ticket.class){
                show();
            }
        }
    }

    public synchronized void show() {
        if (tick > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name = Thread.currentThread().getName();
            System.out.println(name + "---这是第" + tick-- + "号票");
        }
    }
}
