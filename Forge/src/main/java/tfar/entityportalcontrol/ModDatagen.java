package tfar.entityportalcontrol;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;

public class ModDatagen {

    static void start(GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        dataGenerator.addProvider(event.includeServer(), new ModEntityTagsProvider(dataGenerator,existingFileHelper));
    }
}
