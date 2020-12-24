package lab3paradigmas;

/**
 *
 * @author Jaime Carrasco
 */
public class Usuario{
	private String username;
	private String pass;
	private int reputacion;

	public Usuario(String username,String pass,int reputacion){
		this.username=username;
		this.pass=pass;
		this.reputacion=reputacion;
	}
        
	public void imprimirDatos(){
		System.out.println("User: "+username+"\nPass: "+pass+"\nReputación: "+reputacion);
	}

	public String getUser(){
		return username;
	}
	public String getPass(){
		return pass;
	}
	public int getReputacion(){
		return reputacion;
	}
}
