//// CrewMemberService
//
//package com.example.map.Service;
//
//import com.example.map.Model.CrewMember;
//import com.example.map.Repository.CrewMemberRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class CrewMemberService {
//
//    @Autowired
//    private CrewMemberRepo crewMemberRepo;
//
//    public List<CrewMember> getAllCrewMembers() {
//        List<CrewMember> crewMembers = new ArrayList<>();
//        crewMemberRepo.findAll().forEach(crewMembers::add);
//        return crewMembers;
//    }
//
//    private int findNextAvailableId() {
//        Integer maxId = crewMemberRepo.findMaxId();
//        return (maxId != null) ? maxId + 1 : 1;
//    }
//
//    public void addCrewMemberWithBody(CrewMember crewMember) {
//        int newId = findNextAvailableId();
//        crewMember.setId(newId);
//
//        // Ensure the Body is properly associated with the CrewMember
//        crewMember.getBody().setId(Integer.parseInt(String.valueOf(newId)));
//
//        // Persist both CrewMember and Body
//        crewMemberRepo.save(crewMember);
//    }
//
//    public void updateCrewMember(int id, CrewMember crewMember) {
//        CrewMember existingCrewMember = crewMemberRepo.findById(id).orElse(null);
//        if (existingCrewMember != null) {
//            existingCrewMember.setName(crewMember.getName());
//            existingCrewMember.setPosition(crewMember.getPosition());
//
//            // Update the associated Body details directly
//            existingCrewMember.getBody().setId(crewMember.getBody().getId());
//            existingCrewMember.getBody().setTorso(crewMember.getBody().getTorso());
//            existingCrewMember.getBody().setHead(crewMember.getBody().getHead());
//            existingCrewMember.getBody().setLeftArm(crewMember.getBody().getLeftArm());
//            existingCrewMember.getBody().setRightArm(crewMember.getBody().getRightArm());
//            existingCrewMember.getBody().setLeftLeg(crewMember.getBody().getLeftLeg());
//            existingCrewMember.getBody().setRightLeg(crewMember.getBody().getRightLeg());
//
//            crewMemberRepo.save(existingCrewMember);
//        }
//    }
//
//    public void deleteCrewMember(int id) {
//        crewMemberRepo.deleteById(id);
//    }
//}

// CrewMemberService.java

package com.example.map.Service;

import com.example.map.Model.CrewMember;
import com.example.map.Repository.CrewMemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrewMemberService {

    @Autowired
    private CrewMemberRepo crewMemberRepo;

    public List<CrewMember> getAllCrewMembers() {
        return (List<CrewMember>) crewMemberRepo.findAll();
    }

    public void addCrewMemberWithBody(CrewMember crewMember) {
        crewMemberRepo.save(crewMember);
    }

    public void updateCrewMember(int id, CrewMember crewMember) {
        CrewMember existingCrewMember = crewMemberRepo.findById(id).orElse(null);
        if (existingCrewMember != null) {
            existingCrewMember.setName(crewMember.getName());
            existingCrewMember.setPosition(crewMember.getPosition());
            existingCrewMember.setBody(crewMember.getBody());
            crewMemberRepo.save(existingCrewMember);
        }
    }

    public void deleteCrewMember(int id) {
        crewMemberRepo.deleteById(id);
    }
}

