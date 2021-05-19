package org.techhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techhub.model.Voter;
import org.techhub.repo.VoterRepository;

@Service("voterService")
public class VoterService {
	

	@Autowired
	VoterRepository voterRepo;
	
	public boolean isAddVoter(Voter voter)
	{
		if(voter.getAge()>18)
		{
			//call database 
		  boolean b = voterRepo.isAddVoter(voter);
		  return b;
		}
		else
		{
			return false;
		}
			
	}
}

