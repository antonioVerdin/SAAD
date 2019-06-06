package com.examenordinarioaplicacionesweb.demo.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.rmi.runtime.Log;

@Controller
@RequestMapping("/index2")
public class RegistroController {
    //@GetMapping("/index")
    public String RegistroController(Model modelos , @RequestParam(name = "id_animal", required = false) String id_animal) {

      //  private UsuarioService usuarioService;




        return "index2";
    }
}
