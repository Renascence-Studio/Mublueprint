package hlft.fabric.mublueprint.data.providers;

import hlft.fabric.mublueprint.Mublueprint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.item.Item;

import java.util.Optional;

import static hlft.fabric.mublueprint.Mublueprint.asId;

public class MuModelsProvider extends FabricModelProvider {
    public MuModelsProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator generator) {
        for (Item item : Mublueprint.ITEMS.values()){
            generator.register(item, model());
        }
    }

    private static Model model() {
        return new Model(Optional.of(asId("item/base")), Optional.empty(), TextureKey.LAYER0);
    }
}
