package lab3paradigmas;

import java.util.ArrayList;
import java.util.Date;

/**
 * Esta clase define a las preguntas que realizan los usuarios
 * @author Jaime Carrasco
 */

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
    private Etiquetas tags;
    private String pregunta;
    private Date fecha;
    //private fecha; debo averiguar como hacer esto xD
    private Usuario autor;
    private boolean estado; //True=pregunta abierta, False=pregunta cerrada
    private int recompensa;
    private ArrayList<Respuesta> respuestas;

    /**
     *
     * @param id
     * @param titulo
     * @param etiquetas
     * @param pregunta
     * @param autor
     * @param estado
     * @param recompensa
     * @param respuestas
     */
    public Pregunta(int id, String titulo, Etiquetas etiquetas,String pregunta, Usuario autor, boolean estado, int recompensa, ArrayList<Respuesta> respuestas){
        this.ID=id;
        this.titulo=titulo;
        this.tags=etiquetas;
        this.pregunta=pregunta;
        this.fecha=new Date();
        this.autor=autor;
        this.estado=estado;
        this.recompensa=recompensa;
        this.respuestas=respuestas;
    }

    /**
     *
     * @return
     */
    public int getID() {
        return ID;
    }

    /**
     *
     * @return
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     *
     * @return
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     *
     * @return
     */
    public Usuario getAutor() {
        return autor;
    }

    /**
     *
     * @return
     */
    public boolean getEstado(){
        return estado;
    }

    /**
     *
     * @return
     */
    public int getRecompensa() {
        return recompensa;
    }

    /**
     *
     * @return
     */
    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }

    public Etiquetas getEtiquetas() {
        return tags;
    }

    public Date getFecha() {
        return fecha;
    }
}
