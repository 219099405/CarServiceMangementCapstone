package za.ac.cput.carservice.domain;

import jakarta.persistence.Entity;
import java.util.Objects;

@Entity
public class Mechanic extends User {

    private String specialization;
    private String contactInfo;

    protected Mechanic() {
        super();
    }

    private Mechanic(Builder builder) {
        super(builder.userBuilder);
        this.specialization = builder.specialization;
        this.contactInfo = builder.contactInfo;
    }

    public String getSpecialization() { return specialization; }
    public String getContactInfo() { return contactInfo; }

    public void updateSpecialization(String newSpecialization) {
        if (newSpecialization == null || newSpecialization.isBlank()) {
            throw new IllegalArgumentException("Specialization cannot be blank");
        }
        this.specialization = newSpecialization.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanic)) return false;
        if (!super.equals(o)) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(specialization, mechanic.specialization) &&
                Objects.equals(contactInfo, mechanic.contactInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specialization, contactInfo);
    }

    public static class Builder {
        private User.Builder userBuilder;
        private String specialization;
        private String contactInfo;

        public Builder(User.Builder userBuilder) {
            this.userBuilder = userBuilder;
        }

        public Builder specialization(String specialization) {
            this.specialization = specialization;
            return this;
        }

        public Builder contactInfo(String contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }

        public Mechanic build() {
            if (specialization == null || specialization.isBlank()) {
                throw new IllegalStateException("Specialization is required");
            }
            return new Mechanic(this);
        }
    }
}
