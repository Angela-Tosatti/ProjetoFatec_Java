package Classes;
public class Tempo {

    // Nanossegundo
    public double nanossegundoParaMicrossegundo(double v) {
        v = v / 1000;
        return v;
    }

    public double nanossegundoParaMilissegundo(double v) {
        v = v / 1000000;
        return v;
    }

    public double nanossegundoParaSegundo(double v) {
        v = v / 1000000000;
        return v;
    }

    public double nanossegundoParaMinuto(double v) {
        v = v / 60000000000l;
        return v;
    }

    public double nanossegundoParaHora(double v) {
        v = v / 3600000000000l;
        return v;
    }

    public double nanossegundoParaDia(double v) {
        v = v / 86400000000000l;
        return v;
    }

    // Microssegundo
    public double microssegundoParaNanossegundo(double v) {
        v = v * 1000;
        return v;
    }

    public double microssegundoParaMilissegundo(double v) {
        v = v / 1000;
        return v;
    }

    public double microssegundoParaSegundo(double v) {
        v = v / 1000000;
        return v;
    }

    public double microssegundoParaMinuto(double v) {
        v = v / 60000000;
        return v;
    }

    public double microssegundoParaHora(double v) {
        v = v / 3600000000l;
        return v;
    }

    public double microssegundoParaDia(double v) {
        v = v / 86400000000l;
        return v;
    }

    // Milissegundos
    public double millissegundoParaNanossegundo(double v) {
        v = v * 1000000;
        return v;
    }

    public double millissegundoParaMicrossegundo(double v) {
        v = v * 1000;
        return v;
    }

    public double millissegundoParaSegundo(double v) {
        v = v / 1000;
        return v;
    }

    public double millissegundoParaMinuto(double v) {
        v = v / 60000;
        return v;
    }

    public double millissegundoParaHora(double v) {
        v = v / 3600000;
        return v;
    }

    public double millissegundoParaDia(double v) {
        v = v / 86400000;
        return v;
    }

    // Segundos
    public double segundoParaNanossegundo(double v) {
        v = v * 1000000000;
        return v;
    }

    public double segundoParaMicrossegundo(double v) {
        v = v * 1000000;
        return v;
    }

    public double segundoParaMillisegundo(double v) {
        v = v * 1000;
        return v;
    }

    public double segundoParaMinuto(double v) {
        v = v / 60;
        return v;
    }

    public double segundoParaHora(double v) {
        v = v / 3600;
        return v;
    }

    public double segundoParaDia(double v) {
        v = v / 86400;
        return v;
    }

    // Minuto
    public double minutoParaNanossegundo(double v) {
        v = v * 60000000000l;
        return v;
    }

    public double minutoParaMicrossegundo(double v) {
        v = v * 60000000;
        return v;
    }

    public double minutoParaMillissegundo(double v) {
        v = v * 60000;
        return v;
    }

    public double minutoParaSegundo(double v) {
        v = v * 60;
        return v;
    }

    public double minutoParaHora(double v) {
        v = v / 60;
        return v;
    }

    public double minutoParaDia(double v) {
        v = v / 1440;
        return v;
    }

    // hora
    public double horaParaNanossegundo(double v) {
        v = v * 3600000000000l;
        return v;
    }

    public double horaParaMicrossegundo(double v) {
        v = v * 3600000000l;
        return v;
    }

    public double horaParaMillissegundo(double v) {
        v = v * 3600000;
        return v;
    }

    public double horaParaSegundo(double v) {
        v = v * 3600;
        return v;
    }

    public double horaParaMinuto(double v) {
        v = v * 60;
        return v;
    }

    public double horaParaDia(double v) {
        v = v / 24;
        return v;
    }

    // dia
    public double diaParaNanossegundo(double v) {
        v = v * 86400000000000l;
        return v;
    }

    public double diaParaMicrossegundo(double v) {
        v = v * 86400000000l; 
        return v;
    }

    public double diaParaMillissegundo(double v) {
        v = v * 86400000;
        return v;
    }

    public double diaParaSegundo(double v) {
        v = v * 86400;
        return v;
    }

    public double diaParaMinuto(double v) {
        v = v * 1440;
        return v;
    }

    public double diaParaHora(double v) {
        v = v * 24;
        return v;
    }

}