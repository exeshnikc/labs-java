package org.example.test;

public class Test2 extends Test {
    private int count;
    public int getCount(){
        return count;
    }
    public void setCount(int count){
        this.count = count;
    }
    public Test2(String name, int count) {
        super(name);
        this.count = count;
    }
    @Override
    public void attack() {
        System.out.println(name + "наносит удар" + count + "раз");
    }
}
