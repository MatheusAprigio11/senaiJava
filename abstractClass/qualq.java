package math;
import java.lang.Math;
public class qualq extends operations{
    @Override
    public double areaTriang(double b, double h) {
        return (b * h)/2;
    }

    @Override
    public double areaCirc(double pi, double r) {
        return pi * Math.pow(r,2);
    }


    @Override
    public double imc(double p, double h) {
        return p / Math.pow(h,2);
    }

    @Override
    public double vm(double desl, double tempo) {
        return desl / tempo;
    }

    @Override
    public double forc(double massa, double acel) {
        return massa*acel;
    }

    @Override
    public double distan(double vel, double tempo) {
        return vel*tempo;
    }


}
