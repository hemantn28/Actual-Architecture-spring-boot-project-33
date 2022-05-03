package com.example.demo.service;

import com.example.demo.model.King;
import com.example.demo.repository.KingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class KingDBService {

    //Create
    @Autowired
    KingRepository repository;

    public String add(King king){
        repository.save(king);
        return "king added to db successfully...";
    }

    //Get


    public List<King> getAll(){
        return repository.findAll();

    }


    //Update


    public String update(@RequestParam String name,@RequestParam Integer id){
        King king=repository.getById(id);
        king.setName("Maharana Pratap");
        repository.save(king);
        return "king added to db successfully...";
    }


    //Delete


    public String delete(@PathVariable Integer id){
        repository.deleteById(id);
        return "king deleted in db successfully...";

    }
}
