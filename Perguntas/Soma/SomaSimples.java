package Perguntas.Soma;

public  class SomaSimples {

    public void exibirSoma() {
        int indice = 13, soma = 0, k = 0;
        for(int i = 0; i < indice; i++) {
            k++;
            soma += k;
        }
        System.out.println(soma);
    }

}