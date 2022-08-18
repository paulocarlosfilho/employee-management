package com.employeemanagement.dto.mapper;

import com.employeemanagement.dto.response.EmployeeResponse;
import com.employeemanagement.entity.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper MAPPER = Mappers.getMapper(EmployeeMapper.class);
    EmployeeResponse bindDataEntityToResponse(EmployeeEntity employeeEntity);
    List<EmployeeResponse> bindDataListToResponseList(List<EmployeeEntity> employeeEntities);

}
