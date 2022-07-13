import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Figurinhas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ncasos = scanner.nextInt();
        scanner.nextLine();
        int  j = 0;
        String[] mdcs = new String[ncasos];

        while (ncasos>0){
            int mdc = 0, menor = 0;

            String linha = scanner.nextLine();
            String[] linhaSplit = linha.split(" ");
            int f1 = parseInt(linhaSplit[0]);
            int f2 = parseInt(linhaSplit[1]);

            if (f1<f2){
                menor = f1;
            } else {
                menor = f2;
            }

            int mdctemp = menor;

            while(mdc == 0){

                if (f1%mdctemp==0 && f2%mdctemp==0){
                    mdc = mdctemp;
                } else {
                    mdctemp--;
                }
            }

            mdcs[j] = Integer.toString(mdc);
            ncasos--;
            j++;
        }

        for (int i = 0; i < j; i++){
            System.out.println(mdcs[i]);
        }

    }
}
