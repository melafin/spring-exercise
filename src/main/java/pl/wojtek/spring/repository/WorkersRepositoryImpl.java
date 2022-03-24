package pl.wojtek.spring.repository;

import pl.wojtek.spring.model.Worker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkersRepositoryImpl implements WorkersRepository {

    private final Map<String, Worker> workers = new HashMap<>();

    public boolean addWorker(Worker newWorker) {
        workers.put(newWorker.getName(), newWorker);

        return true;
    }

    public List<Worker> getAllWorkers() {
        return List.copyOf(workers.values());
    }
}
