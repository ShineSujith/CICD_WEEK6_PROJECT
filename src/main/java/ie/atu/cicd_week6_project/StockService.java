package ie.atu.cicd_week6_project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockService {

    private final List<Stock> myStockList = new ArrayList<>();
    public List<Stock> addStockService(Stock StockObj)
    {
        myStockList.add(StockObj);
        return myStockList;
    }

    public List<Stock> checkStockService(Stock StockObj)
    {
        myStockList.add(StockObj);
        return myStockList;
    }

    public List<Stock> editStockService(Stock StockObj)
    {
        myStockList.add(StockObj);
        return myStockList;
    }
}
