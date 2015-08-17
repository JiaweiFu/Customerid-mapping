package com.hybris.datahub.customeridmapping.rest.resources;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ItemDemos")
public class ItemDemo {
    private String id;
    private String name;
    
	public ItemDemo() {

	}
    
    
	public ItemDemo(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    
}
