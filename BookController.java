package com.example.springlab.controller;

import com.example.springlab.dao.BookMapper;
import com.example.springlab.domain.BookDTO;
import com.example.springlab.domain.BookResultDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BookController {
    @Autowired
    BookMapper dao;
    @GetMapping("/book")
    public String show(){
        return "bookPage";
    }
    @GetMapping("/book/b1")
    public ModelAndView listA(){
        List<BookDTO> list = dao.listAll();
        ModelAndView mav=new ModelAndView();
        mav.addObject("list",list);
        mav.setViewName("bookPage");
        return mav;
    }
    @GetMapping("/book/b2")
    public ModelAndView listP(){
        List<BookDTO> list = dao.priceOrder();
        ModelAndView mav=new ModelAndView();
        mav.addObject("list",list);
        mav.setViewName("bookPage");
        return mav;
    }
    @GetMapping("/book/b3")
    public ModelAndView list2(){
        List<BookDTO> list = dao.order_20000();
        ModelAndView mav=new ModelAndView();
        mav.addObject("list",list);
        mav.setViewName("bookPage");
        return mav;
    }
    @GetMapping("/book/b4")
    public ModelAndView listW(){
        List<BookDTO> list = dao.webP();
        ModelAndView mav=new ModelAndView();
        mav.addObject("list",list);
        mav.setViewName("bookPage");
        return mav;
    }
    @GetMapping("/book/b5")
    public ModelAndView listDI(){
        List<BookDTO> list = dao.webDI();
        ModelAndView mav=new ModelAndView();
        mav.addObject("list",list);
        mav.setViewName("bookPage");
        return mav;
    }
    @GetMapping("/book/b6")
    public ModelAndView listJa(){
        List<BookDTO> list = dao.webJa();
        ModelAndView mav=new ModelAndView();
        mav.addObject("list",list);
        mav.setViewName("bookPage");
        return mav;
    }
    @GetMapping("/book/b7")
    public ModelAndView listAvg(){
        List<BookResultDTO> list = dao.Avg();
        ModelAndView mav=new ModelAndView();
        mav.addObject("list",list);
        mav.setViewName("bookPage");
        return mav;
    }
    @PostMapping("/bookCreate")
    public ModelAndView addN(BookDTO vo){
        boolean result = dao.insertB(vo);
        ModelAndView mav = new ModelAndView();
        List<BookDTO> list=dao.listAll();
        mav.addObject("list", list);
        mav.setViewName("bookPage");
        return mav;
    }
}
