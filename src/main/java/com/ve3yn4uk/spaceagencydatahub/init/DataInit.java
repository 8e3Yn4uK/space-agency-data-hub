package com.ve3yn4uk.spaceagencydatahub.init;

import com.ve3yn4uk.spaceagencydatahub.entity.Footprint;
import com.ve3yn4uk.spaceagencydatahub.entity.Mission;
import com.ve3yn4uk.spaceagencydatahub.entity.Product;
import com.ve3yn4uk.spaceagencydatahub.service.IMissionService;
import com.ve3yn4uk.spaceagencydatahub.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 8e3Yn4uK on 23.04.2019
 */

@Component
public class DataInit implements ApplicationRunner {

    private IMissionService missionService;

    private IProductService productService;

    @Autowired
    public DataInit(IMissionService missionService, IProductService productService) {
        this.missionService = missionService;
        this.productService = productService;
    }

    private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Mission myMission1 = new Mission();
        myMission1.setName("FirstMission");
        myMission1.setImageryType("Panchromatic");
        Date d1 = df.parse("2019-03-20");
        Date d2 = df.parse("2019-06-01");
        myMission1.setStartDate(d1);
        myMission1.setFinishDate(d2);

        Mission myMission2 = new Mission();
        myMission2.setName("SecondMission");
        myMission2.setImageryType("Multispectral");
        Date d3 = df.parse("2019-08-11");
        Date d4 = df.parse("2020-01-01");
        myMission2.setStartDate(d3);
        myMission2.setFinishDate(d4);
        Mission myMission3 = new Mission();
        myMission3.setName("ThirdMission");
        myMission3.setImageryType("Hyperspectral");
        Date d5 = df.parse("2019-04-23");
        Date d6 = df.parse("2019-06-01");
        myMission3.setStartDate(d5);
        myMission3.setFinishDate(d6);

        Product myProduct1 = new Product(myMission1, d5, new Footprint(1, 258, 1489, -180), new BigDecimal(199.99), "www.google.com");
        Product myProduct2 = new Product(myMission2, d3, new Footprint(-155, 13, 29, 48), new BigDecimal(49.99), "www.google.com");
        Product myProduct3 = new Product(myMission3, d1, new Footprint(244, 0, 49, 13), new BigDecimal(79.99), "www.google.com");

        productService.save(myProduct1);
        productService.save(myProduct2);
        productService.save(myProduct3);
        missionService.save(myMission1);
        missionService.save(myMission2);
        missionService.save(myMission3);
    }
}
