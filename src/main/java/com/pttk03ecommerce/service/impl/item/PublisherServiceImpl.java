package com.pttk03ecommerce.service.impl.item;

import com.pttk03ecommerce.model.item.Author;
import com.pttk03ecommerce.model.item.Publisher;
import com.pttk03ecommerce.repository.item.PublisherRepository;
import com.pttk03ecommerce.service.item.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PublisherServiceImpl implements PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public List<Publisher> getAll() {
        return publisherRepository.findAll();
    }

    @Override
    public Publisher addPublisher(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    @Override
    public Publisher updatePublisher(Publisher publisher) {
        Publisher publisher1 = publisherRepository.getByID(publisher.getID());
        publisher1.setName(publisher.getName());
        publisher1.setEmail(publisher.getEmail());
        publisher1.setAddress(publisher.getAddress());
        publisher1.setStatus(publisher.getStatus());
        return publisherRepository.save(publisher1);
    }

    @Override
    public void deletePublisher(Integer id) {
        publisherRepository.deleteById(id);
    }
}
