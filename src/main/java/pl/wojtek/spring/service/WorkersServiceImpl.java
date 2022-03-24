package pl.wojtek.spring.service;

import pl.wojtek.spring.model.Worker;
import pl.wojtek.spring.repository.WorkersRepository;

import java.util.List;

public class WorkersServiceImpl implements WorkersService {

    private final WorkersRepository workersRepository;

    public WorkersServiceImpl(WorkersRepository workersRepository) {
        this.workersRepository = workersRepository;
    }

    public boolean addNewWorker(Worker newWorker) {
        return workersRepository.addWorker(newWorker);
    }

    public List<Worker> getAllWorkers() {
        return workersRepository.getAllWorkers();
    }
}
