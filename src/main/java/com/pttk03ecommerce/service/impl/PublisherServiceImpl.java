package com.pttk03ecommerce.service.impl;

import com.pttk03ecommerce.model.item.Publisher;
import com.pttk03ecommerce.repository.PublisherRepository;
import com.pttk03ecommerce.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PublisherServiceImpl implements PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public Publisher addPublisher(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    @Override
    public Publisher updatePublisher(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    @Override
    public void deletePublisher(Integer id) {
        publisherRepository.deleteById(id);
    }
}
