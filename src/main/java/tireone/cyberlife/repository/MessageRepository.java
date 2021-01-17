package tireone.cyberlife.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tireone.cyberlife.domain.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {



}
