package io.madhav.airportmanagement.controller;

import io.madhav.airportmanagement.model.CatalogResponse;
import io.madhav.airportmanagement.service.ResponseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/airport")
public class WebResource {

    private final static Logger LOGGER = LoggerFactory.getLogger(WebResource.class);

    @Autowired
    private ResponseService responseService;

    @RequestMapping("/getCatalog")
    public List<CatalogResponse> getCatalog() {
        LOGGER.info("Get Catalog request received");
        return responseService.getResponse();
    }

    @PostMapping("/saveCatalog")
    public String saveCatelog(@RequestBody final CatalogResponse catalogResponse) {
        return responseService.saveData(catalogResponse);
    }

}
