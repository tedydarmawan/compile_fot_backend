package myor.matrix.setup.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/testing")
public class testingRestController {

	@GetMapping(path = "/data")
	public List<String> getUpdModule() {
			List<String> result = new ArrayList<String>();
			result.add("Dari backend ini boss!");
			return result;
	}
}
