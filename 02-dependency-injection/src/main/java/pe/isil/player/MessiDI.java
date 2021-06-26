package pe.isil.player;

import pe.isil.team.ITeam;

public class MessiDI {

    private ITeam team;

    public MessiDI() {
    }

    // inyeccion de dependencia por constructor
    public MessiDI(ITeam team) {
        this.team = team;
    }

    // inyeccion de dependencia por setter
    public void setTeam(ITeam team) {
        this.team = team;
    }

    public void showClubName(){
        team.showClubName();
    }

}
