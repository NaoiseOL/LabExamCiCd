package ie.atu.labexam;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import org.hibernate.validator.constraints.Length;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @NotBlank(message="Product code cannot be blank")
    private String productCode;

    @NotBlank
    private String productName;

    @NotBlank(message = "Must have a category")
    private String category;

    @Min(0)
    private int quantity;

    @Min(1)
    private int price;

}
