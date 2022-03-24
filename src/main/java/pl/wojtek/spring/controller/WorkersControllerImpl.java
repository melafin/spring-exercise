package pl.wojtek.spring.controller;

import pl.wojtek.spring.model.Worker;
import pl.wojtek.spring.service.WorkersService;

public class WorkersControllerImpl implements WorkersController {

    private final WorkersService workersService;

    public WorkersControllerImpl(WorkersService workersService) {
        this.workersService = workersService;
    }

    public void addWorker(String name, Integer age, Integer pay) {
        Worker newWorker = new Worker(name, age, pay);
        workersService.addNewWorker(newWorker);

        System.out.println("Added worker: " + newWorker);
    }

    public void getAllWorkers() {
        System.out.println("All workers: " + workersService.getAllWorkers());
    }
}
