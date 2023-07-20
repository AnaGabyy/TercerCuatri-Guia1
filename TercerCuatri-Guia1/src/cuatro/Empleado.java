package cuatro;

public abstract class Empleado {

    private TipoEmpleado tipoEmpleado;
    private TipoBonificacion tipoBonificacion;

    public Empleado(TipoEmpleado tipoEmpleado, TipoBonificacion tipoBonificacion) {
        this.tipoEmpleado = tipoEmpleado;
        this.tipoBonificacion = tipoBonificacion;
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public TipoBonificacion getTipoBonificacion() {
        return tipoBonificacion;
    }

    public void setTipoBonificacion(TipoBonificacion tipoBonificacion) {
        this.tipoBonificacion = tipoBonificacion;
    }

    public abstract double calcularSalario();

    public double calcularSalarioTotal(TipoEmpleado tipoEmpleado){
        return calcularSalario();
    }

}
