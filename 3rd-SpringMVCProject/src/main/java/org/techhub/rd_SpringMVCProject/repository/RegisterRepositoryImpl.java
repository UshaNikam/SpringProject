package org.techhub.rd_SpringMVCProject.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.techhub.SpringMVCProject.model.Register;

@Repository("registerRepo")
public class RegisterRepositoryImpl implements RegisterRepository {
	@Autowired 
	JdbcTemplate template;
	
	List <Register> list;
	
	@Override
	public boolean isRegister(final Register register) {
		// TODO Auto-generated method stub
		int value= template.update("insert into register values('0',?,?,?)",new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				 ps.setString(1,register.getName());
				 ps.setString(2,register.getEmail());
				 ps.setString(3,register.getContact());
			}
		});
		if(value>0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public List<Register> getAllRecords()
	{
		list = template.query("select *from register",new RowMapper<Register>() {

			@Override
			public Register mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Register r = new Register();
				r.setId(rs.getInt(1));
				r.setName(rs.getString(2));
				r.setEmail(rs.getString(3));
				r.setContact(rs.getString(4));
				return r;
			}

			 
		});
		return list;
	}

	@Override
	public boolean isDelete(final int id) {
		// TODO Auto-generated method stub
		int val=template.update("delete from register where rid=?",new PreparedStatementSetter()
				{

					@Override
					public void setValues(PreparedStatement ps) throws SQLException {
						// TODO Auto-generated method stub
						ps.setInt(1,id);
						
					}
			
				});
	   if(val>0)
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
		
	}

	@Override
	public boolean isUpdate(final Register register) {
		// TODO Auto-generated method stub
		int val=template.update("update register set name=?,email=?,contact=? where rid=?",new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setString(1,register.getName());
				ps.setString(2,register.getEmail());
				ps.setString(3,register.getContact());
				ps.setInt(4,register.getId());
				
			}
			
		});
		if(val>0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public boolean isRegister(org.techhub.rd_SpringMVCProject.model.Register register) {
		// TODO Auto-generated method stub
		return false;
	}

}













