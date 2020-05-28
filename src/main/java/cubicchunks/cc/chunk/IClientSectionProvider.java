package cubicchunks.cc.chunk;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.biome.BiomeContainer;
import net.minecraft.world.chunk.Chunk;

import javax.annotation.Nullable;

public interface IClientSectionProvider {

    //i, j, packetIn.getBiomes(), packetIn.getReadBuffer(), packetIn.getHeightmapTags(), packetIn.getAvailableSections()
    Chunk loadSection(int cubeX, int cubeY, int cubeZ, @Nullable BiomeContainer biomes, PacketBuffer readBuffer, CompoundNBT nbtTagIn, boolean cubeExists);
}
