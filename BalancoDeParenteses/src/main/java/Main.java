import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String equacao = scanner.nextLine();
            String[] equacaoArray = equacao.split("");
            int fecha = 0, abre = 0;
            boolean correto = true;
            for (int i = 0; i < equacaoArray.length; i++) {
                String carcatere = equacaoArray[i];
                if (carcatere.equals(")")) {
                    if (fecha < abre) {
                        fecha++;
                    } else {
                        correto = false; // só cai aqui quando fecha antes de abrir
                        break;
                    }
                } else if (carcatere.equals("(")) {
                    abre++;
                }
            }
            if (fecha == abre && correto == true) { // verifica se qtd é igual e se fechou antes de abrir
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }
    }
}
