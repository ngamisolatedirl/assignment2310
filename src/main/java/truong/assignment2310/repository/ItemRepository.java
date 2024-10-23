package truong.assignment2310.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import truong.assignment2310.entity.Item;

public interface ItemRepository extends JpaRepository<Item, String> {
}