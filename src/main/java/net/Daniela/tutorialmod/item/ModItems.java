package net.Daniela.tutorialmod.item;

import net.Daniela.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    //DeferredRegister is a list that forge loads once the game is open
    /*In this case we are creating a deferredRegister of the object of the type item that will hold
    * our custom items from our tutorialMod*/
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    //Here we create a new item called sapphire passing a human name, and a one time only use function (supplier)
    //that creates a new item with new item properties
    //in this situation, the item still has no name, no texture no interactions with anything, it's just a reserved slot
    public static final RegistryObject<Item> SAPPHIRE =ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    //Every time we create a new item we got to register it, and that's what we do in this method
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
