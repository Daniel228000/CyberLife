package tireone.cyberlife.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tireone.cyberlife.domain.User;

public interface UserDetailsRepository extends JpaRepository<User, String> {
}
