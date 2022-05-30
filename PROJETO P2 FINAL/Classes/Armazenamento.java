package Classes;
public class Armazenamento {
    //bit para...
    public double bitToByte(double v){
        v = v / 8;
        return v;
    }
    public double bitToKbyte(double v){
        v = v / 8000;
        return v;
    }
    public double bitToMbyte(double v){
        v = v / 8000000;
        return v;
    }
    public double bitToGbyte(double v){
        v = v / (8* Math.pow(10, 9));
        return v;
    }
    public double bitToTbyte(double v){
        v = v / (8* Math.pow(10, 12));
        return v;
    }




    //byte para...
    public double byteToBit(double v){
        v = v * 8;
        return v;
    }
    public double byteToKbyte(double v){
        v = v / 1000;
        return v;
    }
    public double byteToMbyte(double v){
        v = v / 1000000;
        return v;
    }
    public double byteToGbyte(double v){
        v = v / (1* Math.pow(10, 9));
        return v;
    }
    public double byteToTbyte(double v){
        v = v / (1* Math.pow(10, 12));
        return v;
    }




    // KiloByte para...
    public double kbyteToBit(double v){
        v = v * 8000;
        return v;
    }
    public double kbyteTobyte(double v){
        v = v * 1000;
        return v;
    }
    public double kbyteToMbyte(double v){
        v = v / 1000;
        return v;
    }
    public double kbyteToGbyte(double v){
        v = v / 1000000;
        return v;
    }
    public double kbyteToTbyte(double v){
        v = v / (1* Math.pow(10, 9));
        return v;
    }





    //MegaByte para...

    public double mbyteToBit(double v){
        v = v * 8000000;
        return v;
    }
    public double mbyteTobyte(double v){
        v = v * 1000000;
        return v;
    }
    public double mbyteToKbyte(double v){
        v = v * 1000;
        return v;
    }
    public double mbyteToGbyte(double v){
        v = v / 1000;
        return v;
    }
    public double mbyteToTbyte(double v){
        v = v / 1000000;
        return v;
    }



    //GigaByte para...
    public double gbyteToBit(double v){
        v = v * (8 * Math.pow(10,9));
        return v;
    }
    public double gbyteTobyte(double v){
        v = v * (1 * Math.pow(10,9));
        return v;
    }
    public double gbyteToKbyte(double v){
        v = v * 1000000;
        return v;
    }
    public double gbyteToMbyte(double v){
        v = v * 1000;
        return v;
    }
    public double gbyteToTbyte(double v){
        v = v / 1000;
        return v;
    }



    //TeraByte para...
    
    public double tbyteToBit(double v){
        v = v * (8 * Math.pow(10,12));
        return v;
    }
    public double tbyteTobyte(double v){
        v = v * (1 * Math.pow(10,12));
        return v;
    }
    public double tbyteToKbyte(double v){
        v = v * (1 * Math.pow(10,9));
        return v;
    }
    public double tbyteToMbyte(double v){
        v = v * 1000000;
        return v;
    }
    public double tbyteToGbyte(double v){
        v = v * 1000;
        return v;
    }
}
