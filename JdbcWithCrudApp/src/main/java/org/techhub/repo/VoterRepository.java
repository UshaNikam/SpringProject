package org.techhub.repo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;
import org.techhub.model.Voter;

@Repository("voterRepo")
public class VoterRepository {

	@Autowired
	JdbcTemplate template;// new JdbcTemplate();

	public boolean isAddVoter(final Voter voter) {
		// write here insert query
		int val = template.update("insert into voter values('0',?,?,?)", new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub

				ps.setString(1, voter.getName());
				ps.setInt(2, voter.getAge());
				ps.setString(3, voter.getAddress());
			}

		});
		if (val > 0) {
			return true;
		} else {
			return false;
		}

	}
}