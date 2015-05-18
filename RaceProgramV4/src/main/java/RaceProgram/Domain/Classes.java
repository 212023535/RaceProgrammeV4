package RaceProgram.Domain;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by student on 2015/04/13.
 */
@Entity
public class Classes implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String className;
    @Column(unique = true)
    private String classCode;
    @Embedded
    private Grid gridSize;
    @Embedded
    private RaceTimes raceTime;
    @Embedded
    private ClassSponsors classSponsors;


    private Classes(){}

    public Classes(Builder builder)
    {
        id=builder.id;
        className = builder.className;
        gridSize = builder.gridSize;
        raceTime = builder.raceTime;
        classCode = builder.classCode;
        classSponsors = builder.classSponsors;
    }

    public Long getId() {
        return id;
    }

    public String getClassName()
    {
        return className;
    }

    public String getClassCode()
    {
        return classCode;
    }

    public Grid getGridSize()
    {
        return gridSize;
    }

    public RaceTimes getRaceTime()
    {
        return raceTime;
    }

    public ClassSponsors getClassSponsors() {return classSponsors;}

    public static class Builder
    {
        private String className;
        private Grid gridSize;
        private RaceTimes raceTime;
        private String classCode;
        private Long id;
        private ClassSponsors classSponsors;

        public Builder(String classCode)
        {
            this.classCode = classCode;
        }

        public Builder gridSize(Grid value)
        {
            this.gridSize = value;
            return this;
        }

        public Builder id(Long value){
            this.id=value;
            return this;
        }

        public Builder raceTime(RaceTimes value)
        {
            this.raceTime = value;
            return this;
        }

        public Builder className(String value)
        {
            this.className = value;
            return this;
        }

        public Builder classSponsors(ClassSponsors value)
        {
            this.classSponsors = value;
            return this;
        }


        public Builder copy(Classes value)
        {
            this.classCode = value.getClassCode();
            this.className = value.getClassName();
            this.gridSize = value.getGridSize();
            this.raceTime = value.getRaceTime();
            this.classSponsors = value.getClassSponsors();
            return this;
        }

        public Classes build()
        {
            return new Classes(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Classes classes = (Classes) o;

        if (id != null ? !id.equals(classes.id) : classes.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "className='" + className + '\'' +
                ", id=" + id +
                ", classCode='" + classCode + '\'' +
                ", gridSize=" + gridSize +
                ", raceTime='" + raceTime + '\'' +
                '}';
    }
}
