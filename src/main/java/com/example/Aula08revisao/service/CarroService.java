package com.example.Aula08revisao.service;

import com.example.Aula08revisao.model.Carro;
import com.example.Aula08revisao.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroResponsitory;

    public Carro cadastrarCarro(Carro carro){
        return carroResponsitory.save(carro);
    }


    public List<Carro> buscarTodosCarros(){
        return carroResponsitory.findAll();
    }
}
