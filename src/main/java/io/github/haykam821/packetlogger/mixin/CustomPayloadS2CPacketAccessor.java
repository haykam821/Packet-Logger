package io.github.haykam821.packetlogger.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.network.packet.s2c.play.CustomPayloadS2CPacket;
import net.minecraft.util.Identifier;

@Mixin(CustomPayloadS2CPacket.class)
public interface CustomPayloadS2CPacketAccessor {
	@Accessor("channel")
	public Identifier getChannel();
}
