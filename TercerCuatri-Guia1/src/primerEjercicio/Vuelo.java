package primerEjercicio;

import java.util.ArrayList;

public class Vuelo {

    private Piloto piloto;
    private Copiloto copiloto;
    private ArrayList<TripulanteCabina>TripulantesCabina;

    public Vuelo(Piloto piloto, Copiloto copiloto, ArrayList<TripulanteCabina> tripulantesCabina) {
        this.piloto = piloto;
        this.copiloto = copiloto;
        TripulantesCabina = tripulantesCabina;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Copiloto getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(Copiloto copiloto) {
        this.copiloto = copiloto;
    }

    public ArrayList<TripulanteCabina> getTripulantesCabina() {
        return TripulantesCabina;
    }

    public void setTripulantesCabina(ArrayList<TripulanteCabina> tripulantesCabina) {
        TripulantesCabina = tripulantesCabina;
    }

    public String validarDespegue(){
        if (validarExperienciaPiloto() && validarExperienciaCopiloto() && validarIdiomasPilotoYtripulantesCabina()){
            return "El vuelo despegó";
        }else {
            return "El vuelo no despegó, no cumplen los requisitos";
        }
    }

    private boolean validarExperienciaPiloto(){
        boolean validar = true;
        if (piloto.getExperiencia() < 8){
            System.out.println("El Piloto no cumple con la experiencia necesaria (8 años o más)");
            validar = false;
        }
        return validar;
    }

    private boolean validarExperienciaCopiloto(){
        boolean validar = true;
        if (copiloto.getExperiencia() < 4){
            System.out.println("El Copiloto no cumple con la experiencia necesaria (4 años o más)");
            validar = false;
        }
        return validar;
    }

    private boolean validarIdiomasPilotoYtripulantesCabina(){

        for (TripulanteCabina tripulanteCabina: TripulantesCabina) {

            boolean validar = validarIdiomas(piloto.getTipoIdiomas(), tripulanteCabina.getTipoIdiomas());
            if(validar == false){ //evito tener que sobreiterar
                return false;
            }
        }
        return true;

    }

    private Boolean validarIdiomas(ArrayList<TipoIdioma>idiomasTripulanteCabina, ArrayList<TipoIdioma>idiomasPiloto){
        for (TipoIdioma idiomaTripulanteCabina: idiomasTripulanteCabina) { //ITERO POR EL IDIOMA DE LOS TRIPULANTES
            for (TipoIdioma idiomaPiloto: idiomasPiloto) { //ITERO POR LOS IDIOMAS DEL PILOTO

                if (idiomaPiloto.equals(idiomaTripulanteCabina)){ // SI EL VALOR EXISTE DEVUELVO TRUE DE LO CONTRARIO ES FALSO
                    return true;
                }
            }
        }
        return false;
    }


}


