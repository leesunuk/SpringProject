package com.study.study;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class bookController {

    private final announcementRepository announcementRepository;

    @GetMapping("/book")
    String books(Model model){
        var books = announcementRepository.findAll();
        model.addAttribute("books", books);
        return "book.html";
    }

}
