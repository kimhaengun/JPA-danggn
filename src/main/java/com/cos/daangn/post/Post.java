package com.cos.daangn.post;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import com.cos.daangn.user.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Post { //게시물
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Integer id; // 시퀀스, auto_increment
	   
	   //연관관계
	   @Column(nullable = false,length = 100)
	   private String title;
	   
	   @Lob //대용량 데이터
	   private String content;
	   
	   @Column(nullable = false, length = 50)
	   private int price;
	   
	   @Lob //대용량 데이터
	   private String image;
	   
	   @ColumnDefault("0")
	   private int favorite;
	   
	   @ColumnDefault("0")
	   private int view;
	   
	   //연관관계:여러개의 글을 한사람이 작성할 수 있다.
	   @ManyToOne
	   @JoinColumn(name="userId")
	   private User user;
	   
	   
	   @CreationTimestamp
	   private Timestamp createDate;
}
