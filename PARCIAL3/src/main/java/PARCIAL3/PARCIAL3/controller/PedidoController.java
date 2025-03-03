package PARCIAL3.PARCIAL3.controller;
import PARCIAL3.PARCIAL3.model.Pedido;
import PARCIAL3.PARCIAL3.service.PedidoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Locale;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private MessageSource messageSource;

    @PostMapping
    public Mono<ResponseEntity<String>> crearPedido(
            @Valid @RequestBody Pedido pedido,
            @RequestParam(value = "lang", defaultValue = "en") String lang) {
        return pedidoService.crearPedido(pedido)
                .map(p -> {
                    Locale locale = new Locale(lang);
                    String mensaje = messageSource.getMessage("pedido.creado", null, locale);
                    return ResponseEntity.status(HttpStatus.CREATED).body(mensaje);
                });
    }

    @GetMapping
    public Flux<Pedido> listarPedidos() {
        return pedidoService.listarPedidos();
    }
}