package net.stckoverflw.rmvw.mixin;

import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.s2c.play.ServerMetadataS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ClientPlayNetworkHandler.class)
public class ClientPlayNetworkHandlerMixin {

    @Redirect(method = "onServerMetadata(Lnet/minecraft/network/packet/s2c/play/ServerMetadataS2CPacket;)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/network/packet/s2c/play/ServerMetadataS2CPacket;isSecureChatEnforced()Z"))
    public boolean isSecureChatEnforcedRedirect(ServerMetadataS2CPacket instance) {
        return true;
    }

}
