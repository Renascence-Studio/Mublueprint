package hlft.fabric.mublueprint;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import static hlft.fabric.mublueprint.Mublueprint.ITEMS;
import static hlft.fabric.mublueprint.Mublueprint.asId;

public class MublueprintTab {
    public static final ItemGroup MAIN = FabricItemGroupBuilder
            .create(asId("main"))
            .icon(Mublueprint::getIconItem)
            .appendItems(itemStacks -> itemStacks.addAll(ITEMS.values().stream().map(ItemStack::new).toList()))
            .build();
}
