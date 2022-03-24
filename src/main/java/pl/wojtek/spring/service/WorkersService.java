package pl.wojtek.spring.service;

import pl.wojtek.spring.model.Worker;

import java.util.List;

public interface WorkersService {
    boolean addNewWorker(Worker newWorker);

    List<Worker> getAllWorkers();
}
