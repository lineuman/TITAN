package com.yunji.titan.agent.link;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yunji.titan.agent.stresstest.Stresstest;
import com.yunji.titan.utils.AgentTaskBean;
import com.yunji.titan.utils.ContentType;
import com.yunji.titan.utils.LinkBean;
import com.yunji.titan.utils.RequestType;

public class StressTestContext {
	private Map<String, Integer> paramIndex;
	private Map<String, RequestType> requestTypes;
	private AgentTaskBean taskBean;
	private Stresstest httpGetRequestStresstest;
	private Stresstest httpPostRequestStresstest;
	private Map<String, String> charsets;
	//存储一个url有哪些变量，变量取值公式
	private Map<String, List<String>> variables;
	private Map<String, String> successExpression;
	private Map<String, ContentType> contentTypes;
	//场景多个链路执行一次时共享的变量、变量值
	private Map<String,String> varValue;
	//是否成功编码
	private String code;
	//局部的变量、变量值
	private Map<String,String> localVarValue=new HashMap<String,String>();
	private Map<String, String> idUrls;
	private List<LinkBean> links;
	//场景全局变量,场景n个用户并发,这些用户共享的变量、变量值
	private SceneVariableManager sceneVariableManager;
	
	public Map<String, Integer> getParamIndex() {
		return paramIndex;
	}
	public void setParamIndex(Map<String, Integer> paramIndex) {
		this.paramIndex = paramIndex;
	}
	public Map<String, RequestType> getRequestTypes() {
		return requestTypes;
	}
	public void setRequestTypes(Map<String, RequestType> requestTypes) {
		this.requestTypes = requestTypes;
	}
	public AgentTaskBean getTaskBean() {
		return taskBean;
	}
	public void setTaskBean(AgentTaskBean taskBean) {
		this.taskBean = taskBean;
	}
	public Stresstest getHttpGetRequestStresstest() {
		return httpGetRequestStresstest;
	}
	public void setHttpGetRequestStresstest(Stresstest httpGetRequestStresstest) {
		this.httpGetRequestStresstest = httpGetRequestStresstest;
	}
	public Stresstest getHttpPostRequestStresstest() {
		return httpPostRequestStresstest;
	}
	public void setHttpPostRequestStresstest(Stresstest httpPostRequestStresstest) {
		this.httpPostRequestStresstest = httpPostRequestStresstest;
	}
	public Map<String, String> getCharsets() {
		return charsets;
	}
	public void setCharsets(Map<String, String> charsets) {
		this.charsets = charsets;
	}
	public Map<String, List<String>> getVariables() {
		return variables;
	}
	public void setVariables(Map<String, List<String>> variables) {
		this.variables = variables;
	}
	public Map<String, String> getSuccessExpression() {
		return successExpression;
	}
	public void setSuccessExpression(Map<String, String> successExpression) {
		this.successExpression = successExpression;
	}
	public Map<String, ContentType> getContentTypes() {
		return contentTypes;
	}
	public void setContentTypes(Map<String, ContentType> contentTypes) {
		this.contentTypes = contentTypes;
	}
	public Map<String, String> getVarValue() {
		return varValue;
	}
	public void setVarValue(Map<String, String> varValue) {
		this.varValue = varValue;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Map<String, String> getLocalVarValue() {
		return localVarValue;
	}
	public void setLocalVarValue(Map<String, String> localVarValue) {
		this.localVarValue = localVarValue;
	}
	
	public Map<String, String> getIdUrls() {
		return idUrls;
	}
	public void setIdUrls(Map<String, String> idUrls) {
		this.idUrls = idUrls;
	}
	
	public List<LinkBean> getLinks() {
		return links;
	}
	public void setLinks(List<LinkBean> links) {
		this.links = links;
	}
	
	public SceneVariableManager getSceneVariableManager() {
		return sceneVariableManager;
	}
	public void setSceneVariableManager(SceneVariableManager sceneVariableManager) {
		this.sceneVariableManager = sceneVariableManager;
	}
	public synchronized StressTestContext copyLocalVarValue(){
		StressTestContext cp=new StressTestContext();
		cp.paramIndex=this.paramIndex;
		cp.requestTypes=this.requestTypes;
		cp.taskBean=this.taskBean;
		cp.httpGetRequestStresstest=this.httpGetRequestStresstest;
		cp.httpPostRequestStresstest=this.httpPostRequestStresstest;
		cp.charsets=this.charsets;
		cp.variables=this.variables;
		cp.successExpression=this.successExpression;
		cp.contentTypes=this.contentTypes;
		cp.varValue=this.varValue;
		cp.code=this.code;
		cp.localVarValue.putAll(this.localVarValue);
		return cp;
	}
}
