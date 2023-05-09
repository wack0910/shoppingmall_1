package shoppingmall.domain;

import java.util.*;
import lombok.Data;
import shoppingmall.infra.AbstractEvent;

@Data
public class OrderCancled extends AbstractEvent {

    private Long id;
    private Long userId;
    private Integer qty;
    private Integer productId;
    private String address;
    private String status;
    private String product;
}
