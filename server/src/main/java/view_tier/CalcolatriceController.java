package view_tier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service_tier.CalcolatriceService;

@CrossOrigin("*")
@RestController
public class CalcolatriceController {

	@Autowired
    CalcolatriceService cs;

    @RequestMapping("/somma")
    public int somma(@RequestBody int a,int b) {
        return cs.addiziona(a, b);
    }
    @RequestMapping("/sottrazione")
    public int sottrai(@RequestBody int a,int b) {
        return cs.sottrai(a, b);
    }
    @RequestMapping("/moltiplicazione")
    public int moltiplica(@RequestBody int a,int b) {
        return cs.moltiplica(a, b);
    }
    @RequestMapping("/divisione")
    public int dividi(@RequestBody int a,int b) {
        return cs.dividi(a, b);
    }
}
