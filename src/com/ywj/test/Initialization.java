package com.ywj.test;

public class Initialization {
    //初始化当前房间
    scene currentRoom;

    //显示欢迎信息
    public void welcome(){
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("你可以输入'go+方向'去你想去的方向，如go main_bedroom");
        System.out.println("你还可以输入'bye'结束游戏");
        System.out.println("如果需要帮助，请记住输入 'help'");
    }

    //设定所有房间
    public void setRoom(){
        //初始化所有的房间
        scene bedroom=new BedRoom();
        scene lobby=new Lobby();
        scene secBed=new secBedroom();
        scene secBal=new secBalcony();
        scene thBed=new thBedroom();
        scene balcony=new Balcony();
        scene background=new Background();

        //大堂初始化
        lobby.setExit("background", background);
        lobby.setExit("thr_bed", thBed);
        lobby.setExit("sec_bed", secBed);
        lobby.setExit("main_bed", bedroom);

        //主卧室初始化
        bedroom.setExit("lobby", lobby);
        bedroom.setExit("balcony", balcony);

        //次卧1初始化
        secBed.setExit("lobby", lobby);
        secBed.setExit("sec_Bal", secBal);

        //次卧2的初始化
        thBed.setExit("lobby", lobby);
        thBed.setExit("balcony", balcony);

        //大阳台的初始化
        balcony.setExit("main_bed", bedroom);
        balcony.setExit("thr_room", thBed);

        //次卧1的阳台初始化
        secBal.setExit("bacground", background);


        //设定起始房间
        currentRoom=bedroom;
    }

    //获得当前房间
    public scene getCurrentRoom(){
        return currentRoom;
    }

}
