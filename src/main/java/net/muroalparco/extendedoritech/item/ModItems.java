package net.muroalparco.extendedoritech.item;

import net.minecraft.world.item.Item;
import net.muroalparco.extendedoritech.OritechAddon;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OritechAddon.MOD_ID);

    public static final DeferredItem<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
