
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // LENDO TECLADO
        Scanner scanner = new Scanner(System.in);
        String valores = scanner.nextLine();

        // SEPARANDO VALORES
        String[] valoresArray = valores.split(" ");
        int m = Integer.parseInt(valoresArray[0]);
        int n = Integer.parseInt(valoresArray[1]);
        long nfat=n, mfat=m;

        // TRATANDO CASO SENA 0! = 1
        if (n == 0){
            nfat = 1;
        }
        if (m == 0){
            mfat = 1;
        }

        // REALIZANDO OPERAÇÕES DO FATORIAL
        while (n>1){
            nfat = nfat * (n-1);
            n--;
        }
        while (m>1){
            mfat = mfat * (m-1);
            m--;
        }

        // IMPRIMINDO RESULTADO
        System.out.println(mfat+nfat);
    }
}
