package aom.scripting.taglet;

import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.lang.model.element.Element;

import com.sun.source.doctree.DocTree;

import jdk.javadoc.doclet.Taglet;

/**
 * This taglet indicates that a plan variable is auto created.
 * 
 * @author WarriorMario - warriormario[a]live.nl
 */
public class AutoCreatedTaglet implements Taglet
{
	@Override
	public String getName() {
		return "autocreated";
	}

	@Override
	public boolean isInlineTag() {
		return false;
	}

	
	public static void register(Map<String, Taglet> tagletMap) {
		AutoCreatedTaglet tag = new AutoCreatedTaglet();
		Taglet t = (Taglet) tagletMap.get(tag.getName());
		if (t != null)
			tagletMap.remove(tag.getName());
		tagletMap.put(tag.getName(), tag);
    }


	@Override
	public String toString(List<? extends DocTree> arg0, Element arg1) {
		return "<DT><B>Auto Created Variable</B></DT><DD>" + arg0.toString() + "</DD>\n";
		}

	@Override
	public Set<Location> getAllowedLocations() 
	{
		return EnumSet.allOf(jdk.javadoc.doclet.Taglet.Location.class);
	}
}
