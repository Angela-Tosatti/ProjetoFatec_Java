package Classes;
/**
 * Comprimento
 */
public class Comprimento {

    //Convertendo o Quilometro

    public double quilometroParaMetro(double valor) {
        return valor * Math.pow(10, 3);
    }

    public double quilometroParaCentimetro(double valor) {
        return valor *  Math.pow(10, 5);
    }

    public double quilometroParaMilimetro(double valor) {
        return valor * Math.pow(10, 6);
    }

    public double quilometroParaMicrometro(double valor) {
        return valor * Math.pow(10, 9);
    }

    public double quilometroParaNanometro(double valor) {
        return valor * Math.pow(10, 12);
    }

    public double quilometroParaMilha(double valor) {
        return valor / 1.609;
    }

    public double quilometroParaJarda(double valor) {
        return valor * 1094;
    }

    public double quilometroParaPes(double valor) {
        return valor * 3281;
    }

    public double quilometroParaPolegada(double valor) {
        return valor * 39370;
    }

    //Convertendo Metro

    public double metroParaQuilometro(double valor){
        return valor / Math.pow(10, 3);
    }

    public double metroParaCentimetro(double valor){
        return valor * 100;
    }

    public double metroParaMilimetro(double valor){
        return valor * Math.pow(10, 3);
    }

    public double metroParaMicrometro(double valor){
        return valor * Math.pow(10, 6);
    }

    public double metroParaNanometro(double valor){
        return valor * Math.pow(10, 9);
    }

    public double metroParaMilha(double valor){
        return valor / 1609;
    }

    public double metroParaJarda(double valor){
        return valor * 1.094;
    }

    public double metroParaPes(double valor){
        return valor * 3.281;
    }

    public double metroParaPolegada(double valor){
        return valor * 39.37;
    }

    //Convertendo Centimetro

    public double centimetroParaQuilometro(double valor){
        return valor / Math.pow(10, 5);
    }

    public double centimetroParaMetro(double valor){
        return valor / Math.pow(10, 2);
    }

    public double centimetroParaMilimetro(double valor){
        return valor * 10;
    }

    public double centimetroParaMicrometro(double valor){
        return valor * Math.pow(10, 4);
    }

    public double centimetroParaNanometro(double valor){
        return valor * Math.pow(10, 7);
    }

    public double centimetroParaMilha(double valor){
        return valor / 160934;
    }

    public double centimetroParaJarda(double valor){
        return valor / 91.44;
    }

    public double centimetroParaPes(double valor){
        return valor / 30.48;
    }

    public double centimetroParaPolegada(double valor){
        return valor / 2.54;
    }

    //Convertendo Milimetro

    public double milimetroParaQuilometro(double valor){
        return valor / Math.pow(10, 6);
    }

    public double milimetroParaMetro(double valor){
        return valor / Math.pow(10, 3);
    }

    public double milimetroParaCentimetro(double valor){
        return valor / 10;
    }

    public double milimetroParaMicrometro(double valor){
        return valor * Math.pow(10, 3);
    }

    public double milimetroParaNanometro(double valor){
        return valor * Math.pow(10, 6);
    }

    public double milimetroParaMilha(double valor){
        return valor / (1.069 * Math.pow(10,6));
    }

    public double milimetroParaJarda(double valor){
        return valor / 914;
    }

    public double milimetroParaPes(double valor){
        return valor / 305;
    }

    public double milimetroParaPolegada(double valor){
        return valor / 25.4;
    }

    //Convertendo Micrometro

    public double micrometroParaQuilometro(double valor){
        return valor / Math.pow(10, 9);
    }

    public double micrometroParaMetro(double valor){
        return valor / Math.pow(10, 6);
    }

    public double micrometroParaCentimetro(double valor){
        return valor / Math.pow(10, 4);
    }
    
    public double micrometroParaMilimetro(double valor){
        return valor / Math.pow(10, 3); 
    }

    public double micrometroParaNanometro(double valor){
        return valor * Math.pow(10, 3); 
    }

    public double micrometroParaMilha(double valor){
        return valor / (1.609 * Math.pow(10, 9)); 
    }

    public double micrometroParaJarda(double valor){
        return valor / 914400; 
    }

    public double micrometroParaPes(double valor){
        return valor / 304800; 
    }

