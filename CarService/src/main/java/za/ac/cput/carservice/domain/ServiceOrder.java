package za.ac.cput.carservice.domain;

import javax.annotation.processing.Generated;
import java.time.LocalDate;

@Entity
public class ServiceOrder {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceOrderId;

    private Long bookingId;
    private Long mechanicId;
    private LocalDate serviceDate;
    private String description;
    private String status;


    private ServiceOrder(Builder builder) {
        this.serviceOrderId = builder.serviceOrderId;
        this.bookingId = builder.bookingId;
        this.mechanicId = builder.mechanicId;
        this.serviceDate = builder.serviceDate;
        this.description = builder.description;
        this.status = builder.status;
    }


    public static class Builder {
        private Long serviceOrderId;
        private Long bookingId;
        private Long mechanicId;
        private LocalDate serviceDate;
        private String description;
        private String status;

        public Builder serviceOrderId(Long serviceOrderId) {
            this.serviceOrderId = serviceOrderId;
            return this;
        }

        public Builder bookingId(Long bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder mechanicId(Long mechanicId) {
            this.mechanicId = mechanicId;
            return this;
        }

        public Builder serviceDate(LocalDate serviceDate) {
            this.serviceDate = serviceDate;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ServiceOrder build() {
            return new ServiceOrder(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }


    public Long getServiceOrderId() { return serviceOrderId; }
    public Long getBookingId() { return bookingId; }
    public Long getMechanicId() { return mechanicId; }
    public LocalDate getServiceDate() { return serviceDate; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }
}
