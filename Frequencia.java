package Classes;
public class Frequencia {
    //Quilohertz para...
    public double quiloHertzToMegaHertz(double v){
        v = v  / 1000;
        return v;
    }
    public double quiloHertzToHertz(double v){
        v = v * 1000;
        return v;
    }
    public double quiloHertzToGigaHertz(double v){
        v = v / 1000000;
        return v;
    }
    //Megahertz para...
    public double megaHertzToQuiloHertz(double v){
        v = v * 1000;
        return v;
    }
    public double megaHertzToHertz(double v){
        v = v * 1000000;
        return v;
    }
    public double megaHertzToGigaHertz(double v){
        v = v / 1000;
        return v;
    }
    //Hertz para...
    public double hertzToQuiloherz(double v){
        v = v / 1000;
        return v;
    }
    public double hertzToMegaHertz(double v){
        v = v / 1000;
        return v;
    }
    public double hertzToGigaHertz(double v){
        v = v / 1000000000;
        return v;
    }
    //Gigahertz para...
    public double gigaHertzToQuiloHertz(double v){
        v = v * 1000000;
        return v;
    }
    public double gigaHertzToHertz(double v){
        v = v * 1000000000;
        return v;   
    }
    public double gigaHertzToMegaHertz(double v){
        v = v * 1000;
        return v;
    }
}
