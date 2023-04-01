package tercerEjercicio;

public class Mesa extends Mueble{

    public Mesa(TipoMaterial tipoMaterial) {
        super(tipoMaterial);
    }

    @Override
    public String calcularPrecio() {

        double precio = 0.0d;

        if (TipoMaterial.MADERA.equals(getTipoMaterial())){
            precio = 5000.0d;

        } else if (TipoMaterial.PLASTICO.equals(getTipoMaterial())) {
            precio = 2500.0d;

        } else if (TipoMaterial.HIERRO.equals(getTipoMaterial())) {
            precio = 7000.0d;

        }

        return "La mesa de " + getTipoMaterial() + " tiene un precio de " +  precio + "$";

    }


}
