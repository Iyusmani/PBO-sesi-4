
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

class laptop{
    private double harga;
    private double TotalBayar;

  
    public laptop(double harga, int jumlah){
        this.harga = harga;
        this.TotalBayar = harga * (double)jumlah;

    }

    public laptop(double harga, double jumlah){
        this.harga = harga;
        this.TotalBayar = harga * jumlah;
    }

    public double getTotalBayar(){
        return TotalBayar;
    }
}

public class Main {
    public static void main (String[] args){
        laptop azus = new laptop(1200000, 2);
        laptop acer     = new laptop(2000000, 4);
        laptop Hp    = new laptop(9000000, 3);
        laptop lenovo    = new laptop(4400000, 5);

        System.out.println("jenis dan harga laptop");
        System.out.println("-------------------------------");
        System.out.println("Jenis laptop azus   : " + azus.getTotalBayar());
        System.out.println("Jenis latop acer    : " + acer.getTotalBayar());
        System.out.println("Jenis laptop Hp     : " + Hp.getTotalBayar());
        System.out.println("Jenis laptop lenovo : " + lenovo.getTotalBayar());
    }
}