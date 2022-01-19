package com.monox.bookservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/all")
    public ResponseEntity<List<String>> getBooks() {
        return ResponseEntity.ok(Arrays.asList("sadas", "fdgfdgfdd", "cbvvcbc"));
    }
}
