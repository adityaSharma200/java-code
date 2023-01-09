package com.anudip.hotelmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.hotelmanagement.domain.Hotel;
import com.anudip.hotelmanagement.service.HotelService;

@RestController
@RequestMapping("/Hotel-detail")
public class HotelController {	 
//	@Controller
//	public class StudentController {
//	@Autowired
//	    private HotelService service;
//	 
//	    @GetMapping("/")
//	    public String viewHomePage(Model model) {
//	        List<Hotel> liststudent = service.listAll();
//	        model.addAttribute("liststudent", liststudent);
//	        System.out.print("Get / ");
//	        return "index";
//	    }
//	 
//	    @GetMapping("/new")
//	    public String add(Model model) {
//	        model.addAttribute("student", new Hotel());
//	        return "new";
//	    }
//	 
//	    @RequestMapping(value = "/save", method = RequestMethod.POST)
//	    public String saveStudent(@ModelAttribute("student") Hotel std) {
//	        service.save(std);
//	        return "redirect:/";
//	    }
//	 
//	    @RequestMapping("/edit/{id}")
//	    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
//	        ModelAndView mav = new ModelAndView("new");
//	        Hotel std = service.get(id);
//	        mav.addObject("student", std);
//	        return mav;
//	        
//	    }
//	    @RequestMapping("/delete/{id}")
//	    public String deletestudent(@PathVariable(name = "id") int id) {
//	        service.delete(id);
//	        return "redirect:/";
//	    }
//	}
	
	
	@Autowired
	private HotelService hotelservice;
	
	
	@PostMapping("/save")
	public ResponseEntity<?>saveHotel(@RequestBody()Hotel hotel)
{
	Hotel dbhotel = hotelservice.saveHotel(hotel);
	return ResponseEntity.ok().body(dbhotel);
}
	
	@GetMapping("/hotel/{id}")
	public Hotel getData(@PathVariable("id")long contact)
	{
		return hotelservice.getHotel(contact);
	}
	
	
	
	
	@PutMapping("/hotelupdate")
	public Hotel updatedata(@RequestBody() Hotel hotel)
	{
		return hotelservice.updateHotel(hotel);
	}
	@DeleteMapping("/hotel/{id}")
public String deletedate(@PathVariable("id")long contact)
	{
		Hotel data=  hotelservice.getHotel(contact);
		
		Boolean test =  hotelservice.deleteHotel(contact);
		
		return (data != null)?(test)?"deleted success":"no contact found":"no data found";
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
