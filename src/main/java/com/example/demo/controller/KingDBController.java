package com.example.demo.controller;

import com.example.demo.model.King;
import com.example.demo.service.KingDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KingDBController {

    //Create
    @Autowired
    KingDBService service;

    @RequestMapping(value = "add_king_db", method = RequestMethod.POST)
    public String add(@RequestBody King king){
        return service.add(king);
    }


    //Get

    @RequestMapping(value = "get_king_db", method = RequestMethod.GET)
    public List<King> getAll(){
        return service.getAll();
    }

    //Update

    @RequestMapping(value = "update_king_db", method = RequestMethod.PUT)
    public String update(@RequestParam String name,@RequestParam Integer id){
        service.update("Maharana Pratap",139);
        return "king updated to db successfully..";

    }


    //Delete

    @RequestMapping(value = "delete_king_db/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id){
        service.delete(140);
        return "king deleted in db successfully...";

    }


}
