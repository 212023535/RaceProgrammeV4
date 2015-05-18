package RaceProgram.Domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by student on 2015/04/13.
 */
@Entity
public class Drivers implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String driverName;
    private int vehicleNumber;
    @Embedded
    private Classes classCode;


    private Drivers(){}

    public Drivers(Builder builder)
    {
        classCode = builder.classCode;
        vehicleNumber = builder.vehicleNumber;
        driverName = builder.driverName;

    }

    public Classes getClassCode()
    {
        return classCode;
    }

    public Long getId() {
        return id;
    }

    public String getDriverName()
    {
        return driverName;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public static class Builder
    {
        private String driverName;
        private int vehicleNumber;
        private Classes classCode;
        private Long id;

        public Builder(int vehicleNumber)
        {
            this.vehicleNumber = vehicleNumber;
        }

        public Builder classCode(Classes value)
        {
            this.classCode = value;
            return this;
        }

        public Builder id(Long value){
            this.id=value;
            return this;
        }

        public Builder driverName(String value)
        {
            this.driverName = value;
            return this;
        }


        public Builder copy(Drivers value)
        {
            this.driverName = value.getDriverName();
            this.vehicleNumber = value.getVehicleNumber();
            this.classCode = value.getClassCode();
            return this;
        }

        public Drivers build()
        {
            return new Drivers(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drivers drivers = (Drivers) o;

        if (id != null ? !id.equals(drivers.id) : drivers.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Drivers{" +
                "driverName='" + driverName + '\'' +
                ", vehicleNumber=" + vehicleNumber +
                ", classCode='" + classCode + '\'' +
                '}';
    }
}
