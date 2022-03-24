package pl.wojtek.spring.repository;

import pl.wojtek.spring.model.Worker;

import java.util.List;

public interface WorkersRepository {
    boolean addWorker(Worker newWorker);

    List<Worker> getAllWorkers();
}
