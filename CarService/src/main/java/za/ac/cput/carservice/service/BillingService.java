package za.ac.cput.carservice.service;

import za.ac.cput.carservice.domain.Billing;

import java.util.List;
import java.util.Optional;

public interface BillingService {
    Billing create(Billing billing);
    Optional<Billing> read(Long id);
    Billing update(Billing billing);
    void delete(Long id);
    List<Billing> getAll();
}
