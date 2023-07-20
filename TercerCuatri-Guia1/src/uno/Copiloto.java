package uno;

public class Copiloto extends Empleado{

    private int experiencia;

    public Copiloto(int experiencia) {
        this.experiencia = experiencia;
    }

    public Copiloto(String nombre, String fechaNacimiento, int experiencia) {
        super(nombre, fechaNacimiento);
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
