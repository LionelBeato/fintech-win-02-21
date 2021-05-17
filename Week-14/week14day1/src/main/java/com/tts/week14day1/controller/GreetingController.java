package com.tts.week14day1.controller;

import com.tts.week14day1.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// @Controller is an extension of @Component
// this means spring will pick it up and utilize the component
// @Controller does not automatically have every method's return
// act as a response body -- this is only true for @RestController
@Controller
public class GreetingController {

    @GetMapping("/hello")
    @ResponseBody // this annotation tells spring to use the return as a response
    public String helloWorld() {
        return "hello world!";
    }

    // since this method is used to resolve a template
    // we do not say @ResponseBody
    // take note that @GetMapping is the same thing as saying
    // @RequestMapping(value="/greeting", method = RequestMethod.GET)
    // please remember that without the @ResponseBody
    // this method will only work with our HTML files in the templates folder
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name",
            required = false,
            defaultValue="World") String name, Model model) {
        model.addAttribute("randomValue", 452352L);
        model.addAttribute("name", name);
        return "greeting";
    }

    // the path variable here will be part of the endpoint
    @GetMapping("/greeting/var/{name}")
    @ResponseBody
    public String greetingWithPathVar(@PathVariable String name) {
        return "hello there, " + name;
    }

    // the request param here is not considered part of your endpoint
    // think of it more as an extension of your endpoint
    @GetMapping("/greeting/param/")
    @ResponseBody
    public String greetingWithParam(@RequestParam(name="name",
            required = false,
            defaultValue="World") String name) {
        return "hello there, " + name;
    }

    @PostMapping("/greeting")
    public String greetingSubmit( @ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
    }

    @ModelAttribute("greeting")
    public Greeting messages() {
        return new Greeting();
    }


}
