package com.latewind.module.notice.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.latewind.module.notice.dao.AnnouncementMapper;
import com.latewind.module.notice.dao.HeadlineMapper;
import com.latewind.module.notice.entity.Announcement;
import com.latewind.module.notice.entity.Headline;

@Service("noticeService")
public class NoticeServiceImpl implements INoticeService{
@Resource
private HeadlineMapper headlineDAO;

@Resource
private AnnouncementMapper announcementDAO;
	@Override
	public Headline getHeadLine() {
		
//		headlineDAO.s
				return headlineDAO.selectCurrentHeadline();
	}
	@Override
	public List<Announcement> getAnnouncement() {
				return announcementDAO.selectCurAnnounce();
	}
	@Override
	public Integer updateHeadLine(Headline record) {
				return headlineDAO.updateByPrimaryKeySelective(record);
	}
	@Override
	public Integer backupHeadline(Headline rocord) {
				return headlineDAO.insertSelective(rocord);
	}
	@Override
	public Integer updateAnnoun(Announcement announcement) {
				return announcementDAO.updateByPrimaryKeySelective(announcement);
	}
	@Override
	public Announcement getAnnounById(Integer announId) {
				return announcementDAO.selectByPrimaryKey(announId);
	}
	
	

	
}
