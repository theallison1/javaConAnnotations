package es.pildoraspruebaannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component("comercialExperimentado")
public class ComercialExperimentado implements Empleados {

	//ejecucion de codigo luego de creacion del bean
	
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		 System.out.println("ejecutado tras creacion de bean!");
	}
	//ejecucion de codigo  despues de apagado el contenedor de spring
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("ejecutando antes de la destruccion");
	}
	public ComercialExperimentado() {
			
	}

	@Autowired
	@Qualifier("informeFinancieroTrim3")
	private CreacionInformeFinanciero informe;

//	@Autowired
//	public ComercialExperimentado(CreacionInformeFinanciero informe) {
//	this.informe = informe;
//}
	
//	public void setInforme(CreacionInformeFinanciero informe) {
//		this.informe = informe;
//	}

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
