package com.zaripov.mvc.controller;

import com.zaripov.mvc.controller.dto.Recipe;
import com.zaripov.mvc.controller.dto.SampleRecipe;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("recipe")
public class AppRestController {

    @GetMapping ("{id}")
    public Recipe getRecipe(@PathVariable String id){
        return SampleRecipe.createRecipe(Integer.parseInt(id));
    }

    @PutMapping ("save")
    public void putRecipe(@RequestBody Recipe recipe){
    }
}
