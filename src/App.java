import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            Estudiante e = new Estudiante();

            System.out.print("Ingrese el nombre del estudiante " + i + ": ");
            e.setNombre(sc.nextLine());

            System.out.print("Ingrese la matrícula del estudiante " + i + ": ");
            e.setMatricula(sc.nextLine());

            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese la calificación " + (j + 1) + ": ");
                double nota = sc.nextDouble();
                e.setNota(j, nota);
            }
            sc.nextLine(); 

        }

        sc.close();
    }

}