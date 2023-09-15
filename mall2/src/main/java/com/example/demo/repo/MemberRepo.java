package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.demo.object.Member;

@Repository
@RepositoryRestResource
public interface MemberRepo extends CrudRepository<Member, String>{
	
	@Query("SELECT m FROM Member m WHERE m.id = :id AND m.password = :password")
	List<Member> findWithDynamicQuery(@Param("id") String id, @Param("password") String password);

}
