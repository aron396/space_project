//// CrewMemberController
//
//package com.example.map.Controller;
//
//import com.example.map.Model.CrewMember;
//import com.example.map.Service.CrewMemberService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class CrewMemberController {
//
//    @Autowired
//    private CrewMemberService crewMemberService;
//
//    @RequestMapping(method = RequestMethod.GET, value = "/crewmembers")
//    public List<CrewMember> getAllCrewMembers() {
//        return crewMemberService.getAllCrewMembers();
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "/crewmembers")
//    public void addCrewMember(@RequestBody CrewMember crewMember) {
//        crewMemberService.addCrewMemberWithBody(crewMember);
//    }
//
//    @RequestMapping(method = RequestMethod.PUT, value = "/crewmembers/{id}")
//    public void updateCrewMember(@PathVariable int id, @RequestBody CrewMember crewMember) {
//        crewMemberService.updateCrewMember(id, crewMember);
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE, value = "/crewmembers/{id}")
//    public void DeleteCrewMember(@PathVariable int id) {
//        crewMemberService.deleteCrewMember(id);
//    }
//}

// CrewMemberController.java

package com.example.map.Controller;

import com.example.map.Model.CrewMember;
import com.example.map.Service.CrewMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crewmembers")
public class CrewMemberController {

    @Autowired
    private CrewMemberService crewMemberService;

    @GetMapping
    public List<CrewMember> getAllCrewMembers() {
        return crewMemberService.getAllCrewMembers();
    }

    @PostMapping
    public void addCrewMemberWithBody(@RequestBody CrewMember crewMember) {
        crewMemberService.addCrewMemberWithBody(crewMember);
    }

    @PutMapping("/{id}")
    public void updateCrewMember(@PathVariable int id, @RequestBody CrewMember crewMember) {
        crewMemberService.updateCrewMember(id, crewMember);
    }

    @DeleteMapping("/{id}")
    public void deleteCrewMember(@PathVariable int id) {
        crewMemberService.deleteCrewMember(id);
    }
}

