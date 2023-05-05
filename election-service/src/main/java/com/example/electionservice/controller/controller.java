package com.example.electionservice.controller;

import com.example.electionservice.entities.*;
import com.example.electionservice.service.ElectionServiceImpl;
import com.example.electionservice.service.Personneserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class controller {

    @Autowired
    ElectionServiceImpl es;

    @Autowired
    Personneserviceimpl ps;

    @RequestMapping("/test")
    public List<Election> GetAllElections() {
        return es.getAllElection();
    }

    @GetMapping(path = "/election/{id}")
    public Election GetElectionbyid(@PathVariable Long id) {
        return es.getElectionbyid(id);
    }

    @PostMapping(path = "/addElectionprograme")
    public ElectionProgrammee creeElectionProgrammee(@RequestBody ElectionProgrammee EP) {
        return es.CreeElectionProgrammee(EP);
    }

    @PostMapping(path = "/addElectionstandard")
    public ElectionStandard creeElectionstandard(@RequestBody ElectionStandard Es) {
        return es.CreeElectionStandard(Es);
    }

    @DeleteMapping(path = "/deleteelection/{id}")
    public void delete(@PathVariable Long id) {
        es.SupprimerElection(id);

    }

    @GetMapping(path = "/personnes")
    public List<Personne> getallpersonnes() {
        return ps.getallpersonnes();

    }

    @PostMapping(path = "/adduserElection/{id}") // ajouter un utilisateur à une élection
    public void adduserElection(@RequestBody User per, @PathVariable Long id) {
        es.AjouterUnUsers(per, id);
    }

    @PostMapping(path = "/addAdmin/{id}")
    public void addusersElection(@RequestBody Admin admin, @PathVariable Long id) {
        es.AssocieUnAdmin(admin, id);
    }

    @PostMapping(path = "/addCondidat/{id}")
    public void addCondidatsElection(@RequestBody Candidate condidats, @PathVariable Long id) {
        es.AjouterUnCondidats(condidats, id);
    }

    @GetMapping(path = "/getallelectionpersonne/{id}")
    public String gatallElectionsPersonne(@PathVariable Long id) {
        String mess;
        List<String> res = ps.ReturnAllElectionPersonne(id);
        int lon = res.size();
        mess = mess = "IL participe à " + lon + " elections et " + " les election de l'utilisateur dont l'id = " + id + " sonts :";
        for (String code : res) {
            mess = mess + " , " + code;
        }
        return mess;
    }

    @PostMapping(path = "/addpersonne")
    public Personne save(@RequestBody Personne per) {
        return ps.ajouterpersonne(per);
    }

    @PostMapping(path = "/adduser")
    public Personne save(@RequestBody User user) {
        return ps.ajouterpersonne(user);
    }

    @PostMapping(path = "/addcondidat")
    public Personne save(@RequestBody Candidate cond) {
        return ps.ajouterpersonne(cond);
    }

    @DeleteMapping(path = "/deletpersonne/{id}")
    public void deletepersonne(@PathVariable Long id) {
        ps.SupprimerPersonne(id);
    }

    @GetMapping(path = "/personne/{id}")
    public Personne gatPersonnebyid(@PathVariable Long id) {
        return ps.getpersonnebyid(id);
    }
}
