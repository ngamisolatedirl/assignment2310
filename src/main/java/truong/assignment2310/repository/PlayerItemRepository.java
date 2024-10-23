package truong.assignment2310.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import truong.assignment2310.entity.Player;
import truong.assignment2310.entity.PlayerItem;
import truong.assignment2310.entity.PlayerItemKey;

import java.util.List;

public interface PlayerItemRepository extends JpaRepository<PlayerItem, PlayerItemKey> {
    List<PlayerItem> findByPlayer(Player player);
}