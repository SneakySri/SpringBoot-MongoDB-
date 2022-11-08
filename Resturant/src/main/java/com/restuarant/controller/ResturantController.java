package com.restuarant.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

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
import org.springframework.web.servlet.ModelAndView;

import com.restuarant.model.menu;
import com.restuarant.model.Resturant;
import com.restuarant.repository.MenuRepository;
import com.restuarant.repository.RestaurantRepository;



@RestController
@RequestMapping("/menu")
public class ResturantController {
	
	@Autowired
	private MenuRepository menuRepo;
	
	@Autowired
	private RestaurantRepository resRepo;
	
	
	
	
	@PostMapping("/add")
	public ResponseEntity<menu> addAll(@RequestBody menu men)
	{
		return ResponseEntity.ok(menuRepo.save(men));
	}
	
	
	@PostMapping("/res/add")
	public ResponseEntity<Resturant> addAll(@RequestBody Resturant res)
	{
		return ResponseEntity.ok(resRepo.save(res));
	}
	
//	@GetMapping("/menu/{sno}")
//	public ResponseEntity<Optional<Menu>> getmenu(@PathVariable Long sno)
//	{	
//		
//		return ResponseEntity.ok(menuRepo.findById(sno));
//	}
	
	@GetMapping("/get")
     public List<menu> getmenu()
	{

		List<menu> all=menuRepo.findAll();
		return all;
	}
	
//	@GetMapping("/menu/{sno}")
//	public menu getmenu(@PathVariable Long sno)
//	{
//		System.out.println(sno);
//		List<menu> all=menuRepo.findAll();
//
//		int n=all.size();
//		for(int i=0;i<n;i++) {
//			menu m=all.get(i);
//			if(m.getmId().equals(sno)) {
//				return m;
//			}
//		}
//		
//		return null;
//	}
	
	@GetMapping("/get/{id}")
	public Optional<menu> getMenuById(@PathVariable Long id) {
		
		return menuRepo.findById(id);
			
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteMenuId(@PathVariable Long id) {
		
		menuRepo.deleteById(id);
		return "deleted";
				
	}
	
	@RequestMapping("/menu")
	public ModelAndView ShowMenu() {
		
		List menu=menuRepo.findAll();
		HashMap<String,List<menu>> model=new HashMap();
		model.put("list",menu);
		
		return new ModelAndView("menu",model);
	
	}
	
//	
//	@GetMapping("/test")
//	public String test() {
//		return "we get it";
//		
//	}
//	
//	@GetMapping("/get")
//	public ResponseEntity<List<Patient>> getAll(){
//		return ResponseEntity.ok(patRepo.findAll());
//	}
//	
//	@GetMapping("/get/{id}")
//	public ResponseEntity<Patient> findById(@PathVariable Long id){
//		
//		return ResponseEntity.ok(patRepo.findById(id).orElse(null));
//		
//	}
//	
//	@PutMapping("/update")
//	public ResponseEntity<Patient> update(@RequestBody Patient pat){
//		
//		return ResponseEntity.ok(patRepo.save(pat));	
//	}
//	
//	
//	@DeleteMapping("/delete/{id}")
//	public ResponseEntity<Patient> delete(@PathVariable Long id){
//		
//		patRepo.findById(id).ifPresent(patRepo::delete);
//		return ResponseEntity.ok().build();	
//	}

}
