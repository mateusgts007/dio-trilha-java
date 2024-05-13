package medio.Santanderprojeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SantanderProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderProjetoApplication.class, args);

    Cliente cliente = new Cliente();
    cliente.setNome("João");
    cliente.setSobrenome("Silva");
    cliente.setEmail("joao@example.com");


    String url = "http://localhost:8080/clientes/cadastrar"; 
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<Cliente> response = restTemplate.postForEntity(url, cliente, Cliente.class);


    if (response.getStatusCode().is2xxSuccessful()) {
    Cliente clienteCadastrado = response.getBody();
    System.out.println("Cliente cadastrado com sucesso: " + clienteCadastrado);
} else {
    System.out.println("Erro ao cadastrar cliente. Código de status: " + response.getBody());
}


    }
}
