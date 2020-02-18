package es.pildoraspruebaannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.pildoraspruebaannotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {

	
	//definir el bena para InformeFinancieroDtoCompras
	@Bean
	public CreacionInformeFinanciero imformeFinancieroDtoCompras () {
		
		return new InformefinancieroDtoCompras();
		
	}
	
	//definir bean para DirectorFinanciero e inyectar dependencias
	@Bean
	public Empleados directorFinanciero() {
	
		return new DirectorFinanciero(imformeFinancieroDtoCompras());
		
	}
}
