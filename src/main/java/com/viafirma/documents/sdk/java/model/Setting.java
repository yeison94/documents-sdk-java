package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.Font;
import com.viafirma.documents.sdk.java.model.Policy;
import java.util.*;
import com.viafirma.documents.sdk.java.model.AcrofieldPosition;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Setting  {
  
  private String titleKey = null;
  private String descriptionKey = null;
  private Policy policy = null;
  private String computec_key = null;
  private List<Policy> policies = new ArrayList<Policy>() ;
  private String callbackURL = null;
  private String callbackMails = null;
  private List<String> callbackMailsFormKeys = new ArrayList<String>() ;
  private String validateCode = null;
  private String workflow = null;
  private Font font = null;
  private List<AcrofieldPosition> acrofieldsPositions = new ArrayList<AcrofieldPosition>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("titleKey")
  public String getTitleKey() {
    return titleKey;
  }
  public void setTitleKey(String titleKey) {
    this.titleKey = titleKey;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("descriptionKey")
  public String getDescriptionKey() {
    return descriptionKey;
  }
  public void setDescriptionKey(String descriptionKey) {
    this.descriptionKey = descriptionKey;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("policy")
  public Policy getPolicy() {
    return policy;
  }
  public void setPolicy(Policy policy) {
    this.policy = policy;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("computec_key")
  public String getComputec_key() {
    return computec_key;
  }
  public void setComputec_key(String computec_key) {
    this.computec_key = computec_key;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("policies")
  public List<Policy> getPolicies() {
    return policies;
  }
  public void setPolicies(List<Policy> policies) {
    this.policies = policies;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("callbackURL")
  public String getCallbackURL() {
    return callbackURL;
  }
  public void setCallbackURL(String callbackURL) {
    this.callbackURL = callbackURL;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("callbackMails")
  public String getCallbackMails() {
    return callbackMails;
  }
  public void setCallbackMails(String callbackMails) {
    this.callbackMails = callbackMails;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("callbackMailsFormKeys")
  public List<String> getCallbackMailsFormKeys() {
    return callbackMailsFormKeys;
  }
  public void setCallbackMailsFormKeys(List<String> callbackMailsFormKeys) {
    this.callbackMailsFormKeys = callbackMailsFormKeys;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("validateCode")
  public String getValidateCode() {
    return validateCode;
  }
  public void setValidateCode(String validateCode) {
    this.validateCode = validateCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("workflow")
  public String getWorkflow() {
    return workflow;
  }
  public void setWorkflow(String workflow) {
    this.workflow = workflow;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("font")
  public Font getFont() {
    return font;
  }
  public void setFont(Font font) {
    this.font = font;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("acrofieldsPositions")
  public List<AcrofieldPosition> getAcrofieldsPositions() {
    return acrofieldsPositions;
  }
  public void setAcrofieldsPositions(List<AcrofieldPosition> acrofieldsPositions) {
    this.acrofieldsPositions = acrofieldsPositions;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Setting {\n");
    
    sb.append("  titleKey: ").append(titleKey).append("\n");
    sb.append("  descriptionKey: ").append(descriptionKey).append("\n");
    sb.append("  policy: ").append(policy).append("\n");
    sb.append("  computec_key: ").append(computec_key).append("\n");
    sb.append("  policies: ").append(policies).append("\n");
    sb.append("  callbackURL: ").append(callbackURL).append("\n");
    sb.append("  callbackMails: ").append(callbackMails).append("\n");
    sb.append("  callbackMailsFormKeys: ").append(callbackMailsFormKeys).append("\n");
    sb.append("  validateCode: ").append(validateCode).append("\n");
    sb.append("  workflow: ").append(workflow).append("\n");
    sb.append("  font: ").append(font).append("\n");
    sb.append("  acrofieldsPositions: ").append(acrofieldsPositions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
