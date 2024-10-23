package truong.assignment2310.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import truong.assignment2310.entity.PlayerItem;
import truong.assignment2310.service.PlayerItemService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/playerbuyitem")
public class PlayerItemController {
    @Autowired
    private PlayerItemService playerItemService;

    @PostMapping
    public ResponseEntity<Map<String, String>> savePlayerItem(@RequestBody PlayerItem playerItem) {
        playerItemService.savePlayerItem(playerItem);
        Map<String, String> response = new HashMap<>();
        response.put("Status", "True");
        response.put("ErrorCode", "200");
        return ResponseEntity.ok(response);
    }
}