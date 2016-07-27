package me.Cutiemango.MangoQuest.questobjects;

import me.Cutiemango.MangoQuest.QuestUtil;
import net.citizensnpcs.api.npc.NPC;
import net.md_5.bungee.api.chat.TextComponent;

public class QuestObjectTalkToNPC extends SimpleQuestObject{
	
	public QuestObjectTalkToNPC(NPC npc) {
		this.TargetNPC = npc;
	}

	private NPC TargetNPC;
	
	public NPC getTargetNPC() {
		return TargetNPC;
	}

	public void setTargetNPC(NPC targetNPC) {
		TargetNPC = targetNPC;
	}

	@Override
	public TextComponent toTextComponent(boolean isFinished) {
		TextComponent text = new TextComponent();
		if (isFinished) {
			text = new TextComponent(QuestUtil.translateColor("&8&m&o�P "));
			text.addExtra(QuestUtil.convertNPCtoHoverEvent(true, getTargetNPC()));
			text.addExtra(QuestUtil.translateColor(" &8&m&o���"));
		} else {
			text = new TextComponent(QuestUtil.translateColor("&0�P "));
			text.addExtra(QuestUtil.convertNPCtoHoverEvent(false, getTargetNPC()));
			text.addExtra(QuestUtil.translateColor(" &0���"));
		}
		return text;
	}

	@Override
	public String toPlainText() {
		return QuestUtil.translateColor("&a�P " + getTargetNPC().getName() + " &a���");
	}

}