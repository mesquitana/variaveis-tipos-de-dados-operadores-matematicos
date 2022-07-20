package one.dio.VTOAula03;

public class Main {

    public static void main(String[] args){
        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();
    }
    public static void prePos() {
        int k = 10;

        int i = ++k; // o k primeiro recebe 1 unidade para depois atribuir ao i, i = 11,
        int j = k--; // o j receberá primeiro o novo valor de k, 11, para depois diminuir 1 unidade de k,
        int x = k; //logo k ficará com 10

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }
    public static void aritmetico() {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a + b;
        int r2 = c - a;
        int r3 = d * b;
        int r4 = e / a;
        int r5 = c % b; // resto da divisão

        System.out.println("a + b = " + r1);
        System.out.println("c - a = " + r2);
        System.out.println("d * b = " + r3);
        System.out.println("e + a = " + r4);
        System.out.println("c + b = " + r5);
    }
    public static void atribuicao() {
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d: " + d);

        i += 5; //i = i+5
        j -= 3; //j=j-3
        d /= 2.7d;//d=d/2.7
        l *= 3;//l=l*3
        k %= 2;//k=k%2

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("d = " + d);
        System.out.println("l = " + l);
        System.out.println("k = " + k);

        i = k = j;

        System.out.println("k = " + k);
        System.out.println("i = " + i);
    }
    public static void precedencia() {
        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k; // primeiro faz toda a expressão p/ depois mudar o valor de i, 10 + (19 * 30) -> 10 + 570 -> 580
        System.out.println("i++ + --j * k = " + a);
        System.out.println("i = " + i); //i = 11

        int b = k / --i % 3 + 1; // 30 / 10 % 3 + 1 -> 1
        System.out.println("k / --i % 3 + 1 = " + b);
        System.out.println("i = " + i);

        int c = 2;
        c *= i += 5; // primeiro faz c = 2*i; mas precisa de i, logo: i=i+5 -> c=2*i; i=10+5; ->c=2*15; ->c=30
        System.out.println("c *= i += 5 = " + c);
    }
}
