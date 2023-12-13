package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InventroyIncreased extends AbstractEvent {

    private Long id;
    private Integer qty;
    private String name;

    public InventroyIncreased(Inventory aggregate) {
        super(aggregate);
    }

    public InventroyIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
