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
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "user_name", nullable = false)
    private String username;

    @Temporal(TemporalType.DATE)
    @Column(name = "created", nullable = false)
    private LocalDate created;

    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    @Column(name = "account_detail", nullable = false)
    private AccountDetail accountDetail;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @Column(name = "hobbies", nullable = false)
    private Set<Hobby> hobbies = new HashSet<>();

    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    private User user;

    public Account(String username, LocalDate created) {
        this.username = username;
        this.created = created;
    }

    public void addAccountDetail(AccountDetail accountDetail) {
        this.accountDetail = accountDetail;
        accountDetail.setAccount(this);
    }

    public void removeAccountDetail() {
        if (accountDetail != null) {
            accountDetail.setAccount(null);
            this.accountDetail = null;
        }
    }

    public void addHobby(Hobby hobby) {
        this.hobbies.add(hobby);
    }

    public void removeHobby(Hobby hobby) {
        this.hobbies.remove(hobby);
    }

    public void addUser(User user) {
        this.user = user;
        user.setAccount(this);
    }

    public void removeUser() {
        if (user != null) {
            user.setAccount(null);
            this.user = null;
        }
    }
}