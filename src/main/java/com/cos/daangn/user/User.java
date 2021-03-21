package com.cos.daangn.user;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.CreationTimestamp;


import com.cos.daangn.post.Post;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User { // 유저
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Integer id; // 시퀀스, auto_increment
	   
	   @Column(nullable = false, length = 100, unique = true) // nullable = false 무조건 값이 있어야함
	   private String username;
	   
	   @Column(nullable = false, length = 100) // 123456 = 해쉬(비밀번호 암호화)
	   private String password;
	   
	   @Lob
	   private String image;
	   
	   @Column(nullable = false, length = 50)
	   private String email;
	   
	   @Column(nullable = false, length = 50)
	   private String address;
	   
	   @Enumerated(EnumType.STRING)
	   //Enum 값을 String으로
	   private RoleType role; //ADMIN,USER
	   
	   @CreationTimestamp
	   private Timestamp creDateTime; // sql
	
}
