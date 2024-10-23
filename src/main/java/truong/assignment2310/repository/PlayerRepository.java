package truong.assignment2310.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import truong.assignment2310.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
}