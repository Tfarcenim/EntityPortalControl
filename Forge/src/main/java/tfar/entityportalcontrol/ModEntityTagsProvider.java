package tfar.entityportalcontrol;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModEntityTagsProvider extends EntityTypeTagsProvider {
    public ModEntityTagsProvider(DataGenerator p_126517_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_126517_, EntityPortalControl.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(EntityPortalControl.ALLOWED_ENTITIES).add(EntityType.PLAYER);
    }
}
