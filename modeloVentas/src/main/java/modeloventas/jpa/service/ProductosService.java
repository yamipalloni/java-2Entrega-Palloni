package modeloventas.jpa.service;

import modeloventas.jpa.entity.Productos;
import modeloventas.jpa.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductosService {

    @Autowired // Le indicamos que la propiedad va a ser inyectada
    private ProductosRepository repository;

    public ProductosService(ProductosRepository repository) {
        this.repository = repository;
    }

    public Productos save(Productos producto) {
        return repository.save(producto);
    }

    public List<Productos> getProductos() {
        return repository.findAll();
    }

    public Optional<Productos> getById(Long id) {
        return repository.findById(id);
    }
}
