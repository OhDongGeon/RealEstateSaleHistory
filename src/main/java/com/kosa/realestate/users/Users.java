package com.kosa.realestate.users;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * User 클래스
 * 
 * @author 이주윤
 */
@Entity
@Table(name = "Users")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Users {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private Long userId;
  
  @Column(name = "email", nullable = false, length = 20, unique = true)
  private String email;
  
  @Column(name = "password", nullable = false, length = 1000)
  private String password;
  
  @Column(name= "nickname", nullable = false, length = 20, unique = true)
  private String nickname;
  
  @Column(name = "is_deleted", nullable = false, length = 1)
  private char isDeleted;
  

  @Column(name = "created_at", nullable = false)
  private LocalDateTime createdAt;
  
  @Column(name = "updated_at")
  private LocalDateTime updatedAt;
}