package demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("render")
public class Controller {
    @GetMapping
    public String f(){
        return "good it is dds";
    }
    @PostMapping
    public String g(@PathParam("nom") String nom){
        return "ton nom est :" + nom;
    }
}
