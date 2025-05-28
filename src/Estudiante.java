public class Estudiante {

    private String nombre;
    private String matricula;
    private double notas[] = new double[5];

    public Estudiante() {}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota(int i) {
        if (i >= 0 && i < notas.length) {
            return notas[i];
        }
        System.out.println("Índice de nota fuera de rango");
        return 0;
    }

    public void setNota(int i, double n) {
        if (i >= 0 && i < notas.length) {
            notas[i] = n;
        } else {
            System.out.println("Índice de nota fuera de rango");
     }
    }

}
