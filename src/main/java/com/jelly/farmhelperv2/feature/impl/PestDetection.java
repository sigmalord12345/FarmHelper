package com.jelly.farmhelperv2.feature.impl;  // Keep your package if needed

import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PestDetection {

    private final String patternOnePest = "§6§l.*! §7A §6Pest §7has appeared in §aPlot §7- §b(?<plot>.*)§7!";
    private final String patternMultiplePests = "§6§l.*! §6(?<amount>\\d) Pests §7have spawned in §aPlot §7- §b(?<plot>.*)§7!";

    // Keep the method as public static if you need to access it statically
    public static PestDetection instance;

    public static PestDetection getInstance() {
        if (instance == null) {
            instance = new PestDetection();
        }
        return instance;
    }

    @SubscribeEvent
    public void onChat(ClientChatReceivedEvent event) {
        if (event.type != 0) return;  // Ensure it's the right type of event

        String message = event.message.getUnformattedText();

        if (message.matches(patternOnePest) || message.matches(patternMultiplePests)) {
            // Pest spawn detected, you can add behavior here if needed.
            // For now, this just detects the spawn without performing any action.
        }
    }
}
