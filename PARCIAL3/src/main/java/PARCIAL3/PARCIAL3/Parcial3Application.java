package PARCIAL3.PARCIAL3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"PARCIAL3.PARCIAL3",       // Escanea el paquete raíz
		"PARCIAL3/PARCIAL3/controller",              // Escanea el paquete de controladores
		"PARCIAL3/PARCIAL3/config"                   // Escanea el paquete de configuración
})
public class Parcial3Application {


	public static void main(String[] args) {
		SpringApplication.run(Parcial3Application.class, args);
	}

}
