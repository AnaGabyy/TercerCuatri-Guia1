package uno;

import java.util.ArrayList;

public class TripulanteCabina extends Empleado{

    private ArrayList<TipoIdioma>TipoIdiomas;

    public TripulanteCabina(String nombre, String fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    public TripulanteCabina(ArrayList<TipoIdioma>tipoIdiomas) {
        TipoIdiomas = tipoIdiomas;
    }

    public ArrayList<TipoIdioma> getTipoIdiomas() {
        return TipoIdiomas;
    }

    public void setTipoIdiomas(ArrayList<TipoIdioma> tipoIdiomas) {
        TipoIdiomas = tipoIdiomas;
    }
}
