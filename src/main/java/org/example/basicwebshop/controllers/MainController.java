package org.example.basicwebshop.controllers;

import org.example.basicwebshop.models.ShopItem;
import org.example.basicwebshop.services.ShopItemsList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    private ShopItemsList itemsList = new ShopItemsList();
    @GetMapping("/webshop")
    public String homePage(Model model) {
        List<ShopItem> items = itemsList.getItemList();
        model.addAttribute("items", items);
        return "webshop";
    }
}
