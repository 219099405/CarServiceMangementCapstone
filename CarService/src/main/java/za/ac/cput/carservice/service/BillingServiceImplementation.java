package za.ac.cput.carservice.service;

import org.springframework.stereotype.Service;
import za.ac.cput.carservice.domain.Billing;
import za.ac.cput.carservice.repository.BillingRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BillingServiceImplementation implements BillingService {

    private final BillingRepository repository;

    public BillingServiceImplementation(BillingRepository repository) {
        this.repository = repository;
    }

    @Override
    public Billing create(Billing billing) {
        return repository.save(billing);
    }

    @Override
    public Optional<Billing> read(Long id) {
        return repository.findById(id);
    }

    @Override
    public Billing update(Billing billing) {
        return repository.save(billing);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Billing> getAll() {
        return repository.findAll();
    }
}
