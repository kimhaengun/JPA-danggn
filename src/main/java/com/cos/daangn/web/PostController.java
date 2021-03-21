package com.cos.daangn.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cos.daangn.post.Post;
import com.cos.daangn.service.PostService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class PostController {
	
	private final PostService postService;
	
	@GetMapping("/")
	public String findAll() {
		return "index";
	}
	
	@GetMapping("/hotproductForm")
	public String hotproductForm(Model model) {
		List<Post> posts = postService.전체찾기();
		model.addAttribute("posts",posts);
		return "post/hotproduct";
	}
	
	@GetMapping("/hotproductForm/")
	public String search(@RequestParam(value = "search") String search,Model model){
		List<Post> posts = postService.검색(search);
		model.addAttribute("posts",posts);
		return "post/hotproduct";
		
	}
	
}
