package aula1.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/convNumbers")
@Controller
public class MyController {

        public int[] VALORES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        public String[] LETRAS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


        @GetMapping("{number}")
        public String roman(@PathVariable int number) {
            String romano = "";
            for (int i = 0; i < VALORES.length; i++) {
                while (number >= valores[i]) {
                    number -= VALORES[i];
                    romano += LETRAS[i];
                }
            }
            return romano;
        }

        //Exemplo de chamada -> http://localhost:8080/convNumbers?number=23
    //    @GetMapping("convNumbers")
    //    public String roman01(@RequestParam int number){
    //        String romano="";
    //        for(int i=0; i<valores.length;i++){
    //            while(number>=valores[i]){
    //                number-=valores[i];
    //                romano+=letras[i];
    //            }
    //        }
    //        return romano;
    //    }


}



