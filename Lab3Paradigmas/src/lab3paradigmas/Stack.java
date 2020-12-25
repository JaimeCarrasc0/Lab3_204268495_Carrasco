package lab3paradigmas;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Pregunta> preguntas;
    private ArrayList<Usuario> activos;

    public Stack(ArrayList<Usuario> usuarios,ArrayList<Pregunta> preguntas,ArrayList<Usuario> activos){
        this.usuarios=usuarios;
        this.preguntas=preguntas;
        this.activos=activos;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public ArrayList<Usuario> getActivos() {
        return activos;
    }

}
