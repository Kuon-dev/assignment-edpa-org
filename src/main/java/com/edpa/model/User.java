package com.edpa.model;
// import com.edpa.enums.Role;
// import jakarta.persistence.*;
// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.EnumType;
// import jakarta.persistence.Enumerated;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;
// import jakarta.validation.constraints.Email;
// import jakarta.validation.constraints.NotBlank;
// import jakarta.validation.constraints.Size;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;
// import org.hibernate.annotations.NaturalId;
// @Entity
// @Table(
//   name = "users",
//   uniqueConstraints = {
//     @UniqueConstraint(columnNames = { "username" }),
//     @UniqueConstraint(columnNames = { "email" }),
//   }
// )
// @Getter
// @Setter
// @NoArgsConstructor
// public class User {
//
//   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
//   private Long id;
//
//   @NotBlank
//   @Size(max = 20)
//   private String username;
//
//   @NotBlank
//   @Size(max = 50)
//   @Email
//   private String email;
//
//   @NotBlank
//   @Size(max = 120)
//   private String password;
//
//   @Enumerated(EnumType.STRING)
//   @Column(length = 20)
//   private Role role;
//
//   public User(String username, String email, String password, Role role) {
//     this.username = username;
//     this.email = email;
//     this.password = password;
//     this.role = role;
//   }
//   // If you decide not to use Lombok, you would manually add getter and setter methods here
// }
