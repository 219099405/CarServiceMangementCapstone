package za.ac.cput.carservice.factory;

import za.ac.cput.carservice.domain.ServiceOrder;

import java.time.LocalDate;

public class ServiceOrderFactory {

    public static ServiceOrder create(Long bookingId, Long mechanicId, String description, String status,
                                      LocalDate serviceDate) {
        return ServiceOrder.builder()
                .bookingId(bookingId)
                .mechanicId(mechanicId)
                .description(description)
                .status(status)
                .serviceDate(serviceDate)
                .build();
    }
}
