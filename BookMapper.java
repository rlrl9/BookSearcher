package com.example.springlab.dao;

import com.example.springlab.domain.BookDTO;
import com.example.springlab.domain.BookResultDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface BookMapper {
    @Select("select * from book")
    public List<BookDTO> listAll();
    @Select("select * from book order by price desc")
    public List<BookDTO> priceOrder();
    @Select("select * from book where price>20000")
    public List<BookDTO> order_20000();
    @Select("select * from book where kind='b02'")
    public List<BookDTO> webP();
    @Select("select * from book where kind='b04' or kind='b05'")
    public List<BookDTO> webDI();
    @Select("select * from book where title like '%자바%'")
    public List<BookDTO> webJa();
    @Select("select kind, avg(price) avgprice from book group by kind")
    public List<BookResultDTO> Avg();
    @Insert("insert into book (title, price, kind) values (#{title}, #{price}, #{kind})")
    public boolean insertB(BookDTO vo);
}
