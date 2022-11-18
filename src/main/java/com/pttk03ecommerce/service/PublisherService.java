package com.pttk03ecommerce.service;

import com.pttk03ecommerce.model.item.Category;
import com.pttk03ecommerce.model.item.Publisher;

import java.util.List;

public interface PublisherService {

    List<Publisher> getAll();
    Publisher addPublisher(Publisher publisher);

    Publisher updatePublisher(Publisher publisher);

    void deletePublisher(Integer id);
}
