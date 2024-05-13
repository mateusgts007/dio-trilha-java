package medio.Santanderprojeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cadastramento {

    private final ClienteRepository clienteRepository;

    @Autowired
    public Cadastramento(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente cadastrarNovoCliente(String nome, String sobrenome, String email) {
       
        if (clienteRepository.findByEmail(email) != null) {
            throw new IllegalArgumentException("Email já cadastrado. Por favor, insira um email diferente.");
        }

        Cliente novoCliente = new Cliente();
        novoCliente.setNome(nome);
        novoCliente.setSobrenome(sobrenome);
        novoCliente.setEmail(email);
        
        return clienteRepository.save(novoCliente);
    }

        
        public boolean validarEmail(String email) {
            
            String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            return email.matches(regex);
        }
    
        
        public boolean validarNome(String nome) {
           
            return nome != null && !nome.trim().isEmpty();
        }
    
       
        public boolean validarSobrenome(String sobrenome) {
           
            return sobrenome != null && !sobrenome.trim().isEmpty();
        }


}

