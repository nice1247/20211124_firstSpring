package co.sy.hello.notice.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {
	
	@RequestMapping("/noticeList.do")
	public String noticeList(Model model) {
		model.addAttribute("message", "공지사항 목록 입니다.");
		return "notice/noticeList";
	}
	
	@RequestMapping("/noticeSelect.do")
	public String noticeSelect(Model model) {
		
		return "redirect:memberList.do"; // jsp를 호출하지않고 직접 .do를 호출
	}
	

}
