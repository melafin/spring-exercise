package pl.wojtek.spring.controller;

import pl.wojtek.spring.model.Worker;

public interface WorkersController {

    void addWorker(String name, Integer age, Integer pay);

    void getAllWorkers();
}
