package com.example.Hit.service;

import com.example.Hit.module.Hit;

import java.util.HashMap;

public class HitService {

    private static HashMap<String,Hit> map = new HashMap<>();
        Hit obj=new Hit();
    public HashMap<String,Hit> addUser(String name){
       if(map.containsKey(name)){
           Hit temp=map.get(name);

           temp.setCount(temp.getCount()+1);
       }
       else{
           map.put(name,new Hit(name,1));

       }
        return map;
    }
}
