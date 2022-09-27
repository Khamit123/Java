package ru.mirea.kvbo1.khamit;

public class Complex implements Comparable<Complex>{
    private double Im;
    private double Re;

    public Complex(double im, double re) {
        Im = im;
        Re = re;
    }
    public Complex() {
        Im = 0;
        Re = 0;
    }

    public double getIm() {
        return Im;
    }

    public void setIm(double im) {
        Im = im;
    }

    public double getRe() {
        return Re;
    }

    public void setRe(double re) {
        Re = re;
    }
    public Complex multiply(Complex a){
        Complex c = new Complex();
        c.Im=a.Im*Im-a.Re*Re;
        c.Re=a.Im*Re+a.Re*Im;
        return c;
    }

    @Override
    public int compareTo(Complex o) {
        MathCalculable f= new MathFunc();
        if(f.absComplex(o)>f.absComplex(this)){
            return 1;
        }
        if(f.absComplex(o)<f.absComplex(this)){
            return -1;
        }
        return 0;
    }
}