package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class BoletimPOJO {

    private String school;

    private String student;

    private String semester;

    private String course;

    private List<GradePOJO> grades;

    private List<FrequencyPOJO> frequency;

}
