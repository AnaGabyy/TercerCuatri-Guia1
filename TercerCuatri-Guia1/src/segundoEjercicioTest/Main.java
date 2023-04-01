package segundoEjercicioTest;

import segundoEjercicio.Camion;
import segundoEjercicio.Coche;
import segundoEjercicio.Moto;
import segundoEjercicio.TipoCombustible;

public class Main {

    public static void main(String[] args) {

        /*Imagina que tienes una clase abstracta "Vehiculo" que define un método abstracto "arrancar()",
        y las clases concretas "Coche", "Moto" y "Camion" que extienden de ella. Podemos utilizar un enumerador
        "TipoCombustible" para definir los tipos de combustible que utilizan los vehículos y un método
        "arrancarVehiculo(TipoCombustible)" que utiliza polimorfismo para llamar al método "arrancar()"
        en cada uno de ellos, dependiendo del tipo de combustible utilizado.*/

        Coche coche = new Coche(TipoCombustible.GAS);
        System.out.println(coche.arrancarVehiculo(coche.getTipoCombustible()));

        Moto moto = new Moto(TipoCombustible.NAFTA);
        System.out.println(moto.arrancarVehiculo(moto.getTipoCombustible()));

        Camion camion = new Camion(TipoCombustible.DIESEL);
        System.out.println(camion.arrancarVehiculo(camion.getTipoCombustible()));


    }
}
