package Domain;

import java.util.List;
public class ONG {
    private List<Colaborador> colaboradores;
    private List<PersonaVulnerable> PersonasVulnerables;
    private List<Heladera> heladeras;

    public void bajaColaborador(Colaborador colaborador){
        if(colaboradores.contains(colaborador)) {
            colaboradores.remove(colaborador);
        }else{
            System.out.print("Este colaborador no se encuentra en el sistema");
        }
    }
    public void altaColaborador(Colaborador colaborador){
        if(!colaboradores.contains(colaborador)){
            colaboradores.add(colaborador);
        }else{
            System.out.print("Este colaborador ya pertenece al sistema");
        }
    }
    public void altaPersonaVulnerable(PersonaVulnerable persona){
        if(!PersonasVulnerables.contains(persona)){
            PersonasVulnerables.add(persona);
        }else{
            System.out.print("Esta persona ya esta recibiendo ayuda");
        }
    }
    public void bajaPersonaVulnerable(PersonaVulnerable persona){
        if(PersonasVulnerables.contains(persona)){
            PersonasVulnerables.add(persona);
        }else{
            System.out.print("Esta persona no esta recibiendo ayuda");
        }
    }
    public void altaHeladera(Heladera heladera){
        if(!heladeras.contains(heladera)){
            heladeras.add(heladera);
        }else{
            System.out.print("Esta heladera ya se encuentra en el sistema");
        }
    }
    public void bajaHeladera(Heladera heladera){
        if(heladeras.contains(heladera)){
            heladeras.add(heladera);
        }else{
            System.out.print("Esta heladera no se encuentra en el sistema");
        }
    }
    public void ingresarVianda(Heladera heladera, Vianda vianda){
        heladera.ingresarVianda(vianda);
    }
    public void modificarHeladera(Heladera heladera){

    }
}
