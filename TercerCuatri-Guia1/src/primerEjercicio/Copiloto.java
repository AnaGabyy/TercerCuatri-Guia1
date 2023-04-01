package primerEjercicio;

public class Copiloto extends Empleado{

    private int experiencia;

    public Copiloto(String nombre, String fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    public Copiloto(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
