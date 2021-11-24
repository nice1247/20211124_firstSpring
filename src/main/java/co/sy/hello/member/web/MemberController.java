package co.sy.hello.member.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// member를 처리하는 모든 메소드를 작성
@Controller
public class MemberController {
	
	@GetMapping("/memberList.do")
	public String memberList(Model model) {
		model.addAttribute("message", "멤버 리스트 입니다."); // request.setAttribute("members", memberDao.memberSelectList());
		return "member/memberList";
	}

}
