package net.jorisdebeer.createsmeltery;

import net.fabricmc.api.ModInitializer;

import net.jorisdebeer.createsmeltery.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateSmeltery implements ModInitializer {

	public static final String MOD_ID = "createsmeltery";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}