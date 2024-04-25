//package ru.first.spring;
//
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//@RestController
//public class TestController
//{
//    @GetMapping("/")
//    public String test(ModelMap modelMap)
//    {
//        modelMap.put("student", new Student("Alex","ahash@mail.ru"));
//        return "index";
//    }
//
//    @GetMapping("/teck")
//    public ModelAndView test()
//    {
//        ModelAndView model = new ModelAndView("index.jsp");
//        model.addObject("student",new Student("name","mailgmail"));
//
//        return model;
//    }
//}
//
////DataTransfer object, обёртка для json
//class Student
//{
//    public Student(String name, String email) {
//        this.name = name;
//        this.email = email;
//    }
//
//    String name;
//    String email;
//}