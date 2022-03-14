package pl.syncode.recruitment.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.syncode.recruitment.model.TabelaTestowa;
import pl.syncode.recruitment.repo.TabelaTestowaRepository;

import java.util.List;

@Controller
public class TabelaTestowaController {

    @Autowired
    TabelaTestowaRepository tabRepo;

    @GetMapping("/column1")
    public String displayColumn1(Model model){
        List<TabelaTestowa> all = tabRepo.findDifferentColumn1();
        model.addAttribute("tabelaTestowa",all);
        return "tabelaTestowa";
    }
    @GetMapping("/column2")
    public String displayColumn2(Model model){
        List<TabelaTestowa> all = tabRepo.findDifferentColumn2();
        model.addAttribute("tabelaTestowa",all);
        return "tabelaTestowa";
    }
    @GetMapping("/column3")
    public String displayColumn3(Model model){
        List<TabelaTestowa> all = tabRepo.findDifferentColumn3();
        model.addAttribute("tabelaTestowa",all);
        return "tabelaTestowa";
    }
    @GetMapping("/column4")
    public String displayColumn4(Model model){
        List<TabelaTestowa> all = tabRepo.findDifferentColumn4();
        model.addAttribute("tabelaTestowa",all);
        return "tabelaTestowa";
    }
}
