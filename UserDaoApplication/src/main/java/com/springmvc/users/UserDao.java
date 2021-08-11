package com.springmvc.users;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;




public class UserDao 
{
    private JdbcTemplate jTemplate;
	
	public void setJTemplate(JdbcTemplate jTemplate) 
	{
		this.jTemplate = jTemplate;
	}
	
	public int save(User user) 
	{
		String query = "insert into user_details(first_name, last_name, middle_name, "
				+ "address, email, phone_number, height, weight) values "
				+ "('"+user.getFirstName()+"','"+user.getLastName()+"','"+user.getMiddleName()+"','"
				+user.getAddress()+"','"+user.getEmail()+"',"+user.getPhoneNumber()+",'"
						+user.getHeight()+"','"+user.getWeight()+"')";
		return jTemplate.update(query);
	}
	
	
	/*
	 * public User getUsersById(int id) { String query =
	 * "select * from user_details where id = ?"; return
	 * jTemplate.queryForObject(query, new Object[] {id}, new
	 * BeanPropertyRowMapper<User>(User.class)); }
	 */
	 
	public List<User> getUsers()
	{
		return jTemplate.query("select * from user_details", new RowMapper<User>() 
		{
		public User mapRow(ResultSet rs, int row)throws SQLException
		{
			User user = new User();
			user.setId(rs.getInt(1));
			user.setFirstName(rs.getString(2));
			user.setLastName(rs.getString(3));
			user.setMiddleName(rs.getString(4));
			user.setAddress(rs.getString(5));
			user.setEmail(rs.getString(6));
			user.setPhoneNumber(rs.getString(7));
			user.setHeight(rs.getString(8));
			user.setWeight(rs.getString(9));
			return user;
		}
		});
	}
	
	public int delete(int id) 
	{
		String query = "delete from user_details where id ="+id+"";
		return jTemplate.update(query);
	}

}
