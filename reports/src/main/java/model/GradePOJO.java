package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class GradePOJO {

    private String subject;

    private String semester;

    private BigDecimal value;
}
