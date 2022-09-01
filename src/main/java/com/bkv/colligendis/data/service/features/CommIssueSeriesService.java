package com.bkv.colligendis.data.service.features;

import com.bkv.colligendis.data.entity.piece.CommIssueSeries;
import com.bkv.colligendis.data.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class CommIssueSeriesService extends AbstractService<CommIssueSeries, CommIssueSeriesRepository> {

    public CommIssueSeriesService(CommIssueSeriesRepository repository) {
        super(repository);
    }

    public CommIssueSeries findByName(String name){
        return repository.findByName(name).block();
    }
}
