package com.db.gerasin.testframework.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Deal {
    @Id
    private int id;
    private int amount;
    private int quantity;
    private char type;
    private int counterpartyId;
    private int instrumentId;

}
