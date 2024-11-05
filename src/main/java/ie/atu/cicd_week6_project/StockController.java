package ie.atu.cicd_week6_project;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {
    /*
    add stock
    See my stocks
    Edit/sell my stocks
     */

    private final StockService myStock;
    public StockController(StockService myStock) {
        this.myStock = myStock;
    }
    @PostMapping("/newUser")
    public List<Stock> newStock(@Valid @RequestBody Stock StockObj)
    {
        return myStock.addStockService(StockObj);
    }

    @GetMapping("/checkUser")
    public List<Stock> checkStock(@Valid @RequestBody Stock StockObj)
    {
        return myStock.checkStockService(StockObj);
    }
    @PutMapping("/editUser")
    public List<Stock> editStock(@Valid @RequestBody Stock StockObj)
    {
        return myStock.editStockService(StockObj);
    }
}
