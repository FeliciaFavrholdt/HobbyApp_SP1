package dk.favrholdt.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@ToString

@Entity
@Table(name = "account")

@NamedQueries({
        @NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a"),
        @NamedQuery(name = "Account.findByUsername", query = "SELECT a FROM Account a WHERE a.username = :username")
})
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Integer id;

    @Column(name = "username", nullable = false)
    private String username;

    @Temporal(TemporalType.DATE)
    @Column(name = "created", nullable = false)
    private LocalDate created;

    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    private AccountDetail accountDetail;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private Set<Hobby> hobbies = new HashSet<>();

    public Account(String username, LocalDate created, AccountDetail accountDetail, Set<Hobby> hobbies) {
        this.username = username;
        this.created = created;
        this.accountDetail = accountDetail;
        this.hobbies = hobbies;
    }


    //bi directional update
    public void addAccountDetail(AccountDetail accountDetail){
        this.accountDetail = accountDetail;
        if (accountDetail != null) {
            accountDetail.setAccount(this);
        }
    }


}