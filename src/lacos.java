import java.util.Scanner;

public class lacos {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int op = 0, resultado = 0;
        System.out.println("DIgite um valor");
        int v1 = leitor.nextInt();
        System.out.println("DIgite o Segundo valor");
        int v2 = leitor.nextInt();


        do { // o do while ele sempre executa primeira vez, depois ele fica na condicao
            System.out.println("DIgite 1 para soma \n Digite 2 para Subtracao \n Digite 3 para multiplicacao  \n Digite 4 mutiplicacao \n Digite 5 para Sair");
            op = leitor.nextInt();
          switch(op) {

                case 1: resultado = v1+v2; System.out.println(" Soma = " + resultado);break; //tem que colcoar o break para funcionar o case
                case 2: resultado = v1-v2; System.out.println(" Subtracao = " + resultado);break;
                case 3: resultado = v1*v2; System.out.println("Multiplicacao = " + resultado);break;
                case 4: resultado = v1/v2; System.out.println(" Divisao = " + resultado);break;
            }

        }
        while (op != 5);
    }
}