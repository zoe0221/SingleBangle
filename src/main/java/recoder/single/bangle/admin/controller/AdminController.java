package recoder.single.bangle.admin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private HttpServletRequest request;

	@Autowired
	private BlackListService
	
	// 관리자 페이지 진입
	@RequestMapping("")
	public String index() { return "admin/adminIndex"; }
	
	// 블랙리스트 진입
	@RequestMapping("/viewBlackList")
	public String viewBlackList() {

		return "admin/blackList";
	}
}
