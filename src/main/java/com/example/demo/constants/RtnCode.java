package com.example.demo.constants;




//enum Ãþ§O!!!!!!!!!!!!!
public enum RtnCode {

	SUCCESSFUL(200,"OK"), //
	PARAM_ERROR(400,"Param Error"), //  
	ACCOUNT_EXISTED(400,"Account Existed"), //
	ACCOUNT_NOT_FOUND(404,"account notfound"),//
	ACCOUNT_NOT_ENOUGH(400,"balance not enough"),//
	;
	
	
	private int code;
	
	private String message;

	private RtnCode(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}


	
}
