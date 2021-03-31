package ru.flamesyt.debtcount.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import javax.persistence.*;

@Entity
public class BillEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Getter @Setter
    private Double sum;

    @OneToMany(mappedBy="bill")
    @Getter @Setter
    private Set<UserEntity> users;

    @OneToMany(mappedBy="bill")
    @Getter @Setter
    private Set<TransactionEntity> transactions;

    public BillEntity() {}
}
