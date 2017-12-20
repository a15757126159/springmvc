package www.wu.com.mapper;

import org.springframework.stereotype.Repository;

import www.wu.com.entity.User;

@Repository
public interface UserMapper {
	public User getUserById(Integer id);
}
