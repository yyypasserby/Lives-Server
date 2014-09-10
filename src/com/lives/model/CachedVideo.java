/**
 * 
 */
package com.lives.model;

import java.time.Duration;
import java.util.Date;

/**
 * @author yyypasserby
 *
 */
public class CachedVideo {
	private int videoId;
	private int userId;
	private String videoname;
	private String thumbnail;
	private String location;
	private Date duration = new Date();
	
	public CachedVideo() {};
	public CachedVideo(int vid, int uid, String name, String thumbnail, long seconds) {
		this.videoId = vid;
		this.userId = uid;
		this.videoname = name;
		this.thumbnail = thumbnail;
		duration.setTime(seconds);
	}
	/**
	 * @return the videoId
	 */
	public int getVideoId() {
		return videoId;
	}
	/**
	 * @param videoId the videoId to set
	 */
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the duration
	 */
	public Date getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Date duration) {
		this.duration = duration;
	}
	/**
	 * @return the videoname
	 */
	public String getVideoname() {
		return videoname;
	}
	/**
	 * @param videoname the videoname to set
	 */
	public void setVideoname(String videoname) {
		this.videoname = videoname;
	}
	/**
	 * @return the videoThumbnail
	 */
	public String getThumbnail() {
		return thumbnail;
	}
	/**
	 * @param videoThumbnail the videoThumbnail to set
	 */
	public void setThumbnail(String videoThumbnail) {
		this.thumbnail = videoThumbnail;
	}
}
