package aom.scripting.taglet;

import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.lang.model.element.Element;

import com.sun.source.doctree.DocTree;

import jdk.javadoc.doclet.Taglet;

/**
 * This taglet indicates that a command can only be executed in Editor Mode.
 * 
 * @local 	These commands are also local by default.
 * 
 * @single 	These commands are obviously meant for single player purposes only,
 * 			but with a mode switch to editor mode, one can sometimes still execute these in multiplayer.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class EditorTaglet implements Taglet
{
	@Override
	public String getName() {
		return "editor";
	}

	@Override
	public boolean isInlineTag() {
		return false;
	}

	
	public static void register(Map<String, Taglet> tagletMap) {
		EditorTaglet tag = new EditorTaglet();
		Taglet t = (Taglet) tagletMap.get(tag.getName());
		if (t != null)
			tagletMap.remove(tag.getName());
		tagletMap.put(tag.getName(), tag);
    }


	@Override
	public String toString(List<? extends DocTree> arg0, Element arg1) {
		return "<DT><B>Editor Mode Only</B></DT><DD>" + arg0.toString() + "</DD>\n";
		}

	@Override
	public Set<Location> getAllowedLocations() 
	{
		return EnumSet.allOf(jdk.javadoc.doclet.Taglet.Location.class);
	}
}
