package com.lucas.restapi.dto;

import com.lucas.restapi.entities.User;

public class UserDTO {

    private Long id;
    private String name;

    public UserDTO(){
    }

    public UserDTO(User user) {
        id = user.getId();
        name = user.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
