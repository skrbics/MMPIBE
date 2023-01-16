package si.unm.fis.skrbic.mmpibe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import si.unm.fis.skrbic.mmpibe.domain.TestCard;
import si.unm.fis.skrbic.mmpibe.services.TestCardService;

@RestController
public class TestCardController {

    private TestCardService tcs;
    public TestCardController(TestCardService tcs) {
        this.tcs = tcs;
    }

    @GetMapping("/testcard")
    public TestCard getNextTestCard(String userId){
        return tcs.getNextTestCard(userId);
    }
    @GetMapping("/hello")
    public String hello(){
        return "Hello!";
    }
}
