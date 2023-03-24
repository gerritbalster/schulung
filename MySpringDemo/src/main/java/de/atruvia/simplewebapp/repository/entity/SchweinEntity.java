package de.atruvia.simplewebapp.repository.entity;

import java.util.Objects;
import java.util.UUID;

import org.hibernate.Hibernate;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "tbl_schweine")
public class SchweinEntity {
    @Id
    @Column(name="UUID", nullable = false)
    private UUID id;

    @Column(name="NAME", nullable = false, length = 30)
    private String name;

    @Column(name="GEWICHT", nullable = false)
    private int  gewicht;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SchweinEntity that = (SchweinEntity) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
