package jp.co.internous.practice.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jp.co.internous.practice.model.domain.User;

public interface UserMapper {

	List<User> findByUserNameAndPassword(
			@Param("userName") String userName,
			@Param("password") String password
			);
}
