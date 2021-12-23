package org.wecancodeit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ReviewController {
    @Resource
    private ReviewRepository reviewRepo;

    @RequestMapping("/")
    public String homePage() {
        return "index.html";
    }

    @RequestMapping("/allReviews")
    public String findAll(Model model) {
        model.addAttribute("allReviewsModel", reviewRepo.findAll());
        return "allReviewsTemplate";
    }

    @RequestMapping("/review")
    public String findOne(@RequestParam(value = "id") Long id, Model model) throws Exception {

        if (reviewRepo.findOne(id) == null) {
            throw new ReviewNotFoundException();
        }

        model.addAttribute("oneReviewModel", reviewRepo.findOne(id));
        return "oneReviewTemplate";
    }
}
