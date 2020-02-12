package es.pildoraspruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component("comercialExperimentado")
@Scope("prototype")
public class ComercialExperimentado implements Empleados {

	
	private CreacionInformeFinanciero informe;

//	@Autowired
//	public ComercialExperimentado(CreacionInformeFinanciero informe) {
//	this.informe = informe;
//}
	@Autowired
	@Qualifier("informeFinancieroTrim3")
	public void setInforme(CreacionInformeFinanciero informe) {
		this.informe = informe;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "vender , vender y vender mas!";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return informe.getInformeFinanciero();
	}

}
