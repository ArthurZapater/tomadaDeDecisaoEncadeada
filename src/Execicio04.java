import java.util.Scanner;

public class Execicio04 {
    public static void main(String[] args) {

        //Declaração das variaveis
        Scanner sc = new Scanner(System.in);
        int valor1, valor2, valor3;

        //Entrada de dados

        System.out.print("Digite o primeiro valor --> ");
        valor1 = sc.nextInt();
        System.out.print("Digite o segundo valor --> ");
        valor2 = sc.nextInt();
        System.out.print("Digite o terceiro valor --> ");
        valor3 = sc.nextInt();

        if (valor1 != valor2 && valor1 != valor3 && valor2 != valor3){

            if (valor1 < valor2 && valor1 < valor3){
                System.out.print("menor = " + valor1);
            }
            else if (valor2 < valor3){
                System.out.print("menor = " + valor2);
            }
            else {
                System.out.print("menor = " + valor3);
            }

        }
        else {
            System.out.println("Seus numeros são iguais");
        }

    }
}
