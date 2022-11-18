package com.pttk03ecommerce.service.impl.item;

import com.pttk03ecommerce.model.item.Publisher;
import com.pttk03ecommerce.repository.item.PublisherRepository;
import com.pttk03ecommerce.service.item.PublisherService;
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
