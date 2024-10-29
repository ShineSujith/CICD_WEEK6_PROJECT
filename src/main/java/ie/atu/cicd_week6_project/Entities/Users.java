package ie.atu.cicd_week6_project.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private double id;
    private String email;
    private String password;
    private String bankDetails;
    private float stockValue;
}
