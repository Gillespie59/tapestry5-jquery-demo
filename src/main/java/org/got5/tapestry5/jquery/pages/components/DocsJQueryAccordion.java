//
// Copyright 2010 GOT5 (GO Tapestry 5)
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

package org.got5.tapestry5.jquery.pages.components;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.tapestry5.EventConstants;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.PageReset;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.got5.tapestry5.jquery.utils.JQueryAccordionData;
import org.got5.tapestry5.jquery.utils.JQueryTabData;


public class DocsJQueryAccordion
{

	public List<JQueryTabData> getListTabData(){
		
		List<JQueryTabData> listTabData = new ArrayList<JQueryTabData>();
		
	    listTabData.add(new JQueryTabData("Documentation","docs"));
	    
	    listTabData.add(new JQueryTabData("Example","example"));
	    
	    return listTabData;
	}
	
@Persist
@Property
private int activeElement;

@Persist
@Property
private Date sysDate;

@Property
private List<JQueryAccordionData> list;

@OnEvent(EventConstants.ACTIVATE)
void onSetupRender()
{
			
	list = new ArrayList<JQueryAccordionData>();
    list.add(new JQueryAccordionData("Element1","block1"));
    list.add(new JQueryAccordionData("Element2","block2"));
    list.add(new JQueryAccordionData("Element3","block3"));
    list.add(new JQueryAccordionData("Element4","block4"));
    
}
		
	@Persist
	@Property
	private int tabIndex;
	
	@PageReset
	public void resetTabIndex(){
		tabIndex=0;
		activeElement=0;
	}
	
	public void onSubmit(){
		tabIndex=1;
		activeElement=3;
	}

}
