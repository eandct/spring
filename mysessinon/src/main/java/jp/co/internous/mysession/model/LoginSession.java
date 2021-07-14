package jp.co.internous.mysession.model;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//　各Controllerクラスでは、@Autowiredアノテーションにより部品として使用できるようになる。
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
//　範囲をSessionに指定している
public class LoginSession implements Serializable{
	// Serializableはクラスのデータをバイト配列に変換するインターフェイス。Webページ側と直接やり取りするクラスはByteデータに変換する必要がある。
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
