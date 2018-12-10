package emsamablajecomputadoras.creacional;

public class ConstruirZenbook extends ConstruirCom {
	@Override
	public void construirplaca() {
		// TODO Auto-generated method stub
		com.setPlaca(new Mainboard("Prime","Z370"));
	}

	@Override
	public void construirSO() {
		// TODO Auto-generated method stub
		com.setOs(new SistemaOperativo("Windows",64,"10 HOME"));
	}

	@Override
	public void construirComponentes() {
		// TODO Auto-generated method stub
		com.setMarca("Asus");
		com.setModelo("Zenbook");
		com.setRam(16);
		com.setAlmacenamiento(500);
		
	}
}
