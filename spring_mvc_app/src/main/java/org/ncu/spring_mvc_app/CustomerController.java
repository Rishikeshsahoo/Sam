package org.ncu.spring_mvc_app;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class CustomerController {
	ArrayList<Entity> cuss;
	ArrayList<Entity> seller;
	ArrayList<Product> products;
	ArrayList<Product> cart;
	
	CustomerController()
	{
		cuss=new ArrayList<Entity>();
		seller=new ArrayList<Entity>();
		products=new ArrayList<Product>();
		cart=new ArrayList<Product>();
	}
@ModelAttribute("entity")	public Entity getUser() {
		
		return new Entity();
	}
@ModelAttribute("product")	public Product getUser2() {
	
	return new Product();
}
	
	
	@RequestMapping("/showsigup")
	public String showsignup() 
	{
		return "signup";
	}
	
	@RequestMapping("/showseller")
	public String showseller() 
	{
		return "sellerpage";
	}
	@RequestMapping("/customerpage")
	public String shocustomer() 
	{
		return "customerpage";
	}
	
	@RequestMapping("/addentity")
	public String addcustomer(@ModelAttribute("entity")Entity entity,BindingResult br,Model model,HttpServletRequest req) 
	{
		HttpSession session=req.getSession();
		System.out.println(cuss);
		System.out.println(seller);
		
		if(entity.getType().equals("Customer")) 
		{
			cuss.add(entity);
			session.setAttribute("customers", cuss);
			return "customerpage";
		}
		else if(entity.getType().equals("Seller")) 
		{
			seller.add(entity);
			session.setAttribute("sellers", seller);
			return "sellerpage";
		}
		
		return "signup";
	}
	@RequestMapping("/addproduct")
	public String addproduct(@ModelAttribute("product") Product product,BindingResult br,Model model,HttpServletRequest req) 
	{
		HttpSession session=req.getSession();
		products.add(product);
		session.setAttribute("products", products);
		System.out.println(products);
		return "sellerpage";
	}
	
	@RequestMapping("/addtocart")
	public RedirectView addtocart(HttpServletRequest req) 
	{
		int i=Integer.parseInt(req.getParameter("count"));
		HttpSession session =req.getSession();
		cart.add(products.get(i));
		
		session.setAttribute("cart", cart);
		return new RedirectView("/spring_mvc_app/customerpage");
		
	}
	@RequestMapping("/viewcart")
	public String viewcart() 
	{
		return "viewcart";
	}
	
	@RequestMapping("/checkout")
	public String checkout() 
	{
		cart.removeAll(cart);
		return "index";
	}

}
