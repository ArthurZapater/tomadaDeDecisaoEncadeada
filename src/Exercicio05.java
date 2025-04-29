import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        //Declaraçao das variaveis
        Scanner sc = new Scanner(System.in);
        int a, b, c, x;

        //Entrada de dados
        System.out.print("Digite o primeiro valor --> ");
        a = sc.nextInt();
        System.out.print("Digite o segundo valor --> ");
        b = sc.nextInt();
        System.out.print("Digite o terceiro valor --> ");
        c = sc.nextInt();

        //Processamento

        if (a > b){
            x=a;
            a=b;
            b=x;
        }

        if (a > c){
            x=a;
            a=c;
            c=x;
        }

        if (b > c){
            x=b;
            b=c;
            c=x;
        }

        //Saida de dados
        System.out.println("sua sequencia é " + a + " " + b + " " + c);
    }
}
