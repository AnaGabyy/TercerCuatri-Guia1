package segundoEjercicio;

public class Camion extends Vehiculo {

    public Camion(TipoCombustible tipoCombustible) {
        super(tipoCombustible);
    }

    @Override
    public String arrancar() {
        return "El camión arrancó usando " + getTipoCombustible();
    }
}
