package tres;

public abstract class Mueble {

    private TipoMaterial tipoMaterial;

    public Mueble(TipoMaterial tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public TipoMaterial getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(TipoMaterial tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public abstract String calcularPrecio();

    public String calcularPrecioTotal(TipoMaterial tipoMaterial){
        return calcularPrecio();
    }

}
