package com.buraksahin.carpricecollector.domain.request;

import com.buraksahin.carpricecollector.domain.vo.CarVO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CollectRequest implements Serializable {
    @JsonProperty("cars")
    private List<CarVO> cars;
}