package ru.flamesyt.debtcount.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Getter @Setter
    @Column(length=45, nullable=false)
    private String email;

    @Getter @Setter
    @Column(length=45, nullable=false)
    private String password_hash;

    @Getter @Setter
    @Column(length=45, nullable=false)
    private String name;

    @Getter @Setter
    @Column(length=45, nullable=false)
    private String surname;

    @ManyToOne
    @JoinColumn(name="bill_id", nullable=false)
    @Getter @Setter
    private BillEntity bill;

    @OneToMany(mappedBy="user")
    @Getter @Setter
    private Set<TransactionEntity> transactions;

    @Column(length=45, nullable=false)
    @Getter @Setter
    private String role;

    public UserEntity() {}
}
