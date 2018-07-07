package com.ywj.test;


import java.util.HashMap;

public abstract class Room implements scene{

    private String description;
    private HashMap<String, scene> roomList=new HashMap<>();

    //房间初始化，输入描述
    public Room(String description){
        this.description=description;
    }


    //单个初始化房间的出口
    public void setExit(String name,scene room){
        roomList.put(name, room);
    }

    //获得出口
    public String getExit(){
        StringBuffer s=new StringBuffer();
        for(String str:roomList.keySet()){
            s.append(str);
            s.append(roomList.get(str));
            s.append("   ");
        }
        if(roomList.isEmpty()){
            System.out.println("哈哈哈，这里没有出口，等死吧你！！！");
        }
        return s.toString();
    }

    //取的房间的方向，并转移当前房间
    public Room getDirect(String direction){
        Room ret=(Room)roomList.get(direction);
        return ret;
    }

    //输入房间描述
    @Override
    public String toString(){
        return this.description;
    }

}
