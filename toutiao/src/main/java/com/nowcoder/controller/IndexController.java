package com.nowcoder.controller;

import com.nowcoder.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping(path = {"/profile/{groupId}/{userId}"})
    @ResponseBody
    public String profile(@PathVariable("groupId") int groupId,
                          @PathVariable("userId") int userId,
                          @RequestParam(value = "type", defaultValue = "1") int type,
                          @RequestParam(value="key", defaultValue = "nowcoder") String key){
        return String.format("GID{%d}, UID{%d}, TYPE{%d}, KEY{%s}", groupId, userId, type, key);
    }
    @RequestMapping(path = {"/"})
    @ResponseBody
    public String index(){
        return "Hello, LYB";
    }
    @RequestMapping(value = {"/vm"})
    public String news(Model model){
        List<String> colors = Arrays.asList(new String[]{"RED", "GREEN", "BLUE"});
        Map<String, String> map = new HashMap<String, String>();
        for(int i = 0; i < 4; ++i){
            map.put(String.valueOf(i), String.valueOf(i*i));
        }
        model.addAttribute("value1", "vv1");
        model.addAttribute("colors", colors);
        model.addAttribute("map", map);
        model.addAttribute("user", new User("Jim"));
        return "news";
    }
}
