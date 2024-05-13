package medio.Santanderprojeto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {


Cliente  findByEmail(String email);

List<Cliente> findByNomeContaining(String parteDoNome);

List<Cliente> findBySobrenomeContaining(String parteDoSobrenome);

List<Cliente> findByNomeContainingOrSobrenomeContaining(String parteDoNome, String parteDoSobrenome);


}
