package truong.assignment2310.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import truong.assignment2310.entity.Player;
import truong.assignment2310.service.PlayerService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @PostMapping
    public ResponseEntity<Map<String, String>> savePlayer(@RequestBody Player player) {
        playerService.savePlayer(player);
        Map<String, String> response = new HashMap<>();
        response.put("Status", "True");
        response.put("ErrorCode", "200");
        return ResponseEntity.ok(response);
    }
}