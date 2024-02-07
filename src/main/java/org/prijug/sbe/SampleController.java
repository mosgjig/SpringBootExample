package org.prijug.sbe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private SampleDAO sampleDAO;
    
    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "hello world";
    }
    
    @PostMapping(value = "blaaa/")
    @ResponseBody
    public SampleEntity save(@RequestBody SampleEntity s){
        return sampleDAO.save(s);
    }

    @GetMapping(value = "blaaa/")
    @ResponseBody
    public Iterable<SampleEntity> getAll(){
        return sampleDAO.findAll();
    }
}
