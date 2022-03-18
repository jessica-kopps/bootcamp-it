package pratica1.pratica1.controller;

import pratica1.pratica1.service.AgeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Controller
public class AgeController {

    private final AgeService service;

    public AgeController(AgeService service) {
        this.service = service;
    }


    @GetMapping("{day}/{month}/{year}")
    public ResponseEntity<?> calculate(@PathVariable Integer day,
                                       @PathVariable Integer month,
                                       @PathVariable Integer year) {
        return ResponseEntity.ok("A idade da pessoa é: " + service.calculateAge(day, month, year)); //ok retorna o 200
    }

}
