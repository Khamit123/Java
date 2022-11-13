package ru.mirea.kvbo1.khamit.practica24;

public interface AbstractChairFactory {
    VictorianChair createVictoriaChair(int a);
    MagicChair createMagicChai();
    FunctionalChair createFunctionalChair();
}
class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictoriaChair(int a) {
        return new VictorianChair(a);
    }

    @Override
    public MagicChair createMagicChai() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
interface Chair{
}
class VictorianChair implements Chair {
    private int age;

    public int getAge() {
        return age;
    }

    public VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "VictorianChair{" +
                "age=" + age +
                '}';
    }
}
class MagicChair implements Chair{
    void doMagic(){
        System.out.println("Magic is done");
    }
    MagicChair(){

    }

    @Override
    public String toString() {
        return "MagicChair{}";
    }
}
class FunctionalChair implements Chair{
    int sum(int a,int b){
        return a+b;
    }
    FunctionalChair(){

    }

    @Override
    public String toString() {
        return "FunctionalChair{}";
    }
}
class Client{
    private Chair chair;
    void sit(){
        System.out.println(chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
