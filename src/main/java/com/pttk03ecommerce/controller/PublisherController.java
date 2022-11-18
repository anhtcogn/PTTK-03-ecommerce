package com.pttk03ecommerce.controller;

import com.pttk03ecommerce.model.item.Publisher;
import com.pttk03ecommerce.model.item.Publisher;
import com.pttk03ecommerce.service.PublisherService;
import com.pttk03ecommerce.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class PublisherController {
    @Autowired
    private PublisherService publisherService;

    @GetMapping
    public List<Publisher> getAll() {
        return publisherService.getAll();
    }
    @PostMapping
    public Publisher addPublisher(@RequestBody Publisher publisher) {
        return publisherService.addPublisher(publisher);
    }
    @PutMapping
    public Publisher updatePublisher(@RequestBody Publisher publisher) {
        return publisherService.updatePublisher(publisher);
    }

    @DeleteMapping
    public void deletePublisher(@RequestParam Integer publisherId) {
        publisherService.deletePublisher(publisherId);
    }
}
