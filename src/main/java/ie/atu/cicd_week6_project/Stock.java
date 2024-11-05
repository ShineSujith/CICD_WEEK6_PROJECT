package ie.atu.cicd_week6_project;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
    @PositiveOrZero(message="You must enter a valid id!")
    private int person_Id;
    @PositiveOrZero(message="You must enter a valid Stock name. Please try again.")
    private int Stock_name;
    @PositiveOrZero(message="You must enter a valid share number. Please try again.")
    private int Shares;
    @PositiveOrZero(message="You must enter a valid Stock id. Please try again.")
    private int Stock_id;
    //Do we put validation here as they shouldn't be able to edit the price of stocks, also they shouldn't be able to do anything to the DB anyway
    @PositiveOrZero(message="You must enter a valid id!")
    private int Price;

}

