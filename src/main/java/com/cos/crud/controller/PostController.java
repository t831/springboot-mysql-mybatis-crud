package com.cos.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cos.crud.model.Post;
import com.cos.crud.repository.PostRepository;

@Controller
@RequestMapping("/post") // http://localhost:8080/post
public class PostController {

	@Autowired
	private PostRepository postRepository;

	// GET => http://localhost:8080/post
	@GetMapping("")
	// model은 data를 controller에서 presentation 계층(jsp file)까지 들고 간다
	public String postList(Model model) {
		List<Post> posts = postRepository.findAll();
		model.addAttribute("posts", posts); // key, value
		// webapp/WEB-INF/views/post/list.jsp
		return "post/list";
	}

	// POST => http://localhost:8080/post/update
	@PostMapping("/update")
	public String update(Post post) { // Param, form
		try {
			postRepository.update(post);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/post"; // 함수를 호출한다
	}

	// @RequestParam("id")
	// @RequestBody : JSON
	// GET => http://localhost:8080/post/delete/아이디
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		try {
			postRepository.delete(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/post";
	}

	// http://localhost:8080/post/save
	// POST => http://localhost:8080/post/save
	@PostMapping("/save")
	public String save(Post post) { // id = 0, createDate = null, userId = 0
		try {
			postRepository.save(post);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/post";
	}

	// GET => http://localhost:8080/post/아이디
	@GetMapping("/{id}")
	public String post(@PathVariable int id, Model model) {
		Post post = postRepository.findById(id);
		model.addAttribute("post", post);
		return "post/detail";
	}
	
	// GET => http://localhost:8080/post/writeForm
	@GetMapping("/writeForm")
	public String writeForm() {
		return "post/writeForm";
	}

	// GET => http://localhost:8080/post/updateForm
	@GetMapping("/updateForm/{id}")
	public String updateForm(@PathVariable int id, Model model) {
		Post post = postRepository.findById(id);
		model.addAttribute("post", post);
		return "post/updateForm";
	}
	
	
}
