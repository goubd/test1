package com.ywj.hello;

public class hello {
    public static void sayhello()
    {
      System.out.print("hello world!\n");
    }
    public static int add(int a,int b){

        return a+b;
    }
    public static void main(String[] args){
        sayhello();
        System.out.print(add(1,3)+"\n");
        Person person=new Person("胡家伟","女");
        System.out.print("姓名："+person.getName());
        System.out.print("\n性别："+person.getSex());
    }
}
 class Person{
       private String name;
       private String sex;
       public Person(String name,String sex){
           this.name=name;
           this.sex=sex;
       }

     public String getName() {
         return name;
     }

     public String getSex() {
         return sex;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setSex(String sex) {
         this.sex = sex;
     }
 }
