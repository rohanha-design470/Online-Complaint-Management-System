package com.rohan.complaint.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;
@Entity
public class Complaint {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank @Size(max=100) private String fullName;
 @NotBlank @Email private String email;
 @NotBlank private String category;
 @NotBlank @Size(max=150) private String subject;
 @NotBlank @Size(max=2000) @Column(length=2000) private String description;
 private String status="Submitted";
 private LocalDateTime createdAt=LocalDateTime.now();
 public Complaint() {}
 public Long getId(){return id;} public void setId(Long id){this.id=id;}
 public String getFullName(){return fullName;} public void setFullName(String fullName){this.fullName=fullName;}
 public String getEmail(){return email;} public void setEmail(String email){this.email=email;}
 public String getCategory(){return category;} public void setCategory(String category){this.category=category;}
 public String getSubject(){return subject;} public void setSubject(String subject){this.subject=subject;}
 public String getDescription(){return description;} public void setDescription(String description){this.description=description;}
 public String getStatus(){return status;} public void setStatus(String status){this.status=status;}
 public LocalDateTime getCreatedAt(){return createdAt;} public void setCreatedAt(LocalDateTime createdAt){this.createdAt=createdAt;}
}
