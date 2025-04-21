package com.study.study;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLOutput;
import java.util.ArrayList;

@Controller
@RequiredArgsConstructor
public class ItemController {


    private final ItemRepository itemRepository;

    @GetMapping("/list")
    String list(Model model){
        var result = itemRepository.findAll();
        System.out.println(result.get(0).price);
        System.out.println(result.get(0).title);
        System.out.println(result);

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        System.out.println(a);

        model.addAttribute("items", result);
        return "list.html";
    }
}
