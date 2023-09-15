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
public class Member {
	@Id
	@NotNull
	private String id;
	@NotNull
	private String password;
	@NotNull
	private String name;
	@NotNull
	private String email;
	private String SessionId;
}
