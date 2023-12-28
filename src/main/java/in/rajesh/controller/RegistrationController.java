package in.rajesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.rajesh.entity.CourseEntity;
import in.rajesh.entity.StudentRegistration;
import in.rajesh.entity.TimingsEntity;
import in.rajesh.repo.CourseRepoInterface;
import in.rajesh.repo.StudentRepoInterface;
import in.rajesh.repo.TimingRepoInterface;

@Controller
public class RegistrationController {

	@Autowired
	private CourseRepoInterface crepo;

	@Autowired
	private TimingRepoInterface trepo;

	@Autowired
	private StudentRepoInterface srepo;

	/*
	 * @GetMapping("/courseDetails") public String getCourse(Model model) {
	 * List<CourseEntity> clist = crepo.findAll(); model.addAttribute("course",
	 * clist); return "index"; }
	 * 
	 * @GetMapping("/timingDetails") public String getTimings(Model model) {
	 * List<TimingsEntity> tlist = trepo.findAll(); model.addAttribute("time",
	 * tlist); return "index";
	 * 
	 * }
	 */

	@GetMapping("/StudentForm")
	public String show(Model model) {
		model.addAttribute("student", new StudentRegistration());
		List<CourseEntity> clist = crepo.findAll();
		List<TimingsEntity> tlist = trepo.findAll();
		model.addAttribute("courses", clist);
		model.addAttribute("timings", tlist);

		return "index";
	}

	@PostMapping("/studentDetails")
	public String getstudent(@ModelAttribute("student") StudentRegistration student, Model model) {
		srepo.save(student);

		model.addAttribute("success", "successfully record saved");
		return "index";

	}

}
