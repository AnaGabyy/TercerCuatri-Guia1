package cuatro;

public class Gerente extends Empleado{

    public Gerente(TipoEmpleado tipoEmpleado, TipoBonificacion tipoBonificacion) {
        super(tipoEmpleado, tipoBonificacion);
    }

    @Override
    public double calcularSalario() {
        double salario = 3000.0d;

        if (TipoEmpleado.GERENTE.equals(getTipoEmpleado())) {

            switch (getTipoBonificacion()){

                case BONO:
                    salario = salario + 1000.0d;
                    break;

                case CHEQUE:
                    salario = salario + 500.0d;
                    break;

                case EXTRA:
                    salario = salario + 100.0d;
                    break;
            }

        }

        return salario;
    }
}
