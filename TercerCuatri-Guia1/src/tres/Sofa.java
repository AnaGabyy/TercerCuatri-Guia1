package tres;

public class Sofa extends Mueble{

    public Sofa(TipoMaterial tipoMaterial) {
        super(tipoMaterial);
    }

    @Override
    public String calcularPrecio() {

        double precio = 0.0d;

        if (TipoMaterial.MADERA.equals(getTipoMaterial())){
            precio = 20000.0d;

        } else if (TipoMaterial.PLASTICO.equals(getTipoMaterial())) {
            precio = 10000.0d;

        } else if (TipoMaterial.HIERRO.equals(getTipoMaterial())) {
            precio = 50000.0d;

        }

        return "El sofá de " + getTipoMaterial() + " tiene un precio de: " +  precio + "$";

    }
}
