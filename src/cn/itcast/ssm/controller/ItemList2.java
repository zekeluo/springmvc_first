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
        
        //����Service�������ݿ⣬��ѯ��Ʒ�б�����ʹ�þ�̬����ģ��  
		
        List<Items> itemsList=new ArrayList<Items>();  
        //��List����侲̬����  
        Items items_1 = new Items();  
        items_1.setName("����ʼǱ�4444444444");  
        items_1.setPrice(6000f);  
        items_1.setDetail("ThinkPad T430 ����ʼǱ����ԣ�");  
          
        Items items_2 = new Items();  
        items_2.setName("ƻ���ֻ�4444444444");  
        items_2.setPrice(5000f);  
        items_2.setDetail("iphone6ƻ���ֻ���");  
          
        itemsList.add(items_1);  
        itemsList.add(items_2);  
         

        
    	// ����modelAndView׼��������ݡ�������ͼ
		ModelAndView modelAndView = new ModelAndView();

		// �������
		modelAndView.addObject("itemsList", itemsList);
		// ��ͼ
		modelAndView.setViewName("order/itemsList");

  
        return modelAndView;  
    }  

}
