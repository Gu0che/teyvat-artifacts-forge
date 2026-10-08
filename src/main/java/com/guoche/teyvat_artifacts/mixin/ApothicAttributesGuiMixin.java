package com.guoche.teyvat_artifacts.mixin;

import com.guoche.teyvat_artifacts.TeyvatArtifacts;
import dev.shadowsoffire.attributeslib.ALConfig;
import dev.shadowsoffire.attributeslib.client.AttributesGui;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = AttributesGui.class, remap = false)
public abstract class ApothicAttributesGuiMixin {
    @Inject(method = "refreshData", at = @At("HEAD"), remap = false)
    private void teyvat_artifacts$hideIntermediateDamageBonus(CallbackInfo ci) {
        ALConfig.hiddenAttributes.add(TeyvatArtifacts.DAMAGE_BONUS.getId());
    }
}
