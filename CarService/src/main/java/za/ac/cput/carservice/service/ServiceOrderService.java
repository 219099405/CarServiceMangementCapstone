package za.ac.cput.carservice.service;

import za.ac.cput.carservice.domain.ServiceOrder;

import java.util.List;
import java.util.Optional;

public interface ServiceOrderService {

    ServiceOrder create(ServiceOrder serviceOrder);
    Optional<ServiceOrder> read(Long id);
    ServiceOrder update(ServiceOrder serviceOrder);
    void delete(Long id);
    List<ServiceOrder> getAll();
}
