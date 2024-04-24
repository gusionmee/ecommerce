package com.api.apiblog.Rest;


import com.api.apiblog.Dto.CategoryDTO;
import com.api.apiblog.Service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryRest {
    private final   CategoryService categoryService;


    public CategoryRest(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<CategoryDTO>> getall(){
       List<CategoryDTO> categoryDTO = categoryService.getall();

       if (categoryDTO.isEmpty()){
           throw new RuntimeException("No category found");


       }
       return new ResponseEntity<>( categoryDTO, HttpStatus.OK);


    }
    @RequestMapping(value = "/{id}",method = {RequestMethod.PUT,RequestMethod.GET})
    public ResponseEntity<CategoryDTO> CreateOrUpdate(@PathVariable Long id, @RequestBody (required = false) CategoryDTO categoryDTO){
        if (categoryDTO == null){
            return new ResponseEntity<>(categoryService.getPostById(id),HttpStatus.CREATED);
        }
        return new ResponseEntity<>(categoryService.updatePost(id,categoryDTO),HttpStatus.OK);
    }
    @PostMapping()
    public ResponseEntity<CategoryDTO> createPost(@RequestBody CategoryDTO categoryDTO){
        return new ResponseEntity<>(categoryService.createPost(categoryDTO),HttpStatus.CREATED);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deletePost(@PathVariable Long id){
        categoryService.deletePost(id);
        return new ResponseEntity<>("Category deleted",HttpStatus.OK);
    }

}
