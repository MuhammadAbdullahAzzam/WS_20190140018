/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web.service.assessment1;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author R.O.G
 */

@Controller 
public class DatabaseController { 
    @RequestMapping("/datamahasiswa") 
    @ResponseBody 
    public List<Datamahasiswa> getDatamahasiswa(){ 
         
        List<Datamahasiswa> datamahasiswa = new ArrayList<>(); 
         
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController(); 
         
        try { 
            datamahasiswa = controller.findDatamahasiswaEntities(); 
        } 
        catch (Exception ex){} 
         
        return datamahasiswa; 
    } 
}