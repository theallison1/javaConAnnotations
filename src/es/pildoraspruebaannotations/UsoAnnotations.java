package es.pildoraspruebaannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		
		//leer el xml de configuracion
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleados Juan= app.getBean("comercialExperimentado",Empleados.class);
		Empleados Juan1= app.getBean("comercialExperimentado",Empleados.class);
		
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInformes());
//		System.out.println(Juan);
//		System.out.println(Juan1);
		
		if (Juan==Juan1) {
			System.out.println("es el  mismo objeto");
		}else {
			System.out.println("no apuntan al mismo objeto");
		}
		app.close();
	}
}

