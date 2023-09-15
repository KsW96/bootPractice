package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private LoginService service;

    @GetMapping
    public String login(HttpSession session) {
        if (session.getAttribute("login") != null && (Boolean) session.getAttribute("login")) {
            // If already logged in, log out by invalidating the session
            session.invalidate();
        }
        return "login";
    }

    @PostMapping("/loginCheck")
    public String loginCheck(@RequestParam("id") String id, @RequestParam("password") String password, Model model, HttpSession session) {
        boolean result = service.loginIdCheck(id, password);

        if (result) {
            // Login successful, store login information in the session
            session.setAttribute("login", true);
            return "redirect:/main"; // Redirect to the main page after successful login
        } else {
            // Login failed
            model.addAttribute("loginFail", true); // Set the loginFail attribute to display in JSP
            return "redirect:/login"; // Redirect to the login page after login failure
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // Invalidate the session to log out
        session.invalidate();
        return "redirect:/login"; // Redirect to the login page after logout
    }
}
