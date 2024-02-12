package com.itzswirlz.DyedLeads;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.item.DyeableItem;
import net.minecraft.item.Items;

public class DyedLeadsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient(ModContainer mod) {
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
		    return tintIndex > 0 ? -1 : ((DyeableItem)stack.getItem()).getColor(stack);
		}, Items.LEAD);
    }
    
}
