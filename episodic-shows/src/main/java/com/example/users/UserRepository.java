/**
 * Created by saikiranmothe on 5/17/17.
 */

package com.example.users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
