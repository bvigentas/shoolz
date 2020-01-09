package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class FrequencyPOJO {

    private String subject;

    private BigDecimal value;

}
