package com.JPA.Member.Controller.QnA;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.JPA.Member.Service.QnA.Question.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import com.JPA.Member.DTO.QnA.QuestionDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/QnA/Question")
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;


    @GetMapping("/detail")
    public String QuestionDetail(Model model, @PathVariable("id") Integer id) {
        return "/QnA/Question/detail";
    }

    @GetMapping("/list")
    public String QnAList(@PageableDefault(page = 1) Pageable pageable, Model model) {
        Page<QuestionDTO> questionDTOLists = questionService.paging(pageable);
        int blockLimit = 10;
        int startPage = ((pageable.getPageNumber() / blockLimit) * blockLimit) + 1;
        int endPage = Math.min(startPage + blockLimit - 1, questionDTOLists.getTotalPages());

        model.addAttribute("questionEntityList", questionDTOLists);
        model.addAttribute("startPage", startPage);
        model.addAttribute("endPage", endPage);
        return "/QnA/Question/list"; // 앞뒤 슬래시 제거
    }

}