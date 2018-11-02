package com.imooc.test;

import com.imooc.po.AccessToken;
import com.imooc.util.WeixinUtil;

import net.sf.json.JSONObject;

public class WeixinTest {
	public static void main(String[] args) {
		try {/*
			AccessToken token = WeixinUtil.getAccessToken();
			System.out.println("票据"+token.getToken());
			System.out.println("有效时间"+token.getExpiresIn());*/
			
			String tt="8_L4jqPJxD1VL3N7tPCGOTRPvSuTNVwDKM0-HbcuuyXTvCVstOl3XrhKkJeMZXZE6icQN_kwi_7tyXIGiEb6l4zgAniPhtL2-4OoikIPWDFjyzQFtqaNtkBl4ELfHHx91KiunYGGT4f53DqH5MMSFdAFAZFS";
			
			//String path = "D:/imooc.jpg";
			//String mediaId = WeixinUtil.upload(path, token.getToken(), "thumb");
			//System.out.println(mediaId);
			
			//删除菜单
//			int errcode1=WeixinUtil.deleteMenu(tt);
//			System.out.println("删除码为："+errcode1);
			//创建菜单
			String menu=JSONObject.fromObject(WeixinUtil.initMenu()).toString();
			int errcode=WeixinUtil.createMenu(tt,menu);
			System.out.println("错误码为："+errcode);
			
			/*String result = WeixinUtil.translate("my name is laobi");
			//String result = WeixinUtil.translateFull("");
			System.out.println(result);*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
