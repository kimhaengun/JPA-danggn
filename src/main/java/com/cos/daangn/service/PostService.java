package com.cos.daangn.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.cos.daangn.post.Post;
import com.cos.daangn.post.PostRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PostService {
	private final PostRepository postRepository;
	
	public List<Post> 전체찾기() {
		return postRepository.findAll();
	}
	
	public List<Post> 검색(String search){
		return postRepository.findBytitleContaining(search);
	}
}
