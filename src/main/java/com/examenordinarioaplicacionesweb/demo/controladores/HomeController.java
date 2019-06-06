package com.examenordinarioaplicacionesweb.demo.controladores;

import com.examenordinarioaplicacionesweb.demo.Vistas.ViewConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    @GetMapping("index")
    public String mostrarPrincipal(){




        return ViewConstants.INDEX;
    }
}