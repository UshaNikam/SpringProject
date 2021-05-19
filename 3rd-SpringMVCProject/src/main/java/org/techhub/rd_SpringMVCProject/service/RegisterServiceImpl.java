package org.techhub.rd_SpringMVCProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techhub.SpringMVCProject.model.Register;
import org.techhub.rd_SpringMVCProject.repository.RegisterRepository;

@Service("registerService")
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	RegisterRepository registerRepo;
	@Override
	public boolean isRegister(Register register) {
		// TODO Auto-generated method stub
		boolean b = registerRepo.isRegister(register);
		return b;
	}
	@Override
	public List<Register> getAllRecords() {
		// TODO Auto-generated method stub
		//List<Register> list=registerRepo.getAllRecords();
		 //return list;
		//we can above line in single line 
		return registerRepo.getAllRecords();
	}
	@Override
	public boolean isDelete(int id) {
		// TODO Auto-generated method stub
		return registerRepo.isDelete(id);
	}
	@Override
	public boolean isUpdate(Register register) {
		// TODO Auto-generated method stub
		return registerRepo.isUpdate(register);
	}

}
