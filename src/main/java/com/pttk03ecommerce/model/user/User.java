package com.pttk03ecommerce.model.user;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "user")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @Column(name = "date_of_birth")
    private LocalDateTime dateOfBirth;
    private String phone;
    private String email;
    private String gender;
    private String position;
    @Column(name = "acount_id")
    private Integer acountID;
    @Column(name = "address_id")
    private Integer addressID;
    @Column(name = "fullname_id")
    private Integer fullnameID;
}
