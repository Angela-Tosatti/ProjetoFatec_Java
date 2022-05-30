package Classes;
public class Massa {
    //miligrama to
    public double miligramaToGrama(double v){
        v = v/1000;
        return v;
    }
    public double miligramaToLibra(double v){
        v = v/453592;
        return v;
    }
    public double miligramaToOnca(double v){
        v = v/28350;
        return v;
    }
    public double miligramaToQuilo(double v){
        v = v/1000000000;
        return v;
    }
    public double miligramaToTonelada(double v){
        v = v/1e+9;
        return v;
    }

    //Grama to
    public double gramaToMiligrama(double v){
        v=v*1000;
        return v;
    }
    public double gramaToOnca(double v){
        v=v/28.35;
        return v;
    }   
    public double gramaToLibra(double v){
        v=v/454;
        return v;
    }
    public double gramaToQuilograma(double v){
        v=v/1000;
        return v;       
    }
    public double gramaToTonelada(double v){
        v=v/1e-6;
        return v;
    }

    //onca to
    public double oncaToGrama(double v){
        v = v*28.35;
        return v;
    }
    public double oncaToLibra(double v){
        v = v/16;
        return v;
    }
    public double oncaToMiligrama(double v){
        v = v*28350;
        return v;
    }
    public double oncaToQuilo(double v){
        v = v/35.274;
        return v;
    }
    public double oncaToTonelada(double v){
        v = v/35274;
        return v;
    }

    //libra to
    public double libraToMiligrama(double v){
        v=v*453592;
        return v;
    }
    public double libraToGrama(double v){
        v=v*454;
        return v;
    }
    public double libraToOnca(double v){
        v=v*16;
        return v;
    }
    public double libraToQuilograma(double v){
        v=v/2.205;
        return v;
    }
    public double libraToTonelada(double v){
        v=v/2205;
        return v;
    }

    //quilo to
    public double quilogramaToTonelada(double v){
        v=v/1000;
        return v;
    }
    public double quilogramaToGrama(double v){
        v=v*1000;
        return v;
    }
    public double quilogramaToMiligrama(double v){
        v=v*1e+6;
        return v;
    }
    public double quilogramaToLibra(double v){
        v=v*2.205;
        return v;
    }
    public double quilogramaToOnca(double v){
        v=v*35.274;
        return v;
    }

    //tonelada to
    public double toneladaToQuilograma(double v){
        v=v*1000;
        return v;
    }
    public double toneladaToGrama(double v){
        v=v*1e+6;
        return v;
    }
    public double toneladaToMiligrama(double v){
        v=v*1e+9;
        return v;
    }
    public double toneladaToLibra(double v){
        v=v*2205;
        return v;
    }
    public double toneladaToOnca(double v){
        v=v*35274;
        return v;
    }  
}
