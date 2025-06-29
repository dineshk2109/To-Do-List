package com.dev.todoapp.controller;

import com.dev.todoapp.entity.ToDo;
import com.dev.todoapp.repository.todoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class todoController {

    private final todoRepository todoRepo;

    @GetMapping({"/","/home"})
    public String showHomePage(Model model){
        model.addAttribute("todos" ,todoRepo.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String add(@RequestParam String title){
        ToDo newTodo= ToDo.builder()
                .title(title)
                .completed(false)
                .build();
        todoRepo.save(newTodo);
        return "redirect:/home";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id){
        ToDo existingTodo=todoRepo.findById(id)
                .orElseThrow(()-> new RuntimeException("Todo not found: "+id));
        existingTodo.setCompleted(true);
        todoRepo.save(existingTodo);
        return "redirect:/home";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        ToDo existingTodo=todoRepo.findById(id)
                .orElseThrow(()-> new RuntimeException("Todo not found: "+id));
        todoRepo.delete(existingTodo);
        return "redirect:/";
    }
}
