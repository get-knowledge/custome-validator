package com.gobeyond.custome.validator.dto;

import com.gobeyond.custome.validator.document.AgeValidator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDto {

	private long id;

	private String name;

	private String email;

	private Long phoneNo;

	@AgeValidator
	private Integer age;

}