/* Author: Omprakash */
package com.Omprakash.bookHub2.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.Omprakash.bookHub2.dao.Book2DAO;
import com.Omprakash.bookHub2.entity.Book2;

@Controller
@RequestMapping("/book2")
public class Book2Controller {

    @Autowired
    private Book2DAO bookDAO;

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("book", new Book2());
        return "addBook2";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("book") Book2 book) {
        bookDAO.addBook(book);
        return "redirect:/book2/list";
    }

    @GetMapping("/list")
    public String listBooks(Model model) {
        List<Book2> books = bookDAO.getAllBooks();
        model.addAttribute("books", books);
        return "viewBooks2";
    }
}
