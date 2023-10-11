package com.example.demo.Services;

public interface IBlocService {
    Bloc addBloc(Bloc b);
    Bloc editBloc(Bloc b);
    list<Bloc> findAll();
    Bloc findById(long id);

    void deleteById(long id);
    void delete(Bloc b);

}
