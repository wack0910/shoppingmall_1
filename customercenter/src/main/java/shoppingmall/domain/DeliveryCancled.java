package shoppingmall.domain;

import java.util.*;
import lombok.Data;
import shoppingmall.infra.AbstractEvent;

@Data
public class DeliveryCancled extends AbstractEvent {

    private Long id;
    private Long userId;
    private String product;
    private Integer qty;
    private String status;
    private Long orderId;
    private Integer productId;
    private String address;
}
