import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;

public class PestDetection {

    private final String patternOnePest = "§6§l.*! §7A §6Pest §7has appeared in §aPlot §7- §b(?<plot>.*)§7!";
    private final String patternMultiplePests = "§6§l.*! §6(?<amount>\\d) Pests §7have spawned in §aPlot §7- §b(?<plot>.*)§7!";

    @SubscribeEvent
    public void onChat(ClientChatReceivedEvent event) {
        if (!Minecraft.getMinecraft().thePlayer.inGarden()) return;

        String message = event.message.getUnformattedText();

        if (message.matches(patternOnePest) || message.matches(patternMultiplePests)) {
           
        }
    }
}
