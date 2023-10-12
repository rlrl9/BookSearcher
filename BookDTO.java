package com.example.springlab.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookDTO
{
    private int id;
    private String title;
    private int price;
    private String kind;
}
