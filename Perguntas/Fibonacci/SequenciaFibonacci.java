package Perguntas.Fibonacci;

public class SequenciaFibonacci {

    public boolean criarFibonacci (int numero) {

        int primeiroNumero = 0;
        int segundoNumero = 1;

        while (segundoNumero <= numero) {
            if(segundoNumero == numero){
                return true;
            }
            int soma = segundoNumero;
            segundoNumero = primeiroNumero + segundoNumero;
            primeiroNumero = soma;
        }
        return false;
    }
}
