package Classes;
public class Temperatura {
    
    //  Kelvin 
    public double kelvinParaCelsius(double v){
        v = v - 273.15;
        return v;
    }

    public double kelvinParaFarenheit(double v){
        v = (v - 273.15) * 1.8 + 32;
        return v;
    }


    // Farenheit
    public double farenheitParaKelvin(double v){
        v = (v- 32) * 5 / 9 + 273.15;
        return v;
    }

    public double farenheitParaCelsius(double v){
        v = (v- 32) * 5 / 9;
        return v;
    }

    // Celsius
    public double celsiusParaFarenheit(double v){
        v = (v * 9 / 5) + 32;
        return v;
    }
   
    public double celsiusParaKelvin(double v){
        v = v + 273.15;
        return v;
    }
}


