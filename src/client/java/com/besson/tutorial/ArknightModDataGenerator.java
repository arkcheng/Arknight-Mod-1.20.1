package com.besson.tutorial;

import com.besson.tutorial.datagen.*;
import com.besson.tutorial.item.ModItemGroups;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ArknightModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
FabricDataGenerator.Pack pack= fabricDataGenerator.createPack();
         pack.addProvider(ModBlackTagsProvider::new);
		pack.addProvider(ModEnUsLangTagsProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelsProvider::new);
		pack.addProvider(ModRecipesProvider::new);
		pack.addProvider(ModItemTagsProvider::new);







	}
}
