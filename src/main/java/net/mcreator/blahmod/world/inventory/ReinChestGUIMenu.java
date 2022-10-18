
package net.mcreator.blahmod.world.inventory;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.blahmod.procedures.ReinChestClosedProcedure;
import net.mcreator.blahmod.init.BlahmodModMenus;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class ReinChestGUIMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;

	public ReinChestGUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(BlahmodModMenus.REIN_CHEST_GUI.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(78);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack;
				if (hand == 0)
					itemstack = this.entity.getMainHandItem();
				else
					itemstack = this.entity.getOffhandItem();
				itemstack.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) {
				extraData.readByte(); // drop padding
				Entity entity = world.getEntity(extraData.readVarInt());
				if (entity != null)
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				BlockEntity ent = inv.player != null ? inv.player.level.getBlockEntity(pos) : null;
				if (ent != null) {
					ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
				}
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 8, 17) {
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 26, 17) {
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 44, 17) {
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 62, 17) {
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 80, 17) {
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 98, 17) {
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 116, 17) {
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 134, 17) {
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 152, 17) {
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 170, 17) {
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 188, 17) {
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 206, 17) {
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 224, 17) {
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 8, 35) {
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 26, 35) {
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 44, 35) {
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 62, 35) {
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 80, 35) {
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 98, 35) {
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 116, 35) {
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 134, 35) {
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 152, 35) {
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 170, 35) {
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 188, 35) {
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 206, 35) {
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 224, 35) {
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 8, 53) {
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 26, 53) {
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 44, 53) {
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 62, 53) {
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 80, 53) {
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 98, 53) {
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 116, 53) {
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 134, 53) {
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 152, 53) {
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 170, 53) {
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 188, 53) {
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 206, 53) {
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 224, 53) {
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 8, 71) {
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 26, 71) {
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 44, 71) {
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 62, 71) {
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 80, 71) {
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 98, 71) {
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 116, 71) {
		}));
		this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 134, 71) {
		}));
		this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 152, 71) {
		}));
		this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 170, 71) {
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 188, 71) {
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 206, 71) {
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 224, 71) {
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 8, 89) {
		}));
		this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 26, 89) {
		}));
		this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 44, 89) {
		}));
		this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 62, 89) {
		}));
		this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 80, 89) {
		}));
		this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 98, 89) {
		}));
		this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 116, 89) {
		}));
		this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 134, 89) {
		}));
		this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 152, 89) {
		}));
		this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 170, 89) {
		}));
		this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 188, 89) {
		}));
		this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 206, 89) {
		}));
		this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 224, 89) {
		}));
		this.customSlots.put(65, this.addSlot(new SlotItemHandler(internal, 65, 8, 107) {
		}));
		this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 26, 107) {
		}));
		this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 44, 107) {
		}));
		this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 62, 107) {
		}));
		this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 80, 107) {
		}));
		this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 98, 107) {
		}));
		this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 116, 107) {
		}));
		this.customSlots.put(72, this.addSlot(new SlotItemHandler(internal, 72, 134, 107) {
		}));
		this.customSlots.put(73, this.addSlot(new SlotItemHandler(internal, 73, 152, 107) {
		}));
		this.customSlots.put(74, this.addSlot(new SlotItemHandler(internal, 74, 170, 107) {
		}));
		this.customSlots.put(75, this.addSlot(new SlotItemHandler(internal, 75, 188, 107) {
		}));
		this.customSlots.put(76, this.addSlot(new SlotItemHandler(internal, 76, 206, 107) {
		}));
		this.customSlots.put(77, this.addSlot(new SlotItemHandler(internal, 77, 224, 107) {
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 37 + 8 + sj * 18, 52 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 37 + 8 + si * 18, 52 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 78) {
				if (!this.moveItemStackTo(itemstack1, 78, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 78, false)) {
				if (index < 78 + 27) {
					if (!this.moveItemStackTo(itemstack1, 78 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 78, 78 + 27, false))
						return ItemStack.EMPTY;
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.getCount() == 0)
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();
			if (itemstack1.getCount() == itemstack.getCount())
				return ItemStack.EMPTY;
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override
	protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
		boolean flag = false;
		int i = p_38905_;
		if (p_38907_) {
			i = p_38906_ - 1;
		}
		if (p_38904_.isStackable()) {
			while (!p_38904_.isEmpty()) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot = this.slots.get(i);
				ItemStack itemstack = slot.getItem();
				if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
					int j = itemstack.getCount() + p_38904_.getCount();
					int maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
					if (j <= maxSize) {
						p_38904_.setCount(0);
						itemstack.setCount(j);
						slot.set(itemstack);
						flag = true;
					} else if (itemstack.getCount() < maxSize) {
						p_38904_.shrink(maxSize - itemstack.getCount());
						itemstack.setCount(maxSize);
						slot.set(itemstack);
						flag = true;
					}
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		if (!p_38904_.isEmpty()) {
			if (p_38907_) {
				i = p_38906_ - 1;
			} else {
				i = p_38905_;
			}
			while (true) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot1 = this.slots.get(i);
				ItemStack itemstack1 = slot1.getItem();
				if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
					if (p_38904_.getCount() > slot1.getMaxStackSize()) {
						slot1.set(p_38904_.split(slot1.getMaxStackSize()));
					} else {
						slot1.set(p_38904_.split(p_38904_.getCount()));
					}
					slot1.setChanged();
					flag = true;
					break;
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		return flag;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		ReinChestClosedProcedure.execute(world, x, y, z);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					playerIn.drop(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}
}
