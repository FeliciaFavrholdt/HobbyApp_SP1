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
@Table(name = "zipcode")
public class Zipcode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zip", nullable = false, length = 50)
    private Integer zip;

    @Column(name = "city_name", nullable = false, length = 50)
    private String city_name;

    @Column(name = "region_name", nullable = false, length = 50)
    private String region_name;

    @Column(name = "municipality_name", nullable = false, length = 50)
    private String municipality_name;

    @OneToOne(mappedBy = "zipcode", cascade = CascadeType.ALL)
    private Zipcode zipcode;

}

