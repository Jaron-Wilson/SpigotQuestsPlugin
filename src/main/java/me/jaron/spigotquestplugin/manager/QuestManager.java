package me.jaron.spigotquestplugin.manager;

import me.jaron.spigotquestplugin.Quest;

import java.util.ArrayList;
import java.util.List;

public class QuestManager {
    private final List<Quest> quests;

    public QuestManager() {
        quests = new ArrayList<>();
    }

    public void addQuest(Quest quest) {
        quests.add(quest);
    }

    public List<Quest> getQuests() {
        return quests;
    }

    public void removeQuest(Quest quest) {
        quests.remove(quest);
    }

    // Other methods to manage quests...
}
