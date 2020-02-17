package es.pildoraspruebaannotations;

public class DirectorFinanciero implements Empleados {

	
	private CreacionInformeFinanciero informeFinanciero;
	
	
	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion  y direccion de las operaciones financieras de la empresa";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}

}
