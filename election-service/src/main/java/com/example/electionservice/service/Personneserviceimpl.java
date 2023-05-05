package com.example.electionservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electionservice.Repository.ElectionRepository;
import com.example.electionservice.Repository.PersonneRepository;
import com.example.electionservice.entities.Candidate;
import com.example.electionservice.entities.Election;
import com.example.electionservice.entities.Personne;
import com.example.electionservice.entities.User;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class Personneserviceimpl implements PersonneService {

    @Autowired
    private PersonneRepository pr;
    @Autowired
    private ElectionRepository er;

    @Override
    public User ajouterUser(User user) {

        return pr.save(user);
    }

    @Override
    public Candidate ajouterCondidat(Candidate candidate) {

        return pr.save(candidate);
    }

    @Override
    public Personne ajouterpersonne(Personne personne) {

        return pr.save(personne);
    }

    @Override
    public void SupprimerVotant(User user) {

        pr.delete(user);
    }

    @Override
    public void SupprimerCondidat(Candidate candidate) {

        pr.delete(candidate);
    }

    @Override
    public void SupprimerPersonne(Long id) {

        pr.deleteById(id);
    }

    @Override
    public void ajouter(int id_p, int id_E) {

    }

    @Override
    public List<Personne> getallpersonnes() {

        List<Personne> pers;
        pers = pr.findAll();
        return pers;
    }

    @Override
    public List<String> ReturnAllElectionPersonne(Long id) {

        List<String> res = new ArrayList<>();
        Personne per = pr.findById(id).orElseThrow(() -> new EntityNotFoundException("personne n existe pas"));
        for (Election election : per.getElections()) {
            res.add(election.getCode());

        }
        return res;

    }

    @Override
    public Personne getpersonnebyid(Long id) {
        Personne p;

        p = pr.findById(id).get();
        return p;

    }


}
