package cn.itcast.ssm.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;  
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;

import entity.Items;


@Controller  
public class ItemList2  {
	 @RequestMapping("/ItemList2.action")  
	public ModelAndView queryItems()throws Exception{  
        
        //调用Service查找数据库，查询商品列表，这里使用静态数据模拟  
		
        List<Items> itemsList=new ArrayList<Items>();  
        //向List中填充静态数据  
        Items items_1 = new Items();  
        items_1.setName("联想笔记本4444444444");  
        items_1.setPrice(6000f);  
        items_1.setDetail("ThinkPad T430 联想笔记本电脑！");  
          
        Items items_2 = new Items();  
        items_2.setName("苹果手机4444444444");  
        items_2.setPrice(5000f);  
        items_2.setDetail("iphone6苹果手机！");  
          
        itemsList.add(items_1);  
        itemsList.add(items_2);  
         

        
    	// 创建modelAndView准备填充数据、设置视图
		ModelAndView modelAndView = new ModelAndView();

		// 填充数据
		modelAndView.addObject("itemsList", itemsList);
		// 视图
		modelAndView.setViewName("order/itemsList");

  
        return modelAndView;  
    }  

}
