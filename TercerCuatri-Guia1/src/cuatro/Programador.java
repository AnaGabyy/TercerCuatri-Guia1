package cuatro;

public class Programador extends Empleado{

    public Programador(TipoEmpleado tipoEmpleado, TipoBonificacion tipoBonificacion) {
        super(tipoEmpleado, tipoBonificacion);
    }

    @Override
    public double calcularSalario() {
        double salario = 2000.0d;

        if (TipoEmpleado.PROGRAMADOR.equals(getTipoEmpleado())) {

            switch (getTipoBonificacion()){

                case BONO:
                    salario = salario + 2000.0d;
                    break;

                case CHEQUE:
                    salario = salario + 800.0d;
                    break;

                case EXTRA:
                    salario = salario + 200.0d;
                    break;
            }

        }

        return salario;
    }
}
