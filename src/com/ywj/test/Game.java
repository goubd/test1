package com.ywj.test;

import java.util.Scanner;

public class Game {

    //初始化当前房间
    private scene currentRoom;

    //游戏初始化
    public Game(){
        Initialization init=new Initialization();
        init.setRoom();
        init.welcome();
        currentRoom=init.getCurrentRoom();
        printRoom();
    }

    //输出当前房间的出口
    private void printRoom(){
        System.out.println("\n-----------------------------------------------");
        System.out.println("现在你在     "+currentRoom);
        System.out.println();
        currentRoom.narration();
        System.out.println("\n出口有:");
        System.out.println(currentRoom.getExit());
    }

    //输出帮助命令
    private void printHelp() {
        System.out.println("\n迷路了吗？你可以做的命令有：go bye help");
        System.out.println("如要去某个方向：\tgo main_bedroom\n");
    }

    //转移房间
    public void goRoom(String direction){
        Room nextRoom=((Room) currentRoom).getDirect(direction);
        if(nextRoom==null){
            System.out.println("这里没有这个房间！！！");
            printRoom();

        }else{
            currentRoom=nextRoom;
        }
        printRoom();
    }



    public static void main(String[] args) {
        Game game=new Game();
        Scanner in=new Scanner(System.in);
        //开始游戏
        while(true){
            String line=in.nextLine();
            String[] command=line.split(" ");
            if(command[0].equals("help")){
                game.printHelp();
            }else if(command[0].equals("go")){
                game.goRoom(command[1]);
            }else if(command[0].equals("bye")){
                System.out.println("感谢使用...");
                System.exit(0);
            }
        }
    }

}
