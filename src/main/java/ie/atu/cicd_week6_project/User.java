package ie.atu.cicd_week6_project;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @NotNull(message = "Id is not valid")
    private double UserId;
    @NotBlank(message = "Name not valid")
    private int UserName;
    @Email(message = "email not valid")
    private String UserEmail;
    @NotBlank(message = "password can not be blank")
    private String UserPassword;
    @NotBlank(message = "Please enter bank details")
    private String UserBank;
    //Should users be able to access?
    private float UserPortfolioValue;
}


