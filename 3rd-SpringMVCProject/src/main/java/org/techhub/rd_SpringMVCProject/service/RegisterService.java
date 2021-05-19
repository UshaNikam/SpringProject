package org.techhub.rd_SpringMVCProject.service;

import java.util.List;

import org.techhub.SpringMVCProject.model.Register;

public interface RegisterService {

	 public boolean isRegister(Register register);
	 public List<Register> getAllRecords();
	 public boolean isDelete(int id);
	 public boolean isUpdate(Register register);
		
}
