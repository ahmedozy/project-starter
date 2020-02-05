/**
 * 
 */
package sd.wahbi.data;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ahmedozy
 *
 */
public interface UserRepository extends JpaRepository<User, Integer> {

	public Optional<User> findByUsername(String username);
}
