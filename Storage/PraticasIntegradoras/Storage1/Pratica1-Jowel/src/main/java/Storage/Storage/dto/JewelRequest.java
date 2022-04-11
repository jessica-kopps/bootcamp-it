package Storage.Storage.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JewelRequest {
    @NotBlank(message = "Material con not be blank.")
    private String material;

    @NotNull(message = "Weight can not be null.")
    @Positive(message = "Weight can not be negative")
    private Double weight;

    @NotNull(message = "Carats can not be null")
    @Positive(message = "Carats can not be negative")
    private Double carats;
}
