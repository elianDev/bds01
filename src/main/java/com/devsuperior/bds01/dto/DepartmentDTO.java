package com.devsuperior.bds01.dto;

import com.devsuperior.bds01.entities.Department;

public record DepartmentDTO(Long id, String name) {

    public DepartmentDTO(Department entity) {
        this(
                entity.getId(),
                entity.getName()
        );
    }
}
