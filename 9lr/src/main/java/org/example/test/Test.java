package org.example.test;

public abstract class Test {
    public String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Test(String name){
        this.name = name;
    }
    public abstract void attack();
}
