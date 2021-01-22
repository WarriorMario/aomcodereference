package aom.scripting.taglet;

import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.lang.model.element.Element;

import com.sun.source.doctree.DocTree;

import jdk.javadoc.doclet.Taglet;
import jdk.javadoc.doclet.Taglet.Location;

/**
 * This taglet indicates that a command is only executed locally, instead of automatically synchronized.
 * It is the opposite of the SyncTaglet. 
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class LocalTaglet implements Taglet { //TODO tag functions with @local (console package done)

	@Override
	public String getName() {
		return "local";
	}
    private static final String NAME = "local";
    private static final String HEADER = "Local";

	@Override
	public boolean isInlineTag() {
		return false;
	}

	
	public static void register(Map<String, Taglet> tagletMap) {
		LocalTaglet tag = new LocalTaglet();
		Taglet t = (Taglet) tagletMap.get(tag.getName());
		if (t != null)
			tagletMap.remove(tag.getName());
		tagletMap.put(tag.getName(), tag);
    }

	@Override
	public String toString(List<? extends DocTree> arg0, Element arg1) {
		return "<DT><B>Local Call</B></DT><DD>" + arg0.toString() + "</DD>\n";
	}
	@Override
	public Set<Location> getAllowedLocations() 
	{
		return EnumSet.allOf(jdk.javadoc.doclet.Taglet.Location.class);
	}
}
