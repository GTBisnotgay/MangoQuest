package me.Cutiemango.MangoQuest.data;

import me.Cutiemango.MangoQuest.questobjects.QuestObjectBreakBlock;
import me.Cutiemango.MangoQuest.questobjects.QuestObjectItemDeliver;
import me.Cutiemango.MangoQuest.questobjects.QuestObjectKillMob;
import me.Cutiemango.MangoQuest.questobjects.QuestObjectTalkToNPC;
import me.Cutiemango.MangoQuest.questobjects.SimpleQuestObject;

public class QuestObjectProgress {
	
	private boolean isFinished = false;
	private SimpleQuestObject obj;
	private int i;
	
	public QuestObjectProgress(SimpleQuestObject object, int amount){
		obj = object;
		i = amount;
	}
	
	public void checkIfFinished(){
		if (obj instanceof QuestObjectItemDeliver){
			if (((QuestObjectItemDeliver)obj).getDeliverAmount() == i)
				isFinished = true;
		}
		else if (obj instanceof QuestObjectTalkToNPC){
			if (i == 1)
				isFinished = true;
		}
		else if (obj instanceof QuestObjectKillMob){
			if (((QuestObjectKillMob)obj).getAmount() == i)
				isFinished = true;
		}
		else if (obj instanceof QuestObjectBreakBlock){
			if (((QuestObjectBreakBlock)obj).getAmount() == i)
				isFinished = true;
		}
	}
	
	public SimpleQuestObject getObject(){
		return obj;
	}
	
	public int getProgress(){
		return i;
	}
	
	public boolean isFinished(){
		return isFinished;
	}
	
	public void finish(){
		isFinished = true;
	}
	
	public void setProgress(int p){
		i = p;
	}

}