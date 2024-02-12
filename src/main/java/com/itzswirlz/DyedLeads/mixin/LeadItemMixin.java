package com.itzswirlz.DyedLeads.mixin;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.item.DyeableItem;
import net.minecraft.item.LeadItem;

@Mixin(LeadItem.class)
public class LeadItemMixin implements DyeableItem {
}