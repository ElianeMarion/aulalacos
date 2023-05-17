import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite a altura do 1º aluno");
            double altura1 = leitor.nextDouble();
            System.out.println("Digite a altura do 2º aluno");
            double altura2 = leitor.nextDouble();
            System.out.println("Digite a altura do 3º aluno");
            double altura3 = leitor.nextDouble();
            System.out.println("Digite a altura do 4º aluno");
            double altura4 = leitor.nextDouble();
            System.out.println("Digite a altura do 5º aluno");
            double altura5 = leitor.nextDouble();
            System.out.println("Digite a altura do 6º aluno");
            double altura6 = leitor.nextDouble();
            double media = (altura1 + altura2 + altura3 + altura4 + altura5 + altura6) / 6.0;
            System.out.println("A media de altura dos alunos é de " + media);
            leitor.close();


    }
}