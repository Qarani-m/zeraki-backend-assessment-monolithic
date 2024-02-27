package com.mkarani.zeraki.service;
import com.mkarani.zeraki.entity.InstitutionEntity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mkarani.zeraki.dto.InstitutionRequest;

import java.util.List;

public interface InstitutionService {
    InstitutionEntity addInstitution(InstitutionRequest institution);

    List<InstitutionEntity> getAllInstitutions();

    List<InstitutionEntity> sortInstitutionsByName(String direction);

    List<InstitutionEntity> searchInstitutionsByName(String name);

    String deleteInstitution(Long id);

    InstitutionEntity editInstitutionName(Long id, String name) throws JsonProcessingException;
}
