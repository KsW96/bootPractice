package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutController {
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // 세션을 무효화하여 로그아웃합니다
        session.invalidate();
        return "redirect:/login"; // 로그아웃 후 로그인 페이지로 리디렉션
    }
}
