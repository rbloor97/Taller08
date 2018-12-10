package emsamablajecomputadoras.creacional;

public class ConstruirRoge extends ConstruirCom {
	
	@Override
	public void construirplaca() {
		// TODO Auto-generated method stub
		com.setPlaca(new Mainboard("Strix","x99"));
	}

	@Override
	public void construirSO() {
		// TODO Auto-generated method stub
		com.setOs(new SistemaOperativo("Windows",64,"10 PRO"));
	}

	@Override
	public void construirComponentes() {
		// TODO Auto-generated method stub
		com.setMarca("Asus");
		com.setModelo("ROGE");
		com.setRam(32);
		com.setAlmacenamiento(1000);
		
	}
}
