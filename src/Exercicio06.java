import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        //Declaração das variaveis
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        String cargo;
        int tempoDeEmpresa;
        double salarioAtual, novoSalario, diferenca ;

        //Entrada de dados
        System.out.print("Digite seu cargo --> ");
        cargo = sc.next();
        System.out.print("Tempo de casa --> ");
        tempoDeEmpresa = sc.nextInt();
        System.out.print("Salario atual --> ");
        salarioAtual = sc.nextDouble();

        //Processamento
        if (cargo.equalsIgnoreCase("gerente")){
            if (tempoDeEmpresa>= 5) {
                novoSalario = salarioAtual * 1.10;
            }
                else if(tempoDeEmpresa >= 3){
                    novoSalario = salarioAtual * 1.08;

                }




            }
        }




        //Saida de dados

        }
}