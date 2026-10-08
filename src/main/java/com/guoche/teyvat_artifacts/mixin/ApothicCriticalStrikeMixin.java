package com.guoche.teyvat_artifacts.mixin;

import com.guoche.teyvat_artifacts.ArtifactEvents;
import dev.shadowsoffire.attributeslib.impl.AttributeEvents;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = AttributeEvents.class, remap = false)
public abstract class ApothicCriticalStrikeMixin {
    @ModifyVariable(method = "apothCriticalStrike", at = @At(value = "STORE", ordinal = 0), ordinal = 0, remap = false)
    private double teyvat_artifacts$adjustCritChance(double chance, LivingHurtEvent event) {
        return ArtifactEvents.adjustApothicCritChance(event.getSource(), event.getEntity(), chance);
    }

    @ModifyVariable(method = "apothCriticalStrike", at = @At(value = "STORE", ordinal = 0), ordinal = 0, remap = false)
    private float teyvat_artifacts$adjustCritDamage(float damage, LivingHurtEvent event) {
        return ArtifactEvents.adjustApothicCritDamage(event.getSource(), damage);
    }

    @Redirect(method = "apothCriticalStrike", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/event/entity/living/LivingHurtEvent;setAmount(F)V", remap = false), remap = false)
    private void teyvat_artifacts$recordCrit(LivingHurtEvent event, float amount) {
        float previous = event.getAmount();
        event.setAmount(amount);
        if (amount > previous) {
            ArtifactEvents.onApothicCritical(event.getSource(), event.getEntity());
        }
    }
}
