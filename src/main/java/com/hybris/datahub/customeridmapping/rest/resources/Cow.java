package com.hybris.datahub.customeridmapping.rest.resources;

import com.hybris.kernel.api.AttributeType;
import com.hybris.kernel.api.ManagedObject;

public interface Cow extends ManagedObject
{
   public static final String _TYPECODE = "Cow";
   
   public static final AttributeType<Cow, Long> FEEDID = new AttributeType("feedId");

   public static final AttributeType<Cow, String> NAME = new AttributeType("name");
   
   
   public abstract Long getFeedId();
   
   public abstract void setFeedId(Long feedId);

   public abstract String getName();


   public abstract void setName(String name);


}
