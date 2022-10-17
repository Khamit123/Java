package ru.mirea.kvbo1.khamit.practica7;

public interface MathCalculable {

    Complex powerComplex(Complex a, int n);

    double absComplex(Complex a);
    double PI =3.1415;

}
class MathFunc implements MathCalculable {
    @Override
    public Complex powerComplex(Complex a, int n) {
        Complex result=new Complex();
        result=a;
        for(int i=0;i<n-1;i++){
            result=result.multiply(a);
        }
        return result;
    }

    @Override
    public double absComplex(Complex a) {
        return Math.sqrt(a.getIm()*a.getIm()+a.getRe()*a.getRe());
    }

    double CircleArea(double radius){
        return MathCalculable.PI*radius*radius;
    }
}
