package com.bonree.brfs.resourceschedule.gather.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.bonree.brfs.resourceschedule.commons.Cache;
import com.bonree.brfs.resourceschedule.commons.Constant;
import com.bonree.brfs.resourceschedule.commons.GatherResource;
import com.bonree.brfs.resourceschedule.model.BaseServerModel;
/*****************************************************************************
 * 版权信息：北京博睿宏远数据科技股份有限公司
 * Copyright: Copyright (c) 2007北京博睿宏远数据科技股份有限公司,Inc.All Rights Reserved.
 * 
 * @date 2018年3月13日 下午2:57:19
 * @Author: <a href=mailto:zhucg@bonree.com>朱成岗</a>
 * @Description: 采集原始基本信息及集群基本信息
 *****************************************************************************/
public class GatherBaseResourceInfoJob implements Job{

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		// TODO Auto-generated method stub
		BaseServerModel obj = GatherResource.gatherBaseServerInfo(Constant.cache);
		Constant.cache.SERVER_INFO.setBaseServerInfo(obj);
	}
	
}