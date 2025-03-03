package PARCIAL3.PARCIAL3.controller;

import PARCIAL3.PARCIAL3.model.Producto;
import PARCIAL3.PARCIAL3.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;


@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public Flux<Producto> listarProductos() {
        return productoService.obtenerProductos();
    }
}