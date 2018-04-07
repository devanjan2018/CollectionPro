package com.pro.actions;

import java.net.URL;

import com.pro.Iproperty.IPROPERTY;
import com.sun.beans.util.Cache;
import net.sf.ehcache.CacheManager;
import org.springframework.cache.*;

public class EhcacheManager {
	private static net.sf.ehcache.Cache newCache;
	private static EhcacheManager manager=new EhcacheManager();
	
	private EhcacheManager()
	{
		URL url=getClass().getResource(IPROPERTY.CACHE_DIR+"/ehcache.xml");
		
		CacheManager manager= new CacheManager(url);
		EhcacheManager.newCache=manager.getCache("newsCache");
	}
	
	public static net.sf.ehcache.Cache getCache()
	{
		return EhcacheManager.newCache;
	}

}
