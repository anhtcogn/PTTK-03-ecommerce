package com.pttk03ecommerce.model.user;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "fullname")
@NoArgsConstructor
public class Fullname {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String firstName;
    private String lastName;
}
