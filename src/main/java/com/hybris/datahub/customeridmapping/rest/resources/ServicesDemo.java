package com.hybris.datahub.customeridmapping.rest.resources;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.hybris.datahub.domain.CanonicalAttributeDefinition;
import com.hybris.datahub.domain.CanonicalItemMetadata;
import com.hybris.kernel.api.PersistenceManager;

public class ServicesDemo {
	
	private PersistenceManager persistenceManager;
	
	public void init(){  
        System.out.println("init  ServicesDemo");  
    }  
	@Transactional
	public Collection<CanonicalItemMetadata> findByRawType()
	  {
	    Collection itemsMeta = new HashSet();

	    Iterable result = getPersistenceManager().createQuery(CanonicalAttributeDefinition.class)
	      .resultList();
	    List attributes = Lists.newArrayList(result);
	    
	    int cnt =10;
	    int i = 0;

	    for (Object attr : attributes)
	    {
	      itemsMeta.add(((CanonicalAttributeDefinition)attr).getCanonicalAttributeModelDefinition().getCanonicalItemMetadata());
	      i++;
	      if(i>10){
	    	  break;
	      }
	    }
	    return itemsMeta;
	  }
	
	@Transactional
	public List<Cow> newCow()
	{
	    final Cow muu = getPersistenceManager().create(Cow.class);
	    muu.setName("abc");
	    
	    getPersistenceManager().flush();
	    getPersistenceManager().refresh(muu);
	    
	    final Collection<Cow> list = getPersistenceManager().createCriteriaQuery(Cow.class) //
	            .resultList();
	    
	    return Lists.newArrayList(list);
	}
	
	
	
	public PersistenceManager getPersistenceManager() {
		return persistenceManager;
	}

	public void setPersistenceManager(PersistenceManager persistenceManager){
	    this.persistenceManager = persistenceManager;
	}
	
	

}
