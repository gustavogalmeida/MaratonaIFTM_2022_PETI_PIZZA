import java.util.Scanner;

import static java.lang.String.valueOf;

public class Godel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sequencia = scanner.nextInt();
        scanner.nextLine();

        String linhaAnterior;
        linhaAnterior = "3";
        String[] arrayLinhaAnterior = new String[linhaAnterior.length()];

        for (int i = 0; i <= sequencia; i++){
            arrayLinhaAnterior = new String[linhaAnterior.length()];


            //passando linhaAnterior para arrayLinhaAnterior
            for (int j = 0; j<(linhaAnterior.length()); j++){
                char charLinha = linhaAnterior.charAt(j);
                arrayLinhaAnterior[j] = valueOf(charLinha);
            }


            //fazer linha atual
            String caractere = arrayLinhaAnterior[0];
            int repeticoes = 1;
            while (caractere!=null){
                String linhaAtual = "";
                int h = 0;
                int tempSucessor=h+1;
                String valor = arrayLinhaAnterior[h];
                linhaAtual = linhaAtual+valor;
                String sucessor = arrayLinhaAnterior[tempSucessor];
                if (valor.equals(sucessor)) {
                    repeticoes++;
                    linhaAtual=linhaAtual+repeticoes;
                }
            }


        }
    }
}
