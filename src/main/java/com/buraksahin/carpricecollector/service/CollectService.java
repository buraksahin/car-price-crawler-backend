package com.buraksahin.carpricecollector.service;


import com.buraksahin.carpricecollector.domain.request.CollectRequest;
import com.buraksahin.carpricecollector.domain.vo.CarVO;

import java.util.List;

public interface CollectService {
    String createCarCollection(CollectRequest collectRequest);
}
