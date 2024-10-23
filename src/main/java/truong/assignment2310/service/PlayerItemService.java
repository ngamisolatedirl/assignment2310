package truong.assignment2310.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import truong.assignment2310.entity.PlayerItem;
import truong.assignment2310.repository.PlayerItemRepository;

@Service
public class PlayerItemService {
    @Autowired
    private PlayerItemRepository playerItemRepository;

    public void savePlayerItem(PlayerItem playerItem) {
        playerItemRepository.save(playerItem);
    }
}