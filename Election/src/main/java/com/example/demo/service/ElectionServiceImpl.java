package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.CondidatDTO;
import com.example.demo.DTO.ElectionDTO;
import com.example.demo.DTO.UserDTO;
import com.example.demo.Repository.ElectionRepository;
import com.example.demo.Repository.PersonneRepository;
import com.example.demo.entities.Admin;
import com.example.demo.entities.Condidat;
import com.example.demo.entities.Election;
import com.example.demo.entities.ElectionProgrammee;
import com.example.demo.entities.ElectionStandard;
import com.example.demo.entities.Personne;
import com.example.demo.entities.User;

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
		return	er.save(ep);
		
		
	}

	@Override
	public ElectionStandard CreeElectionStandard (ElectionStandard es) {
		// TODO Auto-generated method stub
		return er.save(es);
		
		 
	}
	
	
	@Override
	public void OuvrirElection(Election election) {
		// TODO Auto-generated method stub
		Boolean statutOuvert =true;
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
	public List<ElectionDTO> getAllElection() {
		// TODO Auto-generated method stub
		List<ElectionDTO> res= new ArrayList<>();
		List<Election> elections = er.findAll();
		
		 for (Election e : elections) {
		        ElectionDTO electionDTO = new ElectionDTO();
		        electionDTO.setCode(e.getCode());
		        electionDTO.setStatut(e.getStatut());
		        electionDTO.setDescription(e.getDescription());
		        electionDTO.setTitre(e.getTitre());
		        res.add(electionDTO);
		    }
		
		return res;
	}

	@Override
	public List<ElectionDTO> getAllElectionuser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ElectionDTO> getAllElectionAdmin(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ElectionDTO getElectionbyid(Long id)
	{
		ElectionDTO ed= new ElectionDTO();
		
		Election e= er.findById(id).get();
		
		
		ed.setId(e.getId());
		ed.setCode(e.getCode());
		ed.setTitre(e.getTitre());
		ed.setDatecreation(e.getDatecreation());
		ed.setStatut(e.getStatut());
		
		
		return ed;

	}
	
	@Override
public void SupprimerElection(Long id)
	{
		er.deleteById(id);
	}

	@Override
	public void AjouterUnUsers(User user, Long idElection) {
		// TODO Auto-generated method stub
		Election el =er.findById(idElection).orElseThrow(()-> new EntityNotFoundException("E lection n existe pas !!"));
		
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
		   System.out.println("adad les personnes li fi he4i l election:"+lon);
		   
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
	public void AjouterUnCondidats(Condidat condidat, Long idElection) {
		// TODO Auto-generated method stub
     Election el =er.findById(idElection).orElseThrow(()-> new EntityNotFoundException("E lection n existe pas !!"));
		
		el.getPersonnes().add(condidat);
		condidat.getElections().add(el);
		er.save(el);
		pr.save(condidat);
	}

	@Override
	public List<CondidatDTO> getcondidatsbyelection(Long id) {
		// TODO Auto-generated method stub
		List<Condidat> condidats= new ArrayList<>();
		List<CondidatDTO> res= new ArrayList<>();		
		 Election el =er.findById(id).orElseThrow(()-> new EntityNotFoundException("E lection n existe pas !!"));
		 for (Personne personne : el.getPersonnes()) {
			    if (personne instanceof Condidat) {
			    	condidats.add((Condidat) personne);
			    }
			}
		 for (Condidat c : condidats) {
		        CondidatDTO CondidatDTO = new CondidatDTO();
		        CondidatDTO.setId(c.getId());
		        CondidatDTO.setNom(c.getNom());
		        CondidatDTO.setPrenom(c.getPrenom());
		        CondidatDTO.setLogin(c.getLogin());
		        CondidatDTO.setPassword(c.getPassword());
		        CondidatDTO.setNbreVote(c.getNbreVote());
		        CondidatDTO.setPseudo(c.getPseudo());
		        
		        res.add(CondidatDTO);
		    }
		 
			 
			return res;
	}

	@Override
	public List<UserDTO> getusersbyelection(Long id) {
		// TODO Auto-generated method stub
		List<User> users= new ArrayList<>();
		List<UserDTO> res= new ArrayList<>();	
		
		 Election el =er.findById(id).orElseThrow(()-> new EntityNotFoundException("E lection n existe pas !!"));
		 for (Personne personne : el.getPersonnes()) {
			    if (personne instanceof User) {
			    	users.add((User) personne);
			    }
			}
		 
		 for (User u : users) {
		       UserDTO UsertDTO = new UserDTO();
		       UsertDTO.setId(u.getId());
		       UsertDTO.setNom(u.getNom());
		       UsertDTO.setPrenom(u.getPrenom());
		       UsertDTO.setLogin(u.getLogin());
		       UsertDTO.setPassword(u.getPassword());
		       UsertDTO.setNumcin(u.getNumcin());
		       UsertDTO.setAge(u.getAge());
		       UsertDTO.setBac(u.isBac());
		       UsertDTO.setDroitDeVote(u.getDroitDeVote());
		       UsertDTO.setRegion(u.getRegion());
		       UsertDTO.setGenre(u.getGenre());
		       
		       
		       
		        
		        res.add(UsertDTO);
		    }
		 
			 
			return res;
	}

	
	

}
