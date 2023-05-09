package shoppingmall.domain;

import java.util.*;
import lombok.*;
import shoppingmall.domain.*;
import shoppingmall.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCancled extends AbstractEvent {

    private Long id;
    private Long userId;
    private String product;
    private Integer qty;
    private String status;
    private Long orderId;
    private Integer productId;
    private String address;

    public DeliveryCancled(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCancled() {
        super();
    }
}
