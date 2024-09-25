package gpl.learn.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PruebaControler {
    @RequestMapping("/saludo")
    @ResponseBody
    public ResponseEntity<String> saludos(){
        return new ResponseEntity<>("Hola desde mi practica", HttpStatus.OK);
    }
}
