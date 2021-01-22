package aom.scripting.taglet;

import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.lang.model.element.Element;

import com.sun.source.doctree.DocTree;

import aom.scripting.datatypes.*;
import jdk.javadoc.doclet.Taglet;
import jdk.javadoc.doclet.Taglet.Location;


/**
 * <p>
 * This taglet indicates that a command is automatically synchronized with the other players, instead of only executed locally.
 * If this is not the case and the command is only executed locally, the game will go Out of Sync.
 * </p>
 * 
 * <p>
 * For example the trigger command <code>{@link aom.scripting.xs.tr.Triggers#trTechInvokeGodPower(int, string, vector, vector)}</code> invokes a GP, but only locally.
 * If this trigger command is only executed by 1 player and not by the others, 
 * an OoS error will occur.
 * </p>
 * 
 * <p>
 * On the other hand, the console command <code>{@link aom.scripting.ui.console.Unit#trainInSelected(string, int)}</code>
 * - even though only issued locally - will automatically be sent to 
 * the other players in the game. They will also execute the command in their game
 * and synchronized is guaranteed. 
 * </p>
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class SyncTaglet implements Taglet { //TODO tag functions with @sync (console package done)

	@Override
	public String getName() {
		return "sync";
	}

	@Override
	public boolean isInlineTag() {
		return false;
	}
	
	public static void register(Map<String, Taglet> tagletMap) {
		SyncTaglet tag = new SyncTaglet();
		Taglet t = (Taglet) tagletMap.get(tag.getName());
		if (t != null)
			tagletMap.remove(tag.getName());
		tagletMap.put(tag.getName(), tag);
    }
 
	@Override
	public String toString(List<? extends DocTree> arg0, Element arg1) {
		return "<DT><B>Auto Syncs</B></DT><DD>" + arg0.toString() + "</DD>\n";
	}
	@Override
	public Set<Location> getAllowedLocations() 
	{
		return EnumSet.allOf(jdk.javadoc.doclet.Taglet.Location.class);
	}
}
