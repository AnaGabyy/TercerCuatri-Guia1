package cuartoEjercicioTest;

import cuartoEjercicio.*;

public class Main {

    public static void main(String[] args) {

        /*Imagina que tienes una clase abstracta "Empleado" con un método abstracto "calcularSalario()",
        y las clases concretas "Gerente", "Programador" y "Vendedor" que extienden de ella. Podemos utilizar
        un enumerador "TipoEmpleado" para definir los tipos de empleados y un método
        "calcularSalarioTotal(TipoEmpleado)" que utiliza polimorfismo para llamar al método "calcularSalario()"
        en cada uno de ellos, dependiendo del tipo de empleado. Además, podemos utilizar el enumerador para
        asignar diferentes bonificaciones o descuentos a cada tipo de empleado en función de su desempeño o
        categoría.*/

        Gerente gerente1 = new Gerente(TipoEmpleado.GERENTE, TipoBonificacion.BONO);
        Gerente gerente2 = new Gerente(TipoEmpleado.GERENTE, TipoBonificacion.CHEQUE);
        Gerente gerente3 = new Gerente(TipoEmpleado.GERENTE, TipoBonificacion.EXTRA);

        System.out.println("El gerente 1, cobra: " + gerente1.calcularSalarioTotal(gerente1.getTipoEmpleado()) + "$");
        System.out.println("El gerente 2, cobra: " + gerente2.calcularSalarioTotal(gerente2.getTipoEmpleado()) + "$");
        System.out.println("El gerente 3, cobra: " + gerente3.calcularSalarioTotal(gerente3.getTipoEmpleado()) + "$");
        System.out.println("------------------------");

        Programador programador1 = new Programador(TipoEmpleado.PROGRAMADOR, TipoBonificacion.BONO);
        Programador programador2 = new Programador(TipoEmpleado.PROGRAMADOR, TipoBonificacion.CHEQUE);
        Programador programador3 = new Programador(TipoEmpleado.PROGRAMADOR, TipoBonificacion.EXTRA);

        System.out.println("El programador 1, cobra: " + programador1.calcularSalarioTotal(programador1.getTipoEmpleado()) + "$");
        System.out.println("El programador 2, cobra: " + programador2.calcularSalarioTotal(programador2.getTipoEmpleado()) + "$");
        System.out.println("El programador 3, cobra: " + programador3.calcularSalarioTotal(programador3.getTipoEmpleado()) + "$");
        System.out.println("------------------------");

        Vendedor vendedor1 = new Vendedor(TipoEmpleado.VENDEDOR, TipoBonificacion.BONO);
        Vendedor vendedor2 = new Vendedor(TipoEmpleado.VENDEDOR, TipoBonificacion.CHEQUE);
        Vendedor vendedor3 = new Vendedor(TipoEmpleado.VENDEDOR, TipoBonificacion.EXTRA);

        System.out.println("El vendedor 1, cobra: " + vendedor1.calcularSalarioTotal(programador1.getTipoEmpleado()) + "$");
        System.out.println("El vendedor 2, cobra: " + vendedor2.calcularSalarioTotal(programador2.getTipoEmpleado()) + "$");
        System.out.println("El vendedor 3, cobra: " + vendedor3.calcularSalarioTotal(programador3.getTipoEmpleado()) + "$");



    }
}
