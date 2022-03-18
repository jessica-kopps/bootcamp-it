package pratica2.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

import static pratica2.demo.MyService.converterEmPt;

@RestController
@RequestMapping("/convMorse")
@Controller
public class MyController {


    @GetMapping("{morse}")
    public String convMorse(@PathVariable() String morse) {
        return converterEmPt(morse);
    }
}