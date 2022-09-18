package ru.mirea.kvbo1.khamit.practica2;

public class Shop {
 private int number=0;
 Computer[] c=new Computer[100];
 public int search(Computer z){
     for(int k=0;k<number;k++){
         if (c[k]==z){
             return k;
         }
     }
     return 0;
 }
 public void add(Computer q){
     c[number]=q;
     number+=1;
 }
 public void delete(Computer q){
     int r=search(q);
     c[r]=null;
 }

    public void shop_list(){
     for(int k=0;k<number;k++){
         if(c[k]!=null) {
             System.out.println(c[k]);
         }
     }
    }



}

class Computer {
    private boolean keyboard;
    private boolean mouse;
    private boolean ssd;

    public Computer(boolean keyboard, boolean mouse, boolean ssd) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.ssd = ssd;
    }

    public boolean isKeyboard() {
        return keyboard;
    }

    public void setKeyboard(boolean keyboard) {
        this.keyboard = keyboard;
    }

    public boolean isMouse() {
        return mouse;
    }

    public void setMouse(boolean mouse) {
        this.mouse = mouse;
    }

    public boolean isSsd() {
        return ssd;
    }

    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "keyboard=" + keyboard +
                ", mouse=" + mouse +
                ", ssd=" + ssd +
                '}';
    }
}

