package dk.favrholdt.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

@Entity
@Table(name = "address")
public class Address {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "street", nullable = false)
    private String street;

    @OneToOne
    @MapsId
    private Address address;






}
