package cuatro;

public class Vendedor extends Empleado{

    public Vendedor(TipoEmpleado tipoEmpleado, TipoBonificacion tipoBonificacion) {
        super(tipoEmpleado, tipoBonificacion);
    }

    @Override
    public double calcularSalario() {
        double salario = 1000.0d;

        if (TipoEmpleado.VENDEDOR.equals(getTipoEmpleado())) {

            switch (getTipoBonificacion()){

                case BONO:
                    salario = salario + 1000.0d;
                    break;

                case CHEQUE:
                    salario = salario + 900.0d;
                    break;

                case EXTRA:
                    salario = salario + 300.0d;
                    break;
            }

        }

        return salario;
    }
}
