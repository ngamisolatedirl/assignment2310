package truong.assignment2310.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import truong.assignment2310.repository.PlayerRepository;
import truong.assignment2310.repository.ItemRepository;
import truong.assignment2310.repository.PlayerItemRepository;
import truong.assignment2310.entity.Player;
import truong.assignment2310.entity.Item;
import truong.assignment2310.entity.PlayerItem;
import java.util.*;

@RestController
@RequestMapping("/playerinfor")
public class PlayerInfoController {
    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private PlayerItemRepository playerItemRepository;

    @GetMapping
    public List<Map<String, String>> getPlayerInfo() {
        List<Map<String, String>> response = new ArrayList<>();
        List<Player> players = playerRepository.findAll();
        for (Player player : players) {
            List<PlayerItem> playerItems = playerItemRepository.findByPlayer(player);
            for (PlayerItem playerItem : playerItems) {
                Map<String, String> playerInfo = new HashMap<>();
                playerInfo.put("PlayerId", String.valueOf(player.getPlayerId()));
                playerInfo.put("PlayerName", player.getPlayerName());
                playerInfo.put("PlayerNational", player.getPlayerNational());
                Item item = playerItem.getItem();
                playerInfo.put("ItemName", item.getItemName());
                playerInfo.put("Price", item.getPrice().toString());
                playerInfo.put("ItemTypeName", item.getItemType().getItemTypeName());
                response.add(playerInfo);
            }
        }
        return response;
    }
}