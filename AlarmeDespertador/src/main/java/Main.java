import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String horarios = scanner.nextLine();
            if (horarios.equals("0 0 0 0")){// representa que não terá mais entradas
                break;
            }
            String[] horariosArray = horarios.split(" ");
            int h1 = Integer.parseInt(horariosArray[0]);
            int m1 = Integer.parseInt(horariosArray[1]);
            int h2 = Integer.parseInt(horariosArray[2]);
            int m2 = Integer.parseInt(horariosArray[3]);
            if (h1>=h2 && m1 > m2){ // vou acordar só amanhã
                h2 += 24;
            }
            int minutos = ((h2-h1)*60)+(m2-m1);
            System.out.println(minutos);
        }
    }
}
