package lab3paradigmas;

import java.util.ArrayList;

/**
 * Esta clase define a las etiqeutas para las preguntas
 * @author Jaime Carrasco
 */
public class Etiquetas {
    private ArrayList<String> tags;
    private ArrayList<String> descripcion;

    /**
     *
     * @param etiquetas
     * @param desc
     */
    public Etiquetas(ArrayList<String> etiquetas, ArrayList<String> desc){
        this.tags=etiquetas;
        this.descripcion=desc;
    }

    /**
     * @override
     */
    public Etiquetas(){
        this.tags=new ArrayList<>();
        this.descripcion=new ArrayList<>();
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public ArrayList<String> getDescripcion() {
        return descripcion;
    }

    public void anadirTags(String etiqueta, String descripcion){
        this.tags.add(etiqueta);
        this.descripcion.add(descripcion);
    }

    public void imprimirTags(){
        int i;
        System.out.println("Etiquetas:\n");
        for(i=0;i<tags.size();i++){
            System.out.println("("+(i+1)+")"+tags.get(i)+": "+descripcion.get(i));
        }
    }
}
