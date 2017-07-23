package sample.freemarker;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeiController {

	@Value(value = "application.lei1:dddd")
	private String info;
	
	@RequestMapping("/lei/")
	public String t1(Map<String, Object> model) {
		model.put("lei1", this.info);
		return "welcome";
		
	}
}
