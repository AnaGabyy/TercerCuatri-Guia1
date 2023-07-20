package tres.tresTest;
import tres.*;

public class Main {
    public static void main(String[] args) {

        /*Supongamos que tenemos una clase abstracta "Mueble" con un método abstracto "calcularPrecio()",
        y las clases concretas "Silla", "Mesa" y "Sofa" que extienden de ella. Podemos utilizar un enumerador
        "Material" para definir los materiales con los que se construyen los muebles y un método
        "calcularPrecioTotal(Material)" que utiliza polimorfismo para llamar al método "calcularPrecio()"
        en cada uno de ellos, dependiendo del material utilizado.*/

        Mesa mesa1 = new Mesa(TipoMaterial.MADERA);
        Mesa mesa2 = new Mesa(TipoMaterial.PLASTICO);
        Mesa mesa3 = new Mesa(TipoMaterial.HIERRO);
        System.out.println(mesa1.calcularPrecioTotal(mesa1.getTipoMaterial()));
        System.out.println(mesa2.calcularPrecioTotal(mesa2.getTipoMaterial()));
        System.out.println(mesa3.calcularPrecioTotal(mesa3.getTipoMaterial()));

        System.out.println("------------------------");

        Silla silla1 = new Silla(TipoMaterial.MADERA);
        Silla silla2 = new Silla(TipoMaterial.PLASTICO);
        Silla silla3 = new Silla(TipoMaterial.HIERRO);
        System.out.println(silla1.calcularPrecioTotal(silla1.getTipoMaterial()));
        System.out.println(silla2.calcularPrecioTotal(silla2.getTipoMaterial()));
        System.out.println(silla3.calcularPrecioTotal(silla3.getTipoMaterial()));

        System.out.println("------------------------");

        Sofa sofa1 = new Sofa(TipoMaterial.MADERA);
        Sofa sofa2 = new Sofa(TipoMaterial.PLASTICO);
        Sofa sofa3 = new Sofa(TipoMaterial.HIERRO);
        System.out.println(sofa1.calcularPrecioTotal(sofa1.getTipoMaterial()));
        System.out.println(sofa2.calcularPrecioTotal(sofa2.getTipoMaterial()));
        System.out.println(sofa3.calcularPrecioTotal(sofa3.getTipoMaterial()));


    }
}
