package com.app.message.req;

/**
 * ��Ƶ��Ϣ
 * */
public class VoiceMessage extends BaseMessage {
	//��ƵID
	private String MediaId;
	//��Ƶ��ʽ
	private String Format;
	
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	public String getFormat() {
		return Format;
	}
	public void setFormat(String format) {
		Format = format;
	}
	
}
