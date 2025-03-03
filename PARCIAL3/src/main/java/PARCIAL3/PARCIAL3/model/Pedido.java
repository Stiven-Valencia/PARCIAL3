package PARCIAL3.PARCIAL3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    private String id;

    @NotBlank(message = "El ID del producto no puede estar vacío")
    private String productoId;

    @Min(value = 1, message = "La cantidad debe ser al menos 1")
    private int cantidad;
}
//Se agregan anotaciones de validación (@NotBlank y @Min) para asegurar que los datos sean válidos.
//El campo id será generado automáticamente por el servicio.