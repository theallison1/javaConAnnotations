package es.pildoraspruebaannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		
		//leer el xml de configuracion
//		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//leer el archivo .class de configuracion reemplaza el xml
		
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		Empleados Juan= app.getBean("comercialExperimentado",Empleados.class);
		Empleados Juan1= app.getBean("comercialExperimentado",Empleados.class);
		
		Empleados Director = app.getBean("directorFinanciero",Empleados.class);
		
//		System.out.println(Director.getInformes());

		DirectorFinanciero prueba = app.getBean("directorFinanciero",DirectorFinanciero.class);
		
		System.out.println(prueba.getEmail());
		System.out.println(prueba.getNombreEmpresa());
		
		app.close();
	}
}

