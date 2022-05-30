package Classes;
public class Pressao{

    //ATM PADRAO -> BAR E PASCAL
    public double atmPadraoToBar(double v){
        v = v * 1.013;
        return v;
    }

    public double atmPadraoToPascal(double v){
        v = v * 101325;
        return v;
    }

    //BAR -> ATM PADRAO E PASCAL
    public double barToAtmPadrao(double v){
        v = v / 1.013;
        return v;
    }

    public double barToAtmPascal(double v){
        v = v * 100000;
        return v;
    }
    
    //PASCAL -> BAR E ATM PADRAO
    public double pascalToBar(double v){
        v = v / 100000;
        return v;
    }

    public double pascalToAtmPadrao(double v){
        v = v / 101325;
        return v;
    }

}