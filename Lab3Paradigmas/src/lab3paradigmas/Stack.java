package lab3paradigmas;


import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Date;

/**
 * Esta clase define al stack, unidad fundamental para organizar las preguntas, usuarios y demás.
 * @author Jaime Carrasco
 */
public class Stack {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Pregunta> preguntas;
    private ArrayList<Usuario> activos;
    private ArrayList<Retenidos> retenidos;

    /**
     * @param usuarios
     * @param preguntas
     * @param activos
     */
    public Stack(ArrayList<Usuario> usuarios, ArrayList<Pregunta> preguntas, ArrayList<Usuario> activos) {
        this.usuarios = usuarios;
        this.preguntas = preguntas;
        this.activos = activos;
        this.retenidos= new ArrayList<>();
    }

    /**
     * @return
     */
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * @param username
     * @return
     */
    private Usuario getUserData(String username) {
        int i;
        for (i = 0; i < usuarios.size(); i++) {
            if (username.equals(usuarios.get(i).getUser())) {
                return usuarios.get(i);
            }
        }
        return null;
    }

    /**
     * @return
     */
    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    /**
     * @return
     */
    public ArrayList<Usuario> getActivos() {
        return activos;
    }

    /**
     * @param user
     * @return
     */
    public Boolean existeUsuario(String user) {
        int i;
        //String aux;
        for (i = 0; i < usuarios.size(); i++) {
            //aux=usuarios.get(i);
            if (user.equals(usuarios.get(i).getUser())) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param nuevoUsuario
     */
    public void registrarUsuario(Usuario nuevoUsuario) {
        this.usuarios.add(nuevoUsuario);
    }

    /**
     * @param user
     * @param pass
     * @return
     */
    public boolean login(String user, String pass) {
        int i;
        for (i = 0; i < usuarios.size(); i++) {
            if (user.equals(usuarios.get(i).getUser())) {
                if (pass.equals(usuarios.get(i).getPass())) {
                    Usuario aux = getUserData(user);
                    //System.out.println("Aux=");
                    //aux.imprimirDatos();
                    this.activos.add(aux);
                    return true;
                } else {
                    System.out.println("Clave incorrecta, intentelo de nuevo...");
                    return false;
                }
            }
        }
        return false;
    }

    /**
     * @param user
     */
    public void logout(String user) {
        int i;
        for (i = 0; i < activos.size(); i++) {
            if (user.equals(activos.get(i).getUser())) {
                activos.remove(i);
                System.out.println("Sesión cerrada con éxito!");
            }
        }
    }

    /*
    ID (único y autoincremental)
    Respuestas
    Etiquetas
    Título
    Contenido
    Fecha de publicación
    Autor (usuario)
    Estado //True=pregunta abierta, False=pregunta cerrada
    Recompensa
    */
    //public void ask (String titulo,

    /**
     *
     * @param titulo
     * @param pregunta
     * @param etiquetas
     */
    public void ask(String titulo, String pregunta, Etiquetas etiquetas) {
        //Date fechaActual = new Date();
        int id = preguntas.size();
        ArrayList<Respuesta> respuestas = new ArrayList<>();
        Usuario autor = activos.get(activos.size() - 1);

        Pregunta nuevaPregunta = new Pregunta(id, titulo, etiquetas, pregunta, autor, true, 0, respuestas);

        this.preguntas.add(nuevaPregunta);
    }

    /**
     *
     */
    public void imprimirPreguntas(){
        int i,j;
        for(i=0;i<preguntas.size();i++){
            System.out.println("════════════════════════════════════════════════════════════════════");
            System.out.println("\nID #"+preguntas.get(i).getID());
            System.out.println("Titulo: "+preguntas.get(i).getTitulo());
            for(j=0;j<preguntas.get(i).getEtiquetas().getTags().size();j++){
                System.out.println("["+preguntas.get(i).getEtiquetas().getTags().get(j)+"]: "+preguntas.get(i).getEtiquetas().getDescripcion().get(j)+"\n");
            }
            System.out.println("Pregunta: "+preguntas.get(i).getPregunta() + "\t\tRecompensa: "+preguntas.get(i).getRecompensa());
            System.out.println("Fecha consulta: "+preguntas.get(i).getFecha());
            System.out.println("Pregunta realizada por: "+preguntas.get(i).getAutor().getUser());

            if(preguntas.get(i).getRespuestas().size()==0){
                System.out.println("Esta pregunta aún no tiene respuestas, sé el primero en responder.");
            }
            else{
                System.out.println("Respuestas: ");
                for(j=0;j<preguntas.get(i).getRespuestas().size();j++){
                    preguntas.get(i).getRespuestas().get(j).imprimirRespuestas();
                }
                //realizar print respuestas en clase respuestas xD
            }
            if (preguntas.get(i).getEstado()){
                System.out.println("Esta pregunta sigue abierta, aún puedes responderla!");
            }
            else {
                System.out.println("Este hilo ya está cerrado");
            }

            //System.out.println(preguntas.get(i));
        }
    }

    /**
     *
     * @param autor
     * @override
     */
    public void imprimirPreguntas(Usuario autor){
        int i,j;
        for(i=0;i<preguntas.size();i++){
            if(preguntas.get(i).getAutor()==autor){
                System.out.println("────────────────────────────────────────────────────────────────────");
                System.out.println("ID #"+preguntas.get(i).getID());
                System.out.println("Titulo: "+preguntas.get(i).getTitulo());
                for(j=0;j<preguntas.get(i).getEtiquetas().getTags().size();j++){
                    System.out.println("["+preguntas.get(i).getEtiquetas().getTags().get(j)+"]: "+preguntas.get(i).getEtiquetas().getDescripcion().get(j)+"\n");
                }
                System.out.println("Pregunta: "+preguntas.get(i).getPregunta() + "\t\tRecompensa: "+preguntas.get(i).getRecompensa());
                System.out.println("Fecha consulta: "+preguntas.get(i).getFecha());

                if(preguntas.get(i).getRespuestas().size()==0){
                    System.out.println("Esta pregunta aún no tiene respuestas.");
                }
                /*else{
                    System.out.println("Respuestas: ");
                    for(j=0;j<preguntas.get(i).getRespuestas().size();j++){
                        preguntas.get(i).getRespuestas().get(j).imprimirRespuestas();
                    }
                    //realizar print respuestas en clase respuestas xD
                }*/
                if (preguntas.get(i).getEstado()){
                    System.out.println("Esta pregunta sigue abierta.");
                }
                else {
                    System.out.println("Este hilo ya está cerrado");
                }
            }
        }
    }

    public void imprimirRespuestas(Pregunta pregunta){
        int i;
        System.out.println("Respuestas: ");
        for(i=0;i<pregunta.getRespuestas().size();i++){
            pregunta.getRespuestas().get(i).imprimirRespuestas();
        }
    }



    /**
     *
     * @param id
     * @param respuesta
     * @return boolean
     */
    public boolean answer(int id, String respuesta){
        if (id<preguntas.size()) {
            if (preguntas.get(id).getEstado()) {
                int idRes = preguntas.get(id).getRespuestas().size();
                Respuesta res = new Respuesta(idRes, activos.get(activos.size() - 1), respuesta);
                preguntas.get(id).anadirRespuesta(res);
                return true;
            } else {
                System.out.println("La duda que intentas responder, ya está resuelta.");
                return false;
            }
        }
        System.out.println("Pregunta no existente! intentelo de nuevo.");
        return false;

    }

    /**
     *
     * @param autor
     * @param ptjeRet
     * @param pregunta
     */
    public void anadirRetencion(Usuario autor, int ptjeRet, Pregunta pregunta){
        Retenidos retencion= new Retenidos(autor, ptjeRet, pregunta);
        this.retenidos.add(retencion);
    }

    /**
     *
     * @param pregunta
     * @param recompensa
     */
    public void reward(Pregunta pregunta, int recompensa){
        Usuario persona=activos.get(activos.size()-1);
        if(recompensa<=persona.getReputacion()){
            anadirRetencion(persona,recompensa,pregunta);
        }
        else{
            System.out.println("No es posible ofrecer esa cantidad de recompensa, intentalo más tarde.");
        }
    }

    private void aplicarDescuento(Usuario donante, int puntajeResta){
        int i;
        for(i=0;i<usuarios.size();i++){
            if(usuarios.get(i) == donante){
                this.usuarios.get(i).anadirReputacion(-puntajeResta);
            }
        }
    }

    private void entregarReward(Pregunta pregunta, Usuario premiado){
        int i, recompensa=0;
        ArrayList<Integer> quitar=new ArrayList<>();
        if(retenidos.size()>=1) {
            for (i = 0; i < retenidos.size(); i++) {
                if (retenidos.get(i).getQuestion() == pregunta) {
                    recompensa += retenidos.get(i).getPuntajeRetenido();
                    //retenidos.get(i).getUser().anadirReputacion(-retenidos.get(i).getPuntajeRetenido());
                    aplicarDescuento(retenidos.get(i).getUser(), retenidos.get(i).getPuntajeRetenido());
                    quitar.add(i);
                }
            }

            for (i = 0; i < quitar.size(); i++) {
                //quitamos a los que tenían puntaje retenido ya que se les descontó el puntaje retenido.

                this.retenidos.remove(quitar.get(i));
            }
        }
        else{

            recompensa=pregunta.getRecompensa();
        }

        premiado.anadirReputacion(recompensa+15);//se añaden 15 puntos porque la respuesta fue aceptada.
    }

    public void accept(Pregunta pregunta, Respuesta respuesta){
        if(pregunta.getAutor()==activos.get(activos.size()-1)){
            entregarReward(pregunta,respuesta.getAutor());
            activos.get(activos.size()-1).anadirReputacion(2-pregunta.getRecompensa());//se agregan 2 puntos al usuario por aceptar la respuesta
        }
    }
}