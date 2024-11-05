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

/*
        String DeleteSQL = "DELETE FROM User userservice WHERE userservice.UserId='"+userservice.getId()+"'";


               try {

                   // Insert a new record into the "users" table
                   PreparedStatement stmt = conn.prepareStatement("INSERT INTO User (UserId, UserName, UserEmail, UserPassword, UserBank, UserPortfolioValue) VALUES (?,?,?,?,?,?)");
                   stmt.setString(1, user.getUserId());
                   stmt.setString(2, user.getUserName());
                   stmt.setString(3, user.getUserEmail());
                   stmt.setInt(4, user.getUserPassword());
                   stmt.setString(5, user.getUserBank());
                   stmt.setInt(6, user.getUserPortfolioValue());
                   stmt.executeUpdate();

                   System.out.println("Insert completed successfully.");
               } catch (SQLException ex) {

                   System.out.println("Record insert failed.");
                   ex.printStackTrace();
               }
 */