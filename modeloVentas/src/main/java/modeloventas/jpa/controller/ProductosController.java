package modeloventas.jpa.controller;


import modeloventas.jpa.entity.Productos;
import modeloventas.jpa.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/productos")


public class ProductosController {

    @Autowired
    private ProductosService service;

    public ProductosController(ProductosService service) {
        this.service = service;
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Iterable<Productos>> getAll() {
        Iterable<Productos> productos = service.getProductos();
        return ResponseEntity.ok(productos);
    }

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Optional<Productos>> getById(@PathVariable Long id) {
        Optional<Productos> producto = service.getById(id);

        if (producto.isPresent()) {
            // Si el producto existe
            return ResponseEntity.ok(producto);
        } else {
            // Si el producto no existe
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Productos> create(@RequestBody Productos producto) {
        try {
            Productos nuevoProducto = service.save(producto);
            return ResponseEntity.ok(nuevoProducto);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }
    }
}