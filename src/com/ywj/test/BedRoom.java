package com.ywj.test;

public class BedRoom extends Room{

    public BedRoom() {
        super("主卧");
    }

    @Override
    public void res() {
        // TODO Auto-generated method stub

    }

    @Override
    public void narration() {
        System.out.println("这是最大的卧室，有一张很大的床");
    }

}
