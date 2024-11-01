package ie.atu.cicd_week6_project;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private double id;
    @Email(message = "email not valid")
    private String email;
    @NotBlank(message = "password can not be blank")
    private String password;
    @NotBlank(message = "Please enter bank details")
    private String bankDetails;
    private float stockValue;
}
