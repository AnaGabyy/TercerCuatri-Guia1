package primerEjercicio;

import java.util.ArrayList;

public class Piloto extends Empleado{

    private int experiencia;
    private ArrayList<TipoIdioma>tipoIdiomas;

    public Piloto(String nombre, String fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    public Piloto(int experiencia, ArrayList<TipoIdioma> tipoIdiomas) {
        this.experiencia = experiencia;
        this.tipoIdiomas = tipoIdiomas;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public ArrayList<TipoIdioma> getTipoIdiomas() {
        return tipoIdiomas;
    }

    public void setTipoIdiomas(ArrayList<TipoIdioma> tipoIdiomas) {
        this.tipoIdiomas = tipoIdiomas;
    }
}
