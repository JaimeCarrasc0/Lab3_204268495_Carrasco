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

    private Usuario getUserData(String username){
        int i;
        for (i=0;i<usuarios.size();i++){
            if (username.equals(usuarios.get(i).getUser())){
                return usuarios.get(i);
            }
        }
        return null;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public ArrayList<Usuario> getActivos() {
        return activos;
    }


    public Boolean existeUsuario(String user){
        int i;
        //String aux;
        for(i=0;i<usuarios.size();i++){
            //aux=usuarios.get(i);
            if (user.equals(usuarios.get(i).getUser())){
                return true;
            }
        }
        return false;
    }

    public void registrarUsuario(Usuario nuevoUsuario) {
        this.usuarios.add(nuevoUsuario);
    }

    public boolean login(String user, String pass) {
        int i;
        for (i = 0; i < usuarios.size(); i++) {
            if (user.equals(usuarios.get(i).getUser())) {
                if (pass.equals(usuarios.get(i).getPass())) {
                    Usuario aux = getUserData(user);
                    System.out.println("Aux=");
                    aux.imprimirDatos();
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

    public void logout(String user){
        int i;
        for(i=0;i<activos.size();i++){
            if(user.equals(activos.get(i).getUser())){
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
    Estado (con respuesta aceptada o no)
    Recompensa
    */
    //public void ask (String titulo,

}