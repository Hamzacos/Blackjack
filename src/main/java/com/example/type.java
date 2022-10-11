package com.example;

public enum type {

    carreau("1"), 
    cœur("2"), 
    pique("3"), 
    trèfle("4");

    String typeNumber;

     type(String typeNumber){
        this.typeNumber = typeNumber;
    }
    public String toString(){
        return typeNumber;
    }

}
