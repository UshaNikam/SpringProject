package org.techhub.rd_SpringMVCProject.repository;

import java.util.List;

import org.techhub.SpringMVCProject.model.Register;

public interface RegisterRepository {

	 public boolean isRegister(Register register);
	 public List<Register> getAllRecords();
	 public boolean isDelete(int id);
	 public boolean isUpdate(Register register);
}
