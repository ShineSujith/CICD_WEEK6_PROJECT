package ie.atu.cicd_week6_project.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stocks{
    private double id;
    private String stockName;
    private float shares;
    private double stockId;
}
