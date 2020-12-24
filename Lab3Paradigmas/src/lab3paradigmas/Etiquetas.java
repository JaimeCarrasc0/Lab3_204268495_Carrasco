package lab3paradigmas;

import java.util.ArrayList;

public class Etiquetas {
    private ArrayList<String> tags;
    private ArrayList<String> descripcion;

    public Etiquetas(ArrayList<String> etiquetas, ArrayList<String> desc){
        this.tags=etiquetas;
        this.descripcion=desc;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public ArrayList<String> getDescripcion() {
        return descripcion;
    }
}
