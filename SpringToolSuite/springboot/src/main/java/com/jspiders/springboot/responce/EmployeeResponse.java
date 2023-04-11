package com.jspiders.springboot.responce;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.jspiders.springboot.pojo.EmployeePOJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(value = Include.NON_NULL)
public class EmployeeResponse {

	private String status;
	private String msg;
	private EmployeePOJO data;
	private List<EmployeePOJO> list;
}
