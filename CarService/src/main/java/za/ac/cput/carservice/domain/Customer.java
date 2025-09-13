package za.ac.cput.carservice.domain;

import jakarta.persistence.Entity;
import java.util.Objects;

@Entity
public class Customer extends User {

    private String address;

    protected Customer() {
        super();
    }

    private Customer(Builder builder) {
        super(builder.userBuilder);
        this.address = builder.address;
    }

    public String getAddress() { return address; }

    public void updateAddress(String newAddress) {
        if (newAddress == null || newAddress.isBlank()) {
            throw new IllegalArgumentException("Address cannot be blank");
        }
        this.address = newAddress.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), address);
    }

    public static class Builder {
        private User.Builder userBuilder;
        private String address;

        public Builder(User.Builder userBuilder) {
            this.userBuilder = userBuilder;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Customer build() {
            if (address == null || address.isBlank()) {
                throw new IllegalStateException("Address is required");
            }
            return new Customer(this);
        }
    }
}
