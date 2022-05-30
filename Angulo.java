package Classes;
public class Angulo {

    public void verificaResp1(int resp) throws Exception{
        if( resp != 1 && resp != 2) throw new Exception();
    }

    public void verificaResp2(int resp) throws Exception{
        if( resp != 1) throw new Exception();
    }

    public double grauParaRadiano(double g){
        double r = g * 3.14159265358979323846/180;
        return r;

    }

    public double radianoParaGrau(double g){
        double r = g * 180/3.14159265358979323846;
        return r;

    }

}