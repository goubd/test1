package com.ywj.test;

public interface scene {

    //设置出口
    public void setExit(String name,scene room);

    //获得出口
    public String getExit();

    //房间中的物体
    public void res();

    //对当前场景的叙述
    public void narration();

}
