package net.md_5.bungee.packet;

import java.lang.reflect.InvocationTargetException;
import static net.md_5.bungee.Logger.$;
import net.md_5.bungee.Util;
import net.minecraft.server.Packet;
import net.minecraft.server.Packet0KeepAlive;
import net.minecraft.server.Packet100OpenWindow;
import net.minecraft.server.Packet101CloseWindow;
import net.minecraft.server.Packet102WindowClick;
import net.minecraft.server.Packet103SetSlot;
import net.minecraft.server.Packet104WindowItems;
import net.minecraft.server.Packet105CraftProgressBar;
import net.minecraft.server.Packet106Transaction;
import net.minecraft.server.Packet107SetCreativeSlot;
import net.minecraft.server.Packet108ButtonClick;
import net.minecraft.server.Packet10Flying;
import net.minecraft.server.Packet11PlayerPosition;
import net.minecraft.server.Packet12PlayerLook;
import net.minecraft.server.Packet130UpdateSign;
import net.minecraft.server.Packet131ItemData;
import net.minecraft.server.Packet132TileEntityData;
import net.minecraft.server.Packet13PlayerLookMove;
import net.minecraft.server.Packet14BlockDig;
import net.minecraft.server.Packet15Place;
import net.minecraft.server.Packet16BlockItemSwitch;
import net.minecraft.server.Packet17EntityLocationAction;
import net.minecraft.server.Packet18ArmAnimation;
import net.minecraft.server.Packet19EntityAction;
import net.minecraft.server.Packet1Login;
import net.minecraft.server.Packet200Statistic;
import net.minecraft.server.Packet201PlayerInfo;
import net.minecraft.server.Packet202Abilities;
import net.minecraft.server.Packet203TabComplete;
import net.minecraft.server.Packet204LocaleAndViewDistance;
import net.minecraft.server.Packet205ClientCommand;
import net.minecraft.server.Packet20NamedEntitySpawn;
import net.minecraft.server.Packet21PickupSpawn;
import net.minecraft.server.Packet22Collect;
import net.minecraft.server.Packet23VehicleSpawn;
import net.minecraft.server.Packet24MobSpawn;
import net.minecraft.server.Packet250CustomPayload;
import net.minecraft.server.Packet252KeyResponse;
import net.minecraft.server.Packet253KeyRequest;
import net.minecraft.server.Packet254GetInfo;
import net.minecraft.server.Packet255KickDisconnect;
import net.minecraft.server.Packet25EntityPainting;
import net.minecraft.server.Packet26AddExpOrb;
import net.minecraft.server.Packet28EntityVelocity;
import net.minecraft.server.Packet29DestroyEntity;
import net.minecraft.server.Packet2Handshake;
import net.minecraft.server.Packet30Entity;
import net.minecraft.server.Packet31RelEntityMove;
import net.minecraft.server.Packet32EntityLook;
import net.minecraft.server.Packet33RelEntityMoveLook;
import net.minecraft.server.Packet34EntityTeleport;
import net.minecraft.server.Packet35EntityHeadRotation;
import net.minecraft.server.Packet38EntityStatus;
import net.minecraft.server.Packet39AttachEntity;
import net.minecraft.server.Packet3Chat;
import net.minecraft.server.Packet40EntityMetadata;
import net.minecraft.server.Packet41MobEffect;
import net.minecraft.server.Packet42RemoveMobEffect;
import net.minecraft.server.Packet43SetExperience;
import net.minecraft.server.Packet4UpdateTime;
import net.minecraft.server.Packet51MapChunk;
import net.minecraft.server.Packet52MultiBlockChange;
import net.minecraft.server.Packet53BlockChange;
import net.minecraft.server.Packet54PlayNoteBlock;
import net.minecraft.server.Packet55BlockBreakAnimation;
import net.minecraft.server.Packet56MapChunkBulk;
import net.minecraft.server.Packet5EntityEquipment;
import net.minecraft.server.Packet60Explosion;
import net.minecraft.server.Packet61WorldEvent;
import net.minecraft.server.Packet62NamedSoundEffect;
import net.minecraft.server.Packet6SpawnPosition;
import net.minecraft.server.Packet70Bed;
import net.minecraft.server.Packet71Weather;
import net.minecraft.server.Packet7UseEntity;
import net.minecraft.server.Packet8UpdateHealth;
import net.minecraft.server.Packet9Respawn;

