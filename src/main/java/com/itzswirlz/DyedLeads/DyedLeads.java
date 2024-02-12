package com.itzswirlz.DyedLeads;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialRecipeSerializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DyedLeads implements ModInitializer {
	public static RecipeSerializer<LeadDyeRecipe> LEAD_DYE;

	@Override
	public void onInitialize(ModContainer mod) {
		LEAD_DYE = Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(mod.metadata().id(), "crafting_special_leaddye"), new SpecialRecipeSerializer<LeadDyeRecipe>(LeadDyeRecipe::new));
	}
}
