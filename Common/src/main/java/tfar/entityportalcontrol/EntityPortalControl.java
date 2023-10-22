package tfar.entityportalcontrol;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tfar.entityportalcontrol.platform.Services;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class EntityPortalControl {

    public static final String MOD_ID = "entityportalcontrol";
    public static final String MOD_NAME = "Multi Loader Template";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static final TagKey<EntityType<?>> ALLOWED_ENTITIES = TagKey.create(Registry.ENTITY_TYPE_REGISTRY,new ResourceLocation(MOD_ID,"allowed_entities"));

    // This method serves as an initialization hook for the mod. The vanilla
    // game has no mechanism to load tooltip listeners so this must be
    // invoked from a mod loader specific project like Forge or Fabric.
    public static void init() {

    }
}