package Classes;
public class Velocidade {
    // milha por hora
    public double milhaPorHoraParaPesPorSegundo(double v) {
        v = v * 1.467;
        return v;
    }

    public double milhaPorHoraParaMetroPorSegundo(double v) {
        v = v / 2.237;
        return v;
    }

    public double milhaPorHoraParaQuilometroPorHora(double v) {
        v = v * 1.609;
        return v;
    }

    public double milhaPorHoraParaNo(double v) {
        v = v / 1.151;
        return v;
    }

    // pés por segundo
    public double pesPorSegundoParaMilhaPorHora(double v) {
        v = v / 1.467;
        return v;
    }

    public double pesPorSegundoParaMetroPorSegundo(double v) {
        v = v / 3.281;
        return v;
    }

    public double pesPorSegundoParaQuilometroPorHora(double v) {
        v = v * 1.097;
        return v;
    }

    public double pesPorSegundoParaNo(double v) {
        v = v / 1.688;
        return v;
    }

    // Metro por segundo
    public double metroPorSegundoParaMilhasPorHora(double v) {
        return v * 2.237;
    }

    public double metroPorSegundoParaPesPorSegundo(double v) {
        return v * 3.281;
    }

    public double metroPorSegundoParaQuilometroPorHora(double v) {
        return v * 3.6;
    }

    public double metroPorSegundoParaNo(double v) {
        return v * 1.944;
    }

    // Quilometro por hora
    public double quilometroPorHoraParaMilhasPorHora(double v) {
        return v / 1.609;
    }

    public double quilometroPorHoraParaPesPorSegundo(double v) {
        return v / 1.097;
    }

    public double quilometroPorHoraParaMetroPorSegundo(double v) {
        return v / 3.6;
    }

    public double quilometroPorHoraParaNo(double v) {
        return v / 1.852;
    }

    // No
    public double noParaMilhasPorHora(double v) {
        return v * 1.151;
    }

    public double noParaPesPorSegundo(double v) {
        return v * 1.688;
    }

    public double noParaMetroPorSegundo(double v) {
        return v / 1.944;
    }

    public double noParaQuilometroPorHora(double v) {
        return v * 1.852;
    }
}
