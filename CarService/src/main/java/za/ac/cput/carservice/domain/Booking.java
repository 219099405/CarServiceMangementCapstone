package za.ac.cput.carservice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;
    private int customerId;
    private int vehicleId;
    private LocalDate scheduledDate;
    private String status;

    public Booking(){

    }

    private Booking (Builder builder){
        this.bookingId = builder.bookingId;
        this.customerId = builder.customerId;
        this.vehicleId = builder.vehicleId;
        this.scheduledDate = builder.scheduledDate;
        this.status = builder.status;
    }

    public int getBookingId(){
        return bookingId;
    }

    public int getCustomerId(){
        return customerId;
    }

    public int getVehicleId(){
        return vehicleId;
    }

    public LocalDate getScheduledDate(){
        return scheduledDate;
    }

    public String getStatus(){
        return status;
    }

    @Override
    public String toString(){
        return "Booking{" +
                "bookingId=" + getBookingId() + "/" +
                "customerId=" + getCustomerId() + "/" +
                "vehicleId=" + getVehicleId() + "/" +
                "scheduledDate=" + getScheduledDate() + "/" +
                "status=" + getStatus() + "}" ;
    }

    public static class Builder {
        private int bookingId;
        private int customerId;
        private int vehicleId;
        private LocalDate scheduledDate;
        private String status;

        public Builder setBookingId(int bookingId){
            this.bookingId = bookingId;
            return this;
        }

        public Builder setCustomerId(int customerId){
            this.customerId = customerId;
            return this;
        }

        public Builder setVehicleId(int vehicleId){
            this.vehicleId = vehicleId;
            return this;
        }

        public Builder setScheduledDate(LocalDate scheduledDate){
            this.scheduledDate = scheduledDate;
            return this;
        }

        public Builder setStatus(String status){
            this.status = status;
            return this;
        }

        public Builder copy(Booking booking) {
            this.bookingId = booking.bookingId;
            this.customerId = booking.customerId;
            this.vehicleId = booking.vehicleId;
            this.scheduledDate = booking.scheduledDate;
            this.status = booking.status;
            return this;
        }

        public Booking build(){
            return new Booking(this);
        }
    }
}
