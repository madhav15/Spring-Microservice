package io.madhav.airportmanagement.service;

import io.madhav.airportmanagement.model.CatalogResponse;

import java.util.List;

public interface ResponseService {

    List<CatalogResponse> getResponse();

    String saveData(CatalogResponse catalogResponse);
}
