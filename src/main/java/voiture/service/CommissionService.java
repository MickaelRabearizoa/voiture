package voiture.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import voiture.model.Commission;
import voiture.model.Marque;
import voiture.repository.CommissionRepository;

import java.util.List;

@Service
public class CommissionService {

    private final CommissionRepository commissionRepository;

    @Autowired
    public CommissionService(CommissionRepository commisionRepository) { this.commissionRepository = commisionRepository; }

    public Commission createCommission(Commission commision) {
        return commissionRepository.save(commision);
    }

    public List<Commission> getAllCommission() { return commissionRepository.findAll(); }
}

