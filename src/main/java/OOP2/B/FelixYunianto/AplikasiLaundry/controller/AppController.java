package OOP2.B.FelixYunianto.AplikasiLaundry.controller;

import OOP2.B.FelixYunianto.AplikasiLaundry.repo.LaundryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @Autowired
    private LaundryRepo laundryRepo;

    @RequestMapping("/home")
    public void index(){}

    @RequestMapping("/index")
    public void getDaftarLaundry(Model model){
        model.addAttribute("daftarLaundry", laundryRepo.findAll() );
    }
}
