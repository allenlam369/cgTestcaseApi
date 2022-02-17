package java_coffee_cup.cgTestcaseApi;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@PutMapping("/api/rectangle_partition")
	String getResult(@RequestBody String input) {

		int w = 10;
		int h = 5;
		int[] arr1 = { 2, 5 };
		int[] arr2 = { 3 };

		return RectanglePartition.process(w, h, arr1, arr2);
	}
}
