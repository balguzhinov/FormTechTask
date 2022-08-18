package com.form.formIntoMySQL;

import org.springframework.data.repository.CrudRepository;
import com.form.formIntoMySQL.entity.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
public interface UserRepository extends CrudRepository<User, Long> {

}
