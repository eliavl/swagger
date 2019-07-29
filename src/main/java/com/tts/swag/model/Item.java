package com.tts.swag.model;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Item {
	    private String name;
	    private String description;
	    private String category;
	    private List<String> ingredients;
	    private double price;
	    private Date createdDate;
	    private Date updatedDate;
	}

