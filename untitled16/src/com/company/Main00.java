package com.company;

import java.util.Date;

public class Main00 {
    public static void main(String[] args){
        Watch watch = new RomeWatch();
        watch.showTime();

    }
}

interface Watch{
    void showTime();
}

class DigitalWhatch implements Watch{
    public void showTime(){
        System.out.println(new Date());
    }
}
class RomeWatch implements Watch{
    public void showTime() {
        System.out.println("V-X");
    }
}