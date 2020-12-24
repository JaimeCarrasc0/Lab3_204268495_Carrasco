package lab3paradigmas;

public class Respuesta {
    /*
     Considere incluir un ID (único y autoincremental)
     Autor
     Fecha de publicación
     Contenido
    */

    private int ID;
    private Usuario autor;
    //private fecha; debo averiguar como hacer esto xD
    private String respuesta;

    public Respuesta(int id, Usuario autor, String contenido){
        this.ID=id;
        this.autor=autor;
        this.respuesta=contenido;
    }

    public int getID() {
        return ID;
    }

    public Usuario getAutor() {
        return autor;
    }

    public String getRespuesta() {
        return respuesta;
    }

}