import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            Estudiante e = new Estudiante();

            System.out.print("Ingrese el nombre del estudiante " + i + ": ");
            e.setNombre(sc.nextLine());

            System.out.print("Ingrese la matricula del estudiante " + i + ": ");
            e.setMatricula(sc.nextLine());

            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese la calificacion " + (j + 1) + ": ");
                double nota = sc.nextDouble();
                e.setNota(j, nota);
            }
            sc.nextLine(); 

            mostrarInfo(e);

        }

        sc.close();
    }
    public static void mostrarInfo(Estudiante e) {
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Promedio: " + e.calcularPromedio());
        System.out.println("Aprobado o reprobado: " + (e.aprobado() ? "aprobado" : "reprobado"));
        System.out.println("-------------------------");
    }
}