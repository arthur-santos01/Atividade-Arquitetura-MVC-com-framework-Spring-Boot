package br.fatecrl.mvcd.controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

import br.fatecrl.mvcd.models.Filme;

@RestController
@RequestMapping("/api/filmes")
public class FilmeApiController {

    private static final List<Filme> filmes = new ArrayList<Filme>();

    public FilmeApiController() {
        filmes.add(new Filme("Titanic", "James Cameron", "Paramount"));
        filmes.add(new Filme("Vingadores", "Cláudio Nunes", "FATEC RL"));
        filmes.add(new Filme("Vingadores 2", "Rui Silvestrin", "Ru LTDA"));
    }
    @GetMapping 
    public List<Filme> getFilmes()
    {
        return filmes;
    }
}
