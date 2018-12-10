package emsamablajecomputadoras.creacional;

public abstract class ConstruirCom {
	
	protected Computador com;
	public void nuevo() {
		com = new Computador();
		
	}
	
	public Computador getcom() {
		return com;
	}
	
	
	public abstract void construirSO();
	public abstract void construirplaca();

}
