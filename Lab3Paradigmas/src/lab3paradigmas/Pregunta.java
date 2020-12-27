package lab3paradigmas;

import java.util.ArrayList;
import java.util.Date;

public class Pregunta {
    /*
    ID (único y autoincremental)
    Respuestas
    Etiquetas
    Título
    Contenido
    Fecha de publicación
    Autor (usuario)
    Estado (con respuesta aceptada o no)
    Recompensa
    */
    private int ID;
    private String titulo;
    private String pregunta;
    private Date fecha;
    //private fecha; debo averiguar como hacer esto xD
    private Usuario autor;
    private boolean estado; //True=pregunta abierta, False=pregunta cerrada
    private int recompensa;
    private ArrayList<Respuesta> respuestas;

    public Pregunta(int id, String titulo, String pregunta, Usuario autor, boolean estado, int recompensa, ArrayList<Respuesta> respuestas){
        this.ID=id;
        this.titulo=titulo;
        this.pregunta=pregunta;
        this.fecha=new Date();
        this.autor=autor;
        this.estado=estado;
        this.recompensa=recompensa;
        this.respuestas=respuestas;
    }

    public int getID() {
        return ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPregunta() {
        return pregunta;
    }

    public Usuario getAutor() {
        return autor;
    }

    public boolean getEstado(){
        return estado;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }

}
