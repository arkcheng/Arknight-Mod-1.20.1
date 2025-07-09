package com.besson.tutorial.datagen;

import com.besson.tutorial.block.ModBlocks;
import com.besson.tutorial.item.ModItemGroups;
import com.besson.tutorial.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModEnUsLangTagsProvider extends FabricLanguageProvider {

    public ModEnUsLangTagsProvider(FabricDataOutput dataOutput) {
        super(dataOutput,"en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
translationBuilder.add(ModItems.ICE_ETHER,"Ice Ether");
        translationBuilder.add(ModItems.Raw_ICE_ETHER,"Raw Ice Ether");
        translationBuilder.add(ModItems.CARDBOARD,"Cardboard");

        translationBuilder.add(ModBlocks.ICE_ETHER_BLOCK,"Ice Ether Block");
        translationBuilder.add(ModBlocks.RAW_ICE_ETHER_BLOCK,"Raw Ice Ether  BLock");
        translationBuilder.add(ModBlocks.ICE_ETHER_ORE,"Ice Ether Ore");

        translationBuilder.add(ModItemGroups.ARKNIGHT_GROUP,"Arknight Group2");
        translationBuilder.add("itemGroup.arknight_group2","Arknight Group2");
    }
}
