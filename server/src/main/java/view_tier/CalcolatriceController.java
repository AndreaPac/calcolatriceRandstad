package view_tier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import service_tier.CalcolatriceService;

@CrossOrigin("*")
@RestController
public class CalcolatriceController {

	@Autowired
	CalcolatriceService cs;
	
	public int somma(@RequestBody int a,int b) {
		return cs.addiziona(a, b);
	}
	public int sottrai(@RequestBody int a,int b) {
		return cs.sottrai(a, b);
	}
	public int moltiplica(@RequestBody int a,int b) {
		return cs.moltiplica(a, b);
	}
	public int dividi(@RequestBody int a,int b) {
		return cs.dividi(a, b);
	}
}
