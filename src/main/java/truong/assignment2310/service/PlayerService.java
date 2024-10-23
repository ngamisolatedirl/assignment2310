package truong.assignment2310.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import truong.assignment2310.entity.Player;
import truong.assignment2310.repository.PlayerRepository;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public void savePlayer(Player player) {
        playerRepository.save(player);
    }
}