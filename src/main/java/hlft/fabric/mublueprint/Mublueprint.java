package hlft.fabric.mublueprint;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

import static hlft.fabric.mublueprint.MublueprintTab.MAIN;

public class Mublueprint implements ModInitializer {
    public static final String MOD_ID = "mublueprint";

    public static final List<Item> ITEMS = new ArrayList<>();

    @Override
    public void onInitialize() {
        createItem("blueprint", commonItem());
        createItem("broad_axe_head_blueprint", commonItem());
        createItem("broad_blade_blueprint", commonItem());
        createItem("large_plate_blueprint", commonItem());
        createItem("pick_head_blueprint", commonItem());
        createItem("round_plate_blueprint", commonItem());
        createItem("small_axe_head_blueprint", commonItem());
        createItem("small_blade_blueprint", commonItem());
        createItem("tool_binding_blueprint", commonItem());
        createItem("tool_handle_blueprint", commonItem());
    }

    public static Identifier asId(String path) {
        return new Identifier(MOD_ID, path);
    }

    public static ItemStack getIconItem() {
        return Registry.ITEM.get(asId("blueprint")).getDefaultStack();
    }

    public static FabricItemSettings itemPro() {
        return new FabricItemSettings().group(MAIN);
    }

    public static Item commonItem() {
        return new Item(itemPro().maxCount(1).rarity(Rarity.RARE));
    }

    public static void createItem(String id, Item item) {
        Registry.register(Registry.ITEM, asId(id), item);
        ITEMS.add(item);
    }
}
