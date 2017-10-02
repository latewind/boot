package com.latewind.module.notice.service;

import java.util.List;

import com.latewind.module.notice.entity.Announcement;
import com.latewind.module.notice.entity.Headline;

public interface INoticeService {
	
	/**
	 * get current headline
	 * @return
	 */
	Headline getHeadLine();
	
	Integer backupHeadline(Headline rocord);
	
	
	Announcement getAnnounById(Integer id);
	Integer updateAnnoun(Announcement announcement);
	
	Integer updateHeadLine(Headline record);
	
	List<Announcement> getAnnouncement();

}
