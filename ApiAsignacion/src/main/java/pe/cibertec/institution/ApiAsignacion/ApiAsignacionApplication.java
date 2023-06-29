package pe.cibertec.institution.ApiAsignacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiAsignacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAsignacionApplication.class, args);
	}

}