/**
 * Class containing instances of all Vanilla Minecraft packets.
 */
public class VanillaPackets
{

    /**
     * Array of packet instances ordered by packet id.
     */
    public static Packet[] packets = new Packet[256];

    /**
     * Adds a new instance of a packet class to the array storage.
     *
     * @param id of the packet to add
     * @param clazz class of the packet to add
     */
    private static void map(int id, Class<? extends Packet> clazz)
    {
        try
        {
            packets[id] = clazz.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException ex)
        {
            $().severe("Could not register packet id " + Util.hex(id));
        }
    }

    static
    {
        map(0, Packet0KeepAlive.class);
        map(1, Packet1Login.class);
        map(2, Packet2Handshake.class);
        map(3, Packet3Chat.class);
        map(4, Packet4UpdateTime.class);
        map(5, Packet5EntityEquipment.class);
        map(6, Packet6SpawnPosition.class);
        map(7, Packet7UseEntity.class);
        map(8, Packet8UpdateHealth.class);
        map(9, Packet9Respawn.class);
        map(10, Packet10Flying.class);
        map(11, Packet11PlayerPosition.class);
        map(12, Packet12PlayerLook.class);
        map(13, Packet13PlayerLookMove.class);
        map(14, Packet14BlockDig.class);
        map(15, Packet15Place.class);
        map(16, Packet16BlockItemSwitch.class);
        map(17, Packet17EntityLocationAction.class);
        map(18, Packet18ArmAnimation.class);
        map(19, Packet19EntityAction.class);
        map(20, Packet20NamedEntitySpawn.class);
        map(21, Packet21PickupSpawn.class);
        map(22, Packet22Collect.class);
        map(23, Packet23VehicleSpawn.class);
        map(24, Packet24MobSpawn.class);
        map(25, Packet25EntityPainting.class);
        map(26, Packet26AddExpOrb.class);
        map(28, Packet28EntityVelocity.class);
        map(29, Packet29DestroyEntity.class);
        map(30, Packet30Entity.class);
        map(31, Packet31RelEntityMove.class);
        map(32, Packet32EntityLook.class);
        map(33, Packet33RelEntityMoveLook.class);
        map(34, Packet34EntityTeleport.class);
        map(35, Packet35EntityHeadRotation.class);
        map(38, Packet38EntityStatus.class);
        map(39, Packet39AttachEntity.class);
        map(40, Packet40EntityMetadata.class);
        map(41, Packet41MobEffect.class);
        map(42, Packet42RemoveMobEffect.class);
        map(43, Packet43SetExperience.class);
        map(51, Packet51MapChunk.class);
        map(52, Packet52MultiBlockChange.class);
        map(53, Packet53BlockChange.class);
        map(54, Packet54PlayNoteBlock.class);
        map(55, Packet55BlockBreakAnimation.class);
        map(56, Packet56MapChunkBulk.class);
        map(60, Packet60Explosion.class);
        map(61, Packet61WorldEvent.class);
        map(62, Packet62NamedSoundEffect.class);
        map(70, Packet70Bed.class);
        map(71, Packet71Weather.class);
        map(100, Packet100OpenWindow.class);
        map(101, Packet101CloseWindow.class);
        map(102, Packet102WindowClick.class);
        map(103, Packet103SetSlot.class);
        map(104, Packet104WindowItems.class);
        map(105, Packet105CraftProgressBar.class);
        map(106, Packet106Transaction.class);
        map(107, Packet107SetCreativeSlot.class);
        map(108, Packet108ButtonClick.class);
        map(130, Packet130UpdateSign.class);
        map(131, Packet131ItemData.class);
        map(132, Packet132TileEntityData.class);
        map(200, Packet200Statistic.class);
        map(201, Packet201PlayerInfo.class);
        map(202, Packet202Abilities.class);
        map(203, Packet203TabComplete.class);
        map(204, Packet204LocaleAndViewDistance.class);
        map(205, Packet205ClientCommand.class);
        map(250, Packet250CustomPayload.class);
        map(252, Packet252KeyResponse.class);
        map(253, Packet253KeyRequest.class);
        map(254, Packet254GetInfo.class);
        map(255, Packet255KickDisconnect.class);
    }
}
