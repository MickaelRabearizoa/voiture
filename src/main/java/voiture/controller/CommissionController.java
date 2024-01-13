package voiture.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import voiture.model.Commission;
import voiture.model.Marque;
import voiture.service.CommissionService;

@RestController
@RequestMapping("/commission")
public class CommissionController {

    private final CommissionService commissionService;

    @Autowired
    public CommissionController(CommissionService commissionService) { this.commissionService = commissionService; }

    @PostMapping("/createcommission")
    public Commission createCommission(@RequestBody Commission commission) {
        return commissionService.createCommission(commission);
    }

    @GetMapping()
    public Iterable<Commission> getCommission() { return commissionService.getAllCommission(); }
}
