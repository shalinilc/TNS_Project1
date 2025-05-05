package project.placement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("placement")
@CrossOrigin(origins = "*")
public class PlacementController {

    @Autowired
    private PlacementService placementService;

    @PostMapping
    public Placement createPlacement(@RequestBody Placement placement) {
        return placementService.savePlacement(placement);
    }

    @GetMapping
    public List<Placement> getAllPlacements() {
        return placementService.getAllPlacements();
    }

    @GetMapping("/{id}")
    public Placement getPlacementById(@PathVariable long id) {
        return placementService.getPlacementById(id);
    }

    @PutMapping("/{id}")
    public Placement updatePlacement(@PathVariable long id, @RequestBody Placement placement) {
        return placementService.updatePlacement(id, placement);
    }

    @DeleteMapping("/{id}")
    public void deletePlacement(@PathVariable long id) {
        placementService.deletePlacement(id);
    }
}
