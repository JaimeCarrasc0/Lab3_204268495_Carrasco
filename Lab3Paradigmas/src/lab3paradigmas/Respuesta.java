package lab3paradigmas;

import java.util.Date;

/**
 * Esta clase define a las respuestas de las preguntas
 * @author Jaime Carrasco
 */

public class Respuesta {
    /*
     Considere incluir un ID (único y autoincremental)
     Autor
     Fecha de publicación
     Contenido
    */

    private int ID;
    private Usuario autor;
    private Date fecha;
    //private fecha; debo averiguar como hacer esto xD
    private String respuesta;

    public Respuesta(int id, Usuario autor, String contenido){
        this.ID=id;
        this.autor=autor;
        this.fecha=new Date();
        this.respuesta=contenido;
    }

    public int getID() {
        return ID;
    }

    public Usuario getAutor() {
        return autor;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getRespuesta() {
        return respuesta;
    }

}