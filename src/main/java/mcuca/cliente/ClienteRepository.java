package mcuca.cliente;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

	List<Cliente> findByApellidosStartsWithIgnoreCase(String apellidos);
	List<Cliente> findByTelefono(String telefono);
}
