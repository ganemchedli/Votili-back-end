package com.example.electionservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.electionservice.Repository.ElectionRepository;
import com.example.electionservice.Repository.PersonneRepository;
import com.example.electionservice.entities.Admin;
import com.example.electionservice.entities.Candidate;
import com.example.electionservice.entities.Election;
import com.example.electionservice.entities.ElectionProgrammee;
import com.example.electionservice.entities.ElectionStandard;
import com.example.electionservice.entities.Personne;
import com.example.electionservice.entities.User;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ElectionServiceImpl implements ElectionService {

    @Autowired
    private ElectionRepository er;
    @Autowired
    private PersonneRepository pr;

    @Override
    public ElectionProgrammee CreeElectionProgrammee(ElectionProgrammee ep) {
        // TODO Auto-generated method stub
        return er.save(ep);

    }

    @Override
    public ElectionStandard CreeElectionStandard(ElectionStandard es) {
        // TODO Auto-generated method stub
        return er.save(es);
    }

    @Override
    public void OuvrirElection(Election election) {
        // TODO Auto-generated method stub
        Boolean statutOuvert = true;
        election.setStatut(statutOuvert);

    }

    @Override
    public void FermerElection(Election election) {
        // TODO Auto-generated method stub
        boolean statutFerme = false;
        election.setStatut(statutFerme);
    }

    @Override
    public void SupprimerElection(Election election) {
        // TODO Auto-generated method stub
        er.delete(election);
    }

    @Override
    public List<Election> getAllElection() {
        // TODO Auto-generated method stub

        List<Election> elections = er.findAll();
        return elections;
    }

    @Override
    public List<Election> getAllElectionuser(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Election> getAllElectionAdmin(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Election getElectionbyid(Long id) {
        return er.findById(id).get();

    }

    @Override
    public void SupprimerElection(Long id) {
        er.deleteById(id);
    }

    @Override
    public void AjouterUnUsers(User user, Long idElection) {
        // TODO Auto-generated method stub
        Election el = er.findById(idElection).orElseThrow(() -> new EntityNotFoundException("E lection n existe pas !!"));

        el.getPersonnes().add(user);
        user.getElections().add(el);

        er.save(el);
        pr.save(user);
    }

    @Override
    public void AssocieUnAdmin(Admin admin, Long idElection) {
        // TODO Auto-generated method stub
		/*
        Election el =er.findById(idElection).orElseThrow(()-> new EntityNotFoundException("E lection n existe pas !!"));
		
		el.getPersonnes().add(admin);
		admin.getElections().add(el);
		*/

        Election el = er.findById(idElection).orElseThrow(() -> new EntityNotFoundException("Election n'existe pas !!"));

        List<Personne> personnes = el.getPersonnes();
        int lon = personnes.size();
        System.out.println("adad les personnes li fi he4i l election:" + lon);

        boolean exist = false;

        for (Personne p : personnes) {   // si le personne mawjoud fi liste yo5rej ma yautorizihech martin
            if (p.getId() == admin.getId()) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            personnes.add(admin);
            admin.getElections().add(el);
            er.save(el);
            pr.save(admin);
        }
    }

    @Override
    public void AjouterUnCondidats(Candidate candidate, Long idElection) {
        // TODO Auto-generated method stub
        Election el = er.findById(idElection).orElseThrow(() -> new EntityNotFoundException("Election n\'existe pas !!"));

        el.getPersonnes().add(candidate);
        candidate.getElections().add(el);
        er.save(el);
        pr.save(candidate);
    }
}
