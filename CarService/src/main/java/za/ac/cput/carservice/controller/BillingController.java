package za.ac.cput.carservice.controller;

import za.ac.cput.carservice.domain.Billing;
import za.ac.cput.carservice.service.BillingService;

import java.util.List;

@RestController
@RequestMapping("/api/billings")
public class BillingController {
    private final BillingService service;

    public BillingController(BillingService service) {
        this.service = service;
    }

    @PostMapping
    public Billing create(@RequestBody Billing billing) {
        return service.create(billing);
    }

    @GetMapping("/{id}")
    public Billing read(@PathVariable Long id) {
        return service.read(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Billing update(@PathVariable Long id, @RequestBody Billing billing) {
        return service.update(billing);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping
    public List<Billing> getAll() {
        return service.getAll();
    }
}