    public double micrometroParaPolegada(double valor){
        return valor / 25400; 
    }
    
    //Convertendo Nanometro

    public double nanometroParaQuilometro(double valor){
        return valor / Math.pow(10, 12); 
    }
    
    public double nanometroParaMetro(double valor){
        return valor / Math.pow(10, 9); 
    }

    public double nanometroParaCentimetro(double valor){
        return valor / Math.pow(10, 7); 
    }

    public double nanometroParaMilimetro(double valor){
        return valor / Math.pow(10, 6); 
    }

    public double nanometroParaMicrometro(double valor){
        return valor / 1000; 
    }

    public double nanometroParaMilha(double valor){
        return valor / (1.609 * Math.pow(10, 12)); 
    }

    public double nanometroParaJarda(double valor){
        return valor / (9.144 * Math.pow(10,8)); 
    }

    public double nanometroParaPes(double valor){
        return valor / (3.048 * Math.pow(10,8)); 
    }

    public double nanometroParaPolegada(double valor){
        return valor / (2.54 * Math.pow(10, 7)); 
    }

    //Convertendo Milha

    public double milhaParaQuilometro(double valor){
        return (valor * 1.609); 
    }

    public double milhaParaMetro(double valor){
        return (valor * 1609); 
    }

    public double milhaParaCentimetro(double valor){
        return (valor * 160934); 
    }

    public double milhaParaMilimetro(double valor){
        return (valor * (1.609 * Math.pow(10, 6))); 
    }

    public double milhaParaMicrometro(double valor){
        return (valor * (1.609 * Math.pow(10, 9))); 
    }

    public double milhaParaNanometro(double valor){
        return (valor * (1.609 * Math.pow(10, 12))); 
    }
    
    public double milhaParaJarda(double valor){
        return (valor * 1760); 
    }

    public double milhaParaPes(double valor){
        return (valor * 5280); 
    }
    
    public double milhaParaPolegada(double valor){
        return (valor * 63360); 
    }

    //Convertendo Jarda

    public double jardaParaQuilometro(double valor){
        return (valor / 1094); 
    }

    public double jardaParaMetro(double valor){
        return (valor / 1.094); 
    }

    public double jardaParaCentimetro(double valor){
        return (valor * 91.44); 
    }
    public double jardaParaMilimetro(double valor){
        return (valor * 914); 
    }

    public double jardaParaMicrometro(double valor){
        return (valor * 914400); 
    }

    public double jardaParaNanometro(double valor){
        return (valor * (9.144 * Math.pow(10, 8))); 
    }

    public double jardaParaMilha(double valor){
        return (valor / 1760); 
    }

    public double jardaParPes(double valor){
        return (valor * 3); 
    }

    public double jardaParaPolegada(double valor){
        return (valor * 36); 
    }

    //Convertendo Pes

    public double pesParaQuilometro(double valor){
        return (valor / 3281); 
    }

    public double pesParaMetro(double valor){
        return (valor / 3.281); 
    }

public double pesParaCentimetro(double valor){
    return (valor * 30.48); 
}

public double pesParaMilimetro(double valor){
    return (valor * 305); 
}

public double pesParaMicrometro(double valor){
    return (valor * 304800); 
}

public double pesParaNanometro(double valor){
    return (valor * (3.048 * Math.pow(10, 8))); 
}

public double pesParaMilha(double valor){
    return (valor / 5280); 
}

public double pesParaJarda(double valor){
    return (valor / 3); 
}

public double pesParaPolegada(double valor){
    return (valor * 12); 
}

//Convertendo Polegada

public double polegadaParaQuilometro(double valor){
    return (valor / 39370); 
}

public double polegadaParaMetro(double valor){
    return (valor / 39.37); 
}

public double polegadaParaCentimetro(double valor){
    return (valor * 2.54); 
}

public double polegadaParaMilimetro(double valor){
    return (valor * 25.4); 
}

public double polegadaParaMicrometro(double valor){
    return (valor * 25400); 
}

public double polegadaParaNanometro(double valor){
    return (valor * (2.54 * Math.pow(10, 7))); 
}

public double polegadaParaMilha(double valor){
    return (valor / 63360); 
}

public double polegadaParaJarda(double valor){
    return (valor / 36); 
}

public double polegadaParaPes(double valor){
    return (valor / 12); 
}
}