package one.dio.VTOAula04;

public class Main {
    public static void main(String[] args){
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; // short vai virar byte, downcast

        byte b2 = 13;
        short s2;
        s2 = (short) b2; // byte vai virar short, upcast

        byte b3 = 1;
        char c1;
        c1 = (char) b3; // char

        byte b4 = 13;
        int i9;
        i9 = (int) b4;

        byte b5 = 13;
        long l9;
        l9 = (long) b5;

        char c9 = 'A';
        byte b9;
        b9 = (byte) c9;

        char c8 = 'A';
        short s9;
        s9 = (short) c8;

        int i8 = 987876;
        short s8;
        s8 = (short) i8;

        long l1;
        int i1 = 10;
        l1 = i1; //pegou o inteiro e colocou no long, upcast, não houve perda de informação

        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2; //downcast, houve perda de informação

        int i3;
        long l3 = 10000L;
        i3 = (int) l3; // é um downcast mas sem perda de informação

        double d1;
        float f1 = 10.5f;
        d1 = f1; // upcast, float foi promovido

        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2; //downcast mas sem perda de informação
        double d3 = 10000.58888888888888888888888888888888888888888888888888888888d;
        f3 = (float) d3; //downcast mas com perda de informação já que houve arredondamento

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4; //downcast perigoso, joga todas as casas decimais fora

        System.out.println("b1 = " + b1);
        System.out.println("s2 = " + s2);
        System.out.println("c1 = " + c1);
        System.out.println("i9 = " + i9); //upcast
        System.out.println("l9 = " + l9); //upcast
        System.out.println("b9 = " + b9); //resultado 65, tá certo, ocorreu downcast
        System.out.println("s9 = " + s9); //resultado 65, tá certo, ocorreu downcast
        System.out.println("s8 = " + s8); //ocorreu downcast, apresentou erro
        System.out.println("l1 = " + l1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("d1 = " + d1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("i4 = " + i4);

        b1 =  (byte) d3;
        System.out.println("b1 = " + b1); //aconteceu a conversão mas só armazenou 16, já que o byte é muito pequeno
    }
}
