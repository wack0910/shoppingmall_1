package shoppingmall.domain;

import java.util.*;
import lombok.*;
import shoppingmall.domain.*;
import shoppingmall.infra.AbstractEvent;

@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private Integer stock;
    private String product;

    public StockIncreased(Stock aggregate) {
        super(aggregate);
    }

    public StockIncreased() {
        super();
    }
}
