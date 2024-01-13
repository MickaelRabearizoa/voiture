package voiture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import voiture.model.Typevoiture;
import voiture.repository.TypevoitureRepository;

import java.util.List;

@Service
public class TypevoitureService {

    private final TypevoitureRepository typevoitureRepository;

    @Autowired
    public TypevoitureService(TypevoitureRepository typevoitureRepository) {
        this.typevoitureRepository = typevoitureRepository;
    }

    public Typevoiture addTypevoiture(Typevoiture typevoiture) {
        return typevoitureRepository.save(typevoiture);
    }

    public List<Typevoiture> getAllTypevoiture() { return typevoitureRepository.findAll(); }
}
