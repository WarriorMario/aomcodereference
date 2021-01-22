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
 * This taglet indicates that a command can only be executed in single player mode.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class SinglePlayerTaglet implements Taglet { //TODO tag functions with @single

	@Override
	public String getName() {
		return "single";
	}

	@Override
	public boolean isInlineTag() {
		return false;
	}


		
		public static void register(Map<String, Taglet> tagletMap) {
			SinglePlayerTaglet tag = new SinglePlayerTaglet();
			Taglet t = (Taglet) tagletMap.get(tag.getName());
			if (t != null)
				tagletMap.remove(tag.getName());
			tagletMap.put(tag.getName(), tag);
	    }


		@Override
		public String toString(List<? extends DocTree> arg0, Element arg1) {
			return "<DT><B>Single Player Only</B></DT><DD>" + arg0.toString()+ "</DD>\n";
		}
		@Override
		public Set<Location> getAllowedLocations() 
		{
			return EnumSet.allOf(jdk.javadoc.doclet.Taglet.Location.class);
		}
}
