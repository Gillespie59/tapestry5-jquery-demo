package org.got5.tapestry5.jquery.pages.mixins;

import java.util.ArrayList;
import java.util.List;

import org.got5.tapestry5.jquery.utils.JQueryTabData;

public class DocsReveal {
	 
	public List<JQueryTabData> getListTabData()
	 {
		List<JQueryTabData> listTabData = new ArrayList<JQueryTabData>();
	    
		listTabData.add(new JQueryTabData("Documentation","docs"));
	    
		listTabData.add(new JQueryTabData("Example","example"));
	    
		return listTabData;
	 }
}
