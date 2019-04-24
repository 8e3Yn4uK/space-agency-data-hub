package com.ve3yn4uk.spaceagencydatahub.rest;

import com.ve3yn4uk.spaceagencydatahub.entity.Mission;
import com.ve3yn4uk.spaceagencydatahub.entity.Product;
import com.ve3yn4uk.spaceagencydatahub.service.IMissionService;
import com.ve3yn4uk.spaceagencydatahub.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 8e3Yn4uK on 23.04.2019
 */

@RestController
@RequestMapping("/api")
public class SpaceAgencyRestController {

    private IMissionService missionService;
    private IProductService productService;

    @Autowired
    public SpaceAgencyRestController(IMissionService missionService, IProductService productService) {
        this.missionService = missionService;
        this.productService = productService;
    }

    /**
     * mapping for POST /missions - add new mission.
     */
    @PostMapping("/missions")
    public Mission addMission(@RequestBody Mission mission) {

        mission.setId(0);
        String imageryType = mission.getImageryType();
        if (!imageryType.equals("Panchromatic") && !imageryType.equals("Multispectral") && !imageryType.equals("Hyperspectral")) {
            throw new IllegalImageryTypeException("ImageryType possible types are: Panchromatic, Multispectral, Hyperspectral");
        }
        missionService.save(mission);

        return mission;
    }

    /**
     * mapping for PUT /missions - edit an existing mission
     */
    @PutMapping("/missions")
    public Mission editMission(@RequestBody Mission mission) {

        Mission myMission = missionService.findById(mission.getId());

        if (myMission == null) {
            throw new MissionNotFoundException("Mission id not found " + mission.getId());
        }

        missionService.save(mission);

        return mission;
    }

    /**
     * mapping for DELETE / missions - remove an existing mission
     */
    @DeleteMapping("/missions/{missionId}")
    public String removeMission(@PathVariable int missionId) {

        Mission mission = missionService.findById(missionId);

        if (mission == null) {
            throw new MissionNotFoundException("Mission id not found " + missionId);
        }
        missionService.deleteById(missionId);

        return "Deleted mission id " + missionId;
    }

    /**
     * mapping for GET / missions - get all existing missions
     */
    @GetMapping("/missions")
    public List<Mission> findAll() {
        return missionService.findAll();
    }

    /**
     * mapping for POST /products - add new product.
     */
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {

        product.setId(0);
        productService.save(product);

        return product;
    }

    /**
     * mapping for DELETE / missions - remove an existing mission
     */
    @DeleteMapping("/products/{productId}")
    public String removeProduct(@PathVariable int productId) {

        Product product = productService.findById(productId);

        if (product == null) {
            throw new MissionNotFoundException("Product id not found " + productId);
        }
        productService.deleteById(productId);

        return "Deleted product id " + productId;
    }

    /**
     * mapping for GET / products
     */
    @GetMapping("/products")
    public List<Product> findProductByMissionName() {
        return productService.findByMissionName("asd");
    }
}