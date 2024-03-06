package com.example.respository;

import java.util.List;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{
	public static final String HASH_KEY="User";
	private final RedisTemplate template;
	UserDaoImpl(RedisTemplate template){
		this.template=template;
	}
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return template.opsForHash().values(HASH_KEY);
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		template.opsForHash().put(HASH_KEY, user.getId(), user);
		return user;
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return (User) template.opsForHash().get(HASH_KEY, id);
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		template.opsForHash().delete(HASH_KEY, id);
		return "user removed !!";
	}

}
