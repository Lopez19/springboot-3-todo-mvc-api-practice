package com.horacioing.todoappmvc.mappers;

public interface IMapper<I, O> {
    O map(I in);
}
