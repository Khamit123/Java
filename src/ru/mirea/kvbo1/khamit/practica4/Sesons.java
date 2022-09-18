package ru.mirea.kvbo1.khamit.practica4;

public enum Sesons {

    Summer(22) {
        public void getDescription() {
            System.out.println("Тёплое время года");
        }
    },
    Winter(-15),
    Autumn(5),
    Spring(15);
    private final int Temp;

    private Sesons(int Temp) {
        this.Temp = Temp;
    }

    public int getTemp() {
        return this.Temp;
    }

    public void getDescription() {
        System.out.println("Холодное время года");
    }

}


