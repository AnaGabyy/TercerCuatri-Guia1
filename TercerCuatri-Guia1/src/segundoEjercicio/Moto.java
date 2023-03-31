package segundoEjercicio;

public class Moto extends Vehiculo {

    public Moto(TipoCombustible tipoCombustible) {
        super(tipoCombustible);
    }

    @Override
    public String arrancar() {
        return "La moto arrancó usando " + getTipoCombustible();
    }
}
