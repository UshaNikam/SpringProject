package com.kaustubh.TechHubProject.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kaustubh.TechHubProject.model.course;

@Repository("registerRepo")
public class RegisterRepoImpl implements RegisterRepository {
	
	
	@Autowired
	JdbcTemplate template;
	List<course> list;

	@Override
	public boolean isAddCourse(final course c) {
		// TODO Auto-generated method stub
		
		int val=template.update("insert into course values('0',?,?,?)", new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setString(1, c.getName());
				ps.setString(2, c.getDuration());
				ps.setInt(3, c.getFee());
			}
		});
		
		if(val>0) {
			return true;
		}
		else {
		return false;
	}

}

	
	public List<course> getallCourse() {
		// TODO Auto-generated method stub
		
		list=template.query("select * from course", new RowMapper<course>() {

			@Override
			public course mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				course c = new course();
				c.setId(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setDuration(rs.getString(3));
				c.setFee(rs.getInt(4));
				return c;			
			}
		});
		return list;
	}

	
	
}