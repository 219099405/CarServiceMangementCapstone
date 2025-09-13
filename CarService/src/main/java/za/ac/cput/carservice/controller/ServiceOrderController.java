package za.ac.cput.carservice.controller;

import za.ac.cput.carservice.domain.ServiceOrder;
import za.ac.cput.carservice.service.ServiceOrderService;

import java.util.List;

@RestController
@RequestMapping("/api/service-orders")
public class ServiceOrderController {

    private final ServiceOrderService service;

    public ServiceOrderController(ServiceOrderService service) {
        this.service = service;
    }

    @PostMapping
    public ServiceOrder create(@RequestBody ServiceOrder serviceOrder) {
        return service.create(serviceOrder);
    }

    @GetMapping("/{id}")
    public ServiceOrder read(@PathVariable Long id) {
        return service.read(id).orElse(null);
    }

    @PutMapping("/{id}")
    public ServiceOrder update(@PathVariable Long id, @RequestBody ServiceOrder serviceOrder) {
        return service.update(serviceOrder);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping
    public List<ServiceOrder> getAll() {
        return service.getAll();
    }
}
