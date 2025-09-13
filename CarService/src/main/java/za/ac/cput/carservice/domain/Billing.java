package za.ac.cput.carservice.domain;

import java.time.LocalDate;

@Entity
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billingId;

    @OneToOne
    @JoinColumn(name = "service_order_id", nullable = false)
    private ServiceOrder serviceOrder;

    private Double amount;
    private String paymentStatus;
    private LocalDate paymentDate;

    // --- Private constructor ---
    private Billing(Builder builder) {
        this.billingId = builder.billingId;
        this.serviceOrder = builder.serviceOrder;
        this.amount = builder.amount;
        this.paymentStatus = builder.paymentStatus;
        this.paymentDate = builder.paymentDate;
    }

    // --- Builder class ---
    public static class Builder {
        private Long billingId;
        private ServiceOrder serviceOrder;
        private Double amount;
        private String paymentStatus;
        private LocalDate paymentDate;

        public Builder billingId(Long billingId) {
            this.billingId = billingId;
            return this;
        }

        public Builder serviceOrder(ServiceOrder serviceOrder) {
            this.serviceOrder = serviceOrder;
            return this;
        }

        public Builder amount(Double amount) {
            this.amount = amount;
            return this;
        }

        public Builder paymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }

        public Builder paymentDate(LocalDate paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        public Billing build() {
            return new Billing(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    // Getters
    public Long getBillingId() { return billingId; }
    public ServiceOrder getServiceOrder() { return serviceOrder; }
    public Double getAmount() { return amount; }
    public String getPaymentStatus() { return paymentStatus; }
    public LocalDate getPaymentDate() { return paymentDate; }
}
