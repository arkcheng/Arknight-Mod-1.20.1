package com.besson.tutorial.item;

import com.besson.tutorial.ArknightMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final  Item ICE_ETHER=registerItem("ice_ether",new Item(new  Item.Settings()));
    public static final  Item Raw_ICE_ETHER=registerItem("raw_ice_ether",new Item(new  Item.Settings()));
    public static final  Item CARDBOARD = registerItem("material/cardboard",new Item(new  Item.Settings()));

    public static  Item registerItem(String id,Item item){
        return Registry.register(Registries.ITEM,RegistryKey.of(Registries.ITEM.getKey(),new Identifier(ArknightMod.MOD_ID,id)),item);
    }
public static Item register(String id, Item item) {

        return register(new Identifier(ArknightMod.MOD_ID,id), item);
}

    public static Item register(Identifier id, Item item) {
        return register(RegistryKey.of(Registries.ITEM.getKey(), id), item);
    }

    public static Item register(RegistryKey<Item> key, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return Registry.register(Registries.ITEM, key, item);
    }
    private static void addItemToItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(ICE_ETHER);
        entries.add(Raw_ICE_ETHER);
    }
    private static void addItemToItemGroup2(FabricItemGroupEntries entries)
    {
        entries.add(CARDBOARD);

    }
    public  static void registerItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemToItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToItemGroup2);
    }
}


