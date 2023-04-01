package primerEjercicioTest;

import primerEjercicio.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*Se pide hacer una infra estructura para una compañía de aviación
        Todos los vuelos tienen un piloto, un copiloto y 4 tripulantes de cabina
        Cada empleado tiene un nombre y un día de nacimiento.
        Los Tripulantes de cabina hablan el mismo lenguaje que los pilotos, ellos pueden hablar múltiples idiomas.
        El capitán debe de tener al menos 8 años de experiencia y el copiloto 4
        El vuelo debe salir si solo cumple con estas condiciones de lo contrario va a desplegar porque fallo.*/

        ArrayList<TipoIdioma> idiomasTripulanteCabina = new ArrayList<>();
        idiomasTripulanteCabina.add(TipoIdioma.INGLES);
        idiomasTripulanteCabina.add(TipoIdioma.FRANCES);
        idiomasTripulanteCabina.add(TipoIdioma.ESPANIOL);

        ArrayList<TipoIdioma> idiomasPiloto = new ArrayList<>();
        idiomasPiloto.add(TipoIdioma.INGLES);
        idiomasPiloto.add(TipoIdioma.FRANCES);
        idiomasPiloto.add(TipoIdioma.ESPANIOL);

        Piloto piloto = new Piloto(10, idiomasPiloto);
        Copiloto copiloto = new Copiloto(8);
        TripulanteCabina tripulanteCabina1 = new TripulanteCabina(idiomasTripulanteCabina);
        TripulanteCabina tripulanteCabina2 = new TripulanteCabina(idiomasTripulanteCabina);
        TripulanteCabina tripulanteCabina3 = new TripulanteCabina(idiomasTripulanteCabina);
        TripulanteCabina tripulanteCabina4 = new TripulanteCabina(idiomasTripulanteCabina);

        ArrayList<TripulanteCabina> tripulantesCabina = new ArrayList<>();
        tripulantesCabina.add(tripulanteCabina1);
        tripulantesCabina.add(tripulanteCabina2);
        tripulantesCabina.add(tripulanteCabina3);
        tripulantesCabina.add(tripulanteCabina4);

        Vuelo vuelo = new Vuelo(piloto, copiloto, tripulantesCabina);
        System.out.println(vuelo.validarDespegue());

        System.out.println(tripulanteCabina1.getTipoIdiomas());
        System.out.println(piloto.getTipoIdiomas());

    }
}
