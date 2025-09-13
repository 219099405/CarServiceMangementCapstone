package za.ac.cput.carservice.service;

import org.springframework.stereotype.Service;
import za.ac.cput.carservice.domain.ServiceOrder;
import za.ac.cput.carservice.repository.ServiceOrderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceOrderServiceImplementation implements ServiceOrderService {

    private final ServiceOrderRepository repository;

    public ServiceOrderServiceImplementation(ServiceOrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public ServiceOrder create(ServiceOrder serviceOrder) {
        return repository.save(serviceOrder);
    }

    @Override
    public Optional<ServiceOrder> read(Long id) {
        return repository.findById(id);
    }

    @Override
    public ServiceOrder update(ServiceOrder serviceOrder) {
        return repository.save(serviceOrder);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<ServiceOrder> getAll() {
        return repository.findAll();
    }

}
