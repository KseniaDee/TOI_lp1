package ru.mtusi.labwork1;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table (name = "Student")
public class group extends BaseEntity {
    private String name;
@OneToMany(fetch = FetchType.LAZY,
mappedBy = "group")
private Set<Student> students;

    public group() {
    }

    public group(Long id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        group group = (group) o;

        return name != null ? name.equals(group.name) : group.name == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "group{" +
                "id='" + getId() + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public group(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public group() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
