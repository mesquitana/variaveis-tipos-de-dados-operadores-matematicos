package one.dio.VTOAula02;

public class Main {

    public static void main(String[] args){

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; ultrapassa o valor maximo permitido

        //int i1 = -10000000000; ultrapassa o limite inferior
        int i2 = 28500;

        long l1 = 1000000000000000000L; //long é um int  mas com mais capacidade
        long l2 = 2004005000500055000L; //precisa escrevera letra L no final, pra diferenciar do int

        //float f1 = 4.5; está interpretando como double, logo não cabe no float
        float f2 = 10.68F;

        double d1 = 85.69;
        double d2 = 99.84D; //pode usar letra minuscula ou maiuscula

        char c1 = 'W';
        //char c2 = 'Tw'; //char é apenas UM caracter
        char c3 = '\u0057'; //código uni-code da letra w

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag dgb se se et t 237236";

//        String dt1 = "09/02/1981"; está sendo armazenado como um texto, se quisesse comparar com outra data seria mais complexo

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(s1);

        System.out.println(i2);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(f2);

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(c1);
        System.out.println(c3);

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        System.out.println(bo1);
        System.out.println(bo2);

    }
}
