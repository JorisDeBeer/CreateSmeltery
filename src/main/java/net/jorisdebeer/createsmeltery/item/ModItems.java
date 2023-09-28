package net.jorisdebeer.createsmeltery.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.jorisdebeer.createsmeltery.CreateSmeltery;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item CAST_IRON = registerItem("cast_iron",
            new Item(new FabricItemSettings().group(ModItemGroup.CAST_IRON)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CreateSmeltery.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CreateSmeltery.LOGGER.debug("Registering Mod Items for " + CreateSmeltery.MOD_ID);
    }
}
