package inventoryControlApp_Back;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@MapperScan(basePackages = { "com.lab.app.ketman.mybatis.mapper.*"})
public class test {
	@Autowired
//    ReplyMapper sm;


	@GetMapping("/index")
	public String index(Model model) {
//        Reply s = sm.selectByPrimaryKey(1);
//        model.addAttribute("title", s.getName());
        return "index";
    }
}
