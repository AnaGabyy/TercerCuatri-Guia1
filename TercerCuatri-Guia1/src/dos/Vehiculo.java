package dos;

public abstract class Vehiculo {

    private TipoCombustible tipoCombustible;

    public Vehiculo(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public abstract String arrancar();

    public String arrancarVehiculo(TipoCombustible tipoCombustible){
        return arrancar();
    }

}
