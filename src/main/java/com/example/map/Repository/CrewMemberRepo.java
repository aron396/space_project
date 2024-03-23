package com.example.map.Repository;

import com.example.map.Model.CrewMember;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CrewMemberRepo extends CrudRepository<CrewMember, Integer> {

}
