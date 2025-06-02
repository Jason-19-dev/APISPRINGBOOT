
package com.gamervault.gvgg.models;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
@Table(name = "users")
public class UsersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name; 

    @Column(name = "username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name= "email")
    private String email;

    @Column(name= "phone")
    private String phone;

    @Column(name= "website")
    private String website;

    @Column(name= "created_at")
    private String created_at;

    @Column(name= "updated_at")
    private String updated_at;


}
