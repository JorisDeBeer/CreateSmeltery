package net.jorisdebeer.createsmeltery.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.jorisdebeer.createsmeltery.CreateSmeltery;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CAST_IRON = FabricItemGroupBuilder.build(
            new Identifier(CreateSmeltery.MOD_ID, "cast_iron"), () -> new ItemStack(ModItems.CAST_IRON));
}
