package project.placement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepository placementRepository;

    public Placement savePlacement(Placement placement) {
        return placementRepository.save(placement);
    }

    public List<Placement> getAllPlacements() {
        return placementRepository.findAll();
    }

    public Placement getPlacementById(long id) {
        return placementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Placement not found with id: " + id));
    }


    public Placement updatePlacement(long id, Placement placement) {
        Placement existing = getPlacementById(id);
        existing.setCompanyName(placement.getCompanyName());
        existing.setJobTitle(placement.getJobTitle());
        existing.setPlacementDate(placement.getPlacementDate());
        existing.setStudentId(placement.getStudentId());
        return placementRepository.save(existing);
    }

    public void deletePlacement(long id) {
        placementRepository.deleteById(id);
    }
}
