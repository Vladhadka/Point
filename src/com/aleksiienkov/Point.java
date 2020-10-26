package com.aleksiienkov;

public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Point (int x,int y){
        this.x=x;
        this.y=y;
    }


    public boolean isStartOfAxis(){
        return x==0 && y==0;




    }
    public double distanceTo(Point p){
        int dx= p.x-this.x;
        int dy= p.y-this.y;
        return Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));




    }
}
