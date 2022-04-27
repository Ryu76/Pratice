package com.newlecture.web.controller.customer;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;

	@RequestMapping("list")
	public String list( //@RequestParam : defaultValue : name 값이 전달되지 않을때 사용할 기본값 (기본값 없이 쿼리에 전달되면 400error)
						//				  name : 전달되는 파라미터 값을 전달받을 변수명 
						//				  required : (default 값 true) 매개변수가 필수인지 여부 체크 (true or false)
						//				  value : name 과 같은 역할 그냥 똑같음;;
						// 				  페이지를 불러올때 defaultValue 나  required 가 있어야 오류가 안난다
			@RequestParam(name = "p",/* required = false*/ defaultValue = "1" ) Integer page) throws ClassNotFoundException, SQLException {
//		String p = request.getParameter("p");
		System.out.println("page:"+page);
		
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		return "notice.list";
	}

	@RequestMapping("detail")
	public String detail() {

		return "notice.detail";
	}
}
