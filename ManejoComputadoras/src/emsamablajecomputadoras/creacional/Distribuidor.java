package emsamablajecomputadoras.creacional;

public class Distribuidor {
	
	private ConstruirCom dist;
	
	
	public void establecerConstructor(ConstruirCom dist) {
		this.dist = dist;
		
	}
	
	
	public void construircom() {
		dist.nuevo();
		dist.construirplaca();
		dist.construirSO();
		dist.construirComponentes();
	}
	

}
