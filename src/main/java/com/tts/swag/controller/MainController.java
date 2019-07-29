package com.tts.swag.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.swag.model.Item;

import io.swagger.annotations.ApiOperation;

@RestController
public class MainController {
@ApiOperation(value = "Get all menu items", response = Item.class, 
            responseContainer = "List")
@GetMapping("/items")
public ResponseEntity<List<Item>> getItems() {
  return new ResponseEntity<>(new ArrayList<Item>(), HttpStatus.OK);
}

}
