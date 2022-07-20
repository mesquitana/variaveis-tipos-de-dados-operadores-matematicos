package one.dio.VTOAula01;

public class Main {

    public static void main(String[] args){
        //erros aparecerão comentados
        int i;
        //int i;
        int I; //diferente do i minusculo
        //int 1a;
        int _1a; //ferindo a boa prática
        int $aq; //ferindo a boa prática

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10; //constante, j sempre  será 10 por causa do final
        //j = 15; tem erro pois j é final
        int asrn24678md;
        //int asrn246 78md; apresenta erro por causa do espaço no nome da variável
        int asrn2$4678_md = 10; //ferindo boa prática
        //int asrn246%78md = 10; erro por causa do %, que é um caracter especial proibido

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50; //variavel bem definida
        //int QuantidadeProduto; notação camelo, mas primeira letra deveria ser minuscula
        final int NUMERO_TENTATIVAS = 5;  //essa é a regra de nome de constantes final
        //final int numeroTentativas = 5; fora do padrão da final
        int QUANTIDADE_OPCOES = 25; //fora do padrão, não é final mas está definida como se fosse
        //int qtdProd; está mal esclarecida sobre o quese refere a variável

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

    }
}
