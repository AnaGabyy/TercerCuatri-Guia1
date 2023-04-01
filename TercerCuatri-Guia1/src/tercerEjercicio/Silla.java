package tercerEjercicio;

public class Silla extends Mueble{

    public Silla(TipoMaterial tipoMaterial) {
        super(tipoMaterial);
    }

    @Override
    public String calcularPrecio() {

        double precio = 0.0d;

        if (TipoMaterial.MADERA.equals(getTipoMaterial())){
            precio = 4000.0d;

        } else if (TipoMaterial.PLASTICO.equals(getTipoMaterial())) {
            precio = 2000.0d;

        } else if (TipoMaterial.HIERRO.equals(getTipoMaterial())) {
            precio = 6000.0d;

        }

        return "La silla de " + getTipoMaterial() + " tiene un precio de " +  precio + "$";

    }
}
