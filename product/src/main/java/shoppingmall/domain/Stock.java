package shoppingmall.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import shoppingmall.ProductApplication;
import shoppingmall.domain.StockDecreased;
import shoppingmall.domain.StockIncreased;

@Entity
@Table(name = "Stock_table")
@Data
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String product;

    private Integer stock;

    @PostPersist
    public void onPostPersist() {
        StockDecreased stockDecreased = new StockDecreased(this);
        stockDecreased.publishAfterCommit();

        StockIncreased stockIncreased = new StockIncreased(this);
        stockIncreased.publishAfterCommit();
    }

    public static StockRepository repository() {
        StockRepository stockRepository = ProductApplication.applicationContext.getBean(
            StockRepository.class
        );
        return stockRepository;
    }

    public static void updateStock(DeliveryStarted deliveryStarted) {
        /** Example 1:  new item 
        Stock stock = new Stock();
        repository().save(stock);

        StockDecreased stockDecreased = new StockDecreased(stock);
        stockDecreased.publishAfterCommit();
        StockIncreased stockIncreased = new StockIncreased(stock);
        stockIncreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(stock->{
            
            stock // do something
            repository().save(stock);

            StockDecreased stockDecreased = new StockDecreased(stock);
            stockDecreased.publishAfterCommit();
            StockIncreased stockIncreased = new StockIncreased(stock);
            stockIncreased.publishAfterCommit();

         });
        */

    }

    public static void updateStock(DeliveryCancled deliveryCancled) {
        /** Example 1:  new item 
        Stock stock = new Stock();
        repository().save(stock);

        StockDecreased stockDecreased = new StockDecreased(stock);
        stockDecreased.publishAfterCommit();
        StockIncreased stockIncreased = new StockIncreased(stock);
        stockIncreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCancled.get???()).ifPresent(stock->{
            
            stock // do something
            repository().save(stock);

            StockDecreased stockDecreased = new StockDecreased(stock);
            stockDecreased.publishAfterCommit();
            StockIncreased stockIncreased = new StockIncreased(stock);
            stockIncreased.publishAfterCommit();

         });
        */

    }
}
