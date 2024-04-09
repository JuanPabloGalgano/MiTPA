package Domain;

public class Colaborador {

    private static Forma formaDeColaborar;
    public void colaborarCon(ONG organizacion){
        formaDeColaborar.colaborarCon(organizacion, this);
    }

}

