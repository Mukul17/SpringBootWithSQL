package springwithsqlTechTable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "/tech")
@RestController
public class ControllerClass {

    @Autowired
    Repository repository;




    @GetMapping("/find")
    public Iterable<Technologies>findAll(){
        return repository.findAll();
    }


    @PostMapping(path = "/addtech")
    public String addTechnology(@RequestParam String techname, Integer usedfrom, boolean currentlyused){
        Technologies aClass = new Technologies();
        try {
            aClass.setCurrentlyused(currentlyused);
            aClass.setTechnologyname(techname);
            aClass.setUsedfrom(usedfrom);
             repository.save(aClass);
             return "saved into DB";
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
            return "Not saved";
        }

    }
}
