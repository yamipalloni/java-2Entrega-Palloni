package modeloventas.jpa.repository;

import modeloventas.jpa.entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Productos, Long> { }


