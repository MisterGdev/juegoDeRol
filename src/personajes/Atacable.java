package personajes;

public interface Atacable {

	public static int puntosDeVida = 100;
	public static int puntosDeDaño = 20;
	public static int puntosDeEnergia = 100;
	public static int numeroPociones = 2;
	
	public void atacar(String objetivo);
	public void restaurarEnergia();
	public void usarPocion();
	public void defender();
}
