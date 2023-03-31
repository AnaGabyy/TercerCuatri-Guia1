package segundoEjercicio;

public class Coche extends Vehiculo {


    public Coche(TipoCombustible tipoCombustible) {
        super(tipoCombustible);
    }

    @Override
    public String arrancar() {
        return "El coche arrancó usando " + getTipoCombustible();
    }
}
