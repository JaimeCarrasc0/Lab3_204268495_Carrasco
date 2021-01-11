package lab3paradigmas;

public class Retenidos {
    private Usuario user;
    private int puntajeRetenido;
    private Pregunta question;

    public Retenidos(Usuario user, int puntaje, Pregunta pregunta){
        this.user=user;
        this.puntajeRetenido=puntaje;
        this.question=pregunta;
    }

    public Pregunta getQuestion() {
        return question;
    }

    public int getPuntajeRetenido() {
        return puntajeRetenido;
    }

    public Usuario getUser() {
        return user;
    }
}
