package truong.assignment2310.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import truong.assignment2310.entity.Item;
import truong.assignment2310.repository.ItemRepository;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public void saveItem(Item item) {
        itemRepository.save(item);
    }
}