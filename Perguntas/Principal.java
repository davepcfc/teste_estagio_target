package Perguntas;

import Perguntas.Fibonacci.SequenciaFibonacci;
import Perguntas.Inverter.InverterString;
import Perguntas.Lampadas.Lampadas;
import Perguntas.Proximo.ProximoDaSequencia;
import Perguntas.Soma.SomaSimples;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int options = 0;
        SomaSimples pergunta1 = new SomaSimples();
        SequenciaFibonacci sequenciaFibonacci1 = new SequenciaFibonacci();
        ProximoDaSequencia pergunta3 = new ProximoDaSequencia();
        Lampadas pergunta4 = new Lampadas();
        InverterString inverter = new InverterString();

        while (options != 6) {
            System.out.println("""
                        1 - Soma
                        2 - Verificar pertencente a sequência fibonacci
                        3 - Próximo da sequência.
                        4 - Lâmpadas.
                        5 - Inverter String
                        6 - Sair
                        Escolha uma opção:
                    """);

            options = leitura.nextInt();

            switch (options){
                case 1:
                    System.out.println("O resultado é: ");
                    pergunta1.exibirSoma();
                    break;
                case 2:
                    System.out.println("Digite um número para verificar. ");
                    int sequenciaFibonacci = leitura.nextInt();
                    leitura.nextLine();
                    boolean verificarVeracidade = sequenciaFibonacci1.criarFibonacci(sequenciaFibonacci);
                    if (verificarVeracidade == true) {
                        System.out.println("Número pertence a sequência.");
                    } else {
                        System.out.println("Número não pertence a sequência.");
                    }
                    break;
                case 3:
                    pergunta3.exibirProximoDaSequencia();
                    break;
                case 4:
                    pergunta4.showResponse();
                    break;
                case 5:
                    leitura.nextLine();
                    System.out.println("Digite sua string para ser invertida.");
                    String stringReversa = leitura.nextLine();
                    String stringInvertida = inverter.inverterString(stringReversa);
                    System.out.println(stringInvertida);
                    break;
                default:
                    System.out.println("Obrigado pela oportunidade. =)");
                    break;
            }
        }
    }
}
