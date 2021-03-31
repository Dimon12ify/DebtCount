package ru.flamesyt.debtcount.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
import java.time.LocalDateTime;

@Entity
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Column(length=45, nullable=false)
    @Getter @Setter
    private String type;

    @Basic
    @Getter @Setter
    private LocalDateTime date;

    @Getter @Setter
    private Double amount;

    @ManyToOne
    @JoinColumn(name="bill_id", nullable=false)
    @Getter @Setter
    private BillEntity bill;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    @Getter @Setter
    private UserEntity user;

    public TransactionEntity() {}

}
