package ie.atu.labexam;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @NotBlank(message = "Code cannot be Blank")
    private String productCode;

    @NotBlank(message = "Product must have a name")
    private String productName;

    @NotBlank(message = "Product must have a category")
    private String category;

    @Min(0)
    private int quantity;

    @Min(0)
    private int price;

}
