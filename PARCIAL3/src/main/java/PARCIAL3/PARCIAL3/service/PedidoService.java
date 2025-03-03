package PARCIAL3.PARCIAL3.service;


import PARCIAL3.PARCIAL3.model.Pedido;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PedidoService {
    // Simulamos una base de datos con una lista en memoria
    private final List<Pedido> pedidos = new ArrayList<>();

    public Mono<Pedido> crearPedido(Pedido pedido) {
        // Generamos un ID único para el pedido
        pedido.setId(UUID.randomUUID().toString());
        pedidos.add(pedido);
        return Mono.just(pedido);
    }

    public Flux<Pedido> listarPedidos() {
        return Flux.fromIterable(pedidos);
    }
}
//crearPedido usa Mono para devolver un solo pedido creado.
//listarPedidos usa Flux para devolver un flujo reactivo de todos los pedidos.
//        Por simplicidad, usamos una lista en memoria, pero en un escenario real se conectaría a una base de datos reactiva como MongoDB o R2DBC.