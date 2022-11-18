package com.pttk03ecommerce.service.item;

import com.pttk03ecommerce.model.item.Category;
import com.pttk03ecommerce.model.item.Publisher;

public interface PublisherService {
    Publisher addPublisher(Publisher publisher);

    Publisher updatePublisher(Publisher publisher);

    void deletePublisher(Integer id);
}
