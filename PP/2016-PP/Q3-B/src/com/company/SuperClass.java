package com.company;

class SuperClass
{
    protected int x = 0;
    public SuperClass(int x) {
        this.x = x; }
    private void increment() {
        x++;
    }
    protected final void add(int y) {
        x += y; }
    public void display(){
        System.out.println(x);
    } }
