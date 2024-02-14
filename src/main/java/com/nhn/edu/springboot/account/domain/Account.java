package com.nhn.edu.springboot.account.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
public class Account {
    @Id
    private Long id;

    private String number;

    private Integer balance;
}
