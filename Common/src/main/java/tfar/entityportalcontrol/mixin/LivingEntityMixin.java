package tfar.entityportalcontrol.mixin;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import tfar.entityportalcontrol.EntityPortalControl;

@Mixin(Entity.class)
public abstract class LivingEntityMixin {
    @Shadow public abstract EntityType<?> getType();

    @Inject(method = "canChangeDimensions",at = @At("RETURN"),cancellable = true)
    private void preventTeleport(CallbackInfoReturnable<Boolean> cir) {
        boolean cancelled = cir.getReturnValue();
        if (!cancelled) return;
        cir.setReturnValue(this.getType().is(EntityPortalControl.ALLOWED_ENTITIES));
    }
}
