package com.example.demo.object;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Basket {
	
	@Id
	@NotNull
	private Integer id;
	@NotNull
	private String memberId;
	@NotNull
	private String itemName;
	@NotNull
	private Integer count;
	@NotNull
	private Integer price;
}
