package lab3paradigmas;

/**
 * Esta clase define al tda usuario, esta contiene los datos relevantes del usuario
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

	/**
	 *
	 */
	public void imprimirDatos(){
		System.out.println("User: "+username+"\nPass: "+pass+"\nReputación: "+reputacion);
	}

	/**
	 *
	 * @return
	 */
	public String getUser(){
		return username;
	}

	/**
	 *
	 * @return
	 */
	public String getPass(){
		return pass;
	}

	/**
	 *
	 * @return
	 */
	public int getReputacion(){
		return reputacion;
	}

	public void anadirReputacion(int puntos){
		this.reputacion+=puntos;
	}
}
