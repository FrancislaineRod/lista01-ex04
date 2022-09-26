import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);

        float n1,n2,n3,n4,media;
        System.out.print("Digite a 1° nota bimestral ");
        n1 = console.nextFloat();

        System.out.print("Digite a 2° nota bimestral ");
        n2 = console.nextFloat();

        System.out.print("Digite a 3° nota bimestral ");
        n3 = console.nextFloat();

        System.out.print("Digite a 4° nota bimestral ");
        n4 = console.nextFloat();

        media = (n1+n2+n3+n4)/4;

        System.out.println("A média das notas bimestrais é "+media);
        console.close();
    }
}
