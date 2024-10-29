package ie.atu.cicd_week6_project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Companies {
    private String stockName;
    private float price;
}
