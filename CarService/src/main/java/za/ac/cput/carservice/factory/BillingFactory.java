package za.ac.cput.carservice.factory;

import za.ac.cput.carservice.domain.Billing;
import za.ac.cput.carservice.domain.ServiceOrder;

import java.time.LocalDate;

public class BillingFactory {

    public static Billing create(ServiceOrder serviceOrder, Double amount, String paymentStatus, LocalDate paymentDate) {
        return Billing.builder()
                .serviceOrder(serviceOrder)
                .amount(amount)
                .paymentStatus(paymentStatus)
                .paymentDate(paymentDate)
                .build();
    }
}
