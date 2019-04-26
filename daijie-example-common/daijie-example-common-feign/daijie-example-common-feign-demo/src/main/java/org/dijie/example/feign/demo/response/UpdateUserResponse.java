package org.dijie.example.feign.demo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(description = "修改用户")
public class UpdateUserResponse implements Serializable {

	private static final long serialVersionUID = 7938558749793215853L;
	
	@ApiModelProperty(name = "status", value = "是否修改成功", required = true)
	private boolean status;
	
	public UpdateUserResponse(){}

	public UpdateUserResponse(boolean status) {
		super();
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}