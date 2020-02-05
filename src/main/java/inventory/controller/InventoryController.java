package inventory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api("在庫の情報を管理するAPI")
@RestController
@RequestMapping(value = "inventory")
public class InventoryController {
}