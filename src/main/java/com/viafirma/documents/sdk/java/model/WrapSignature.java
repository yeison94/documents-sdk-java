package com.viafirma.documents.sdk.java.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class WrapSignature  {
  
  private String signatureCode = null;
  private String publicKey = null;
  private String messageCode = null;
  private String signedDataBase64 = null;

  
  /**
   * (since 3.5.0) signature code
   **/
  @ApiModelProperty(required = true, value = "(since 3.5.0) signature code")
  @JsonProperty("signatureCode")
  public String getSignatureCode() {
    return signatureCode;
  }
  public void setSignatureCode(String signatureCode) {
    this.signatureCode = signatureCode;
  }

  
  /**
   * (since 3.5.0) public Key
   **/
  @ApiModelProperty(required = true, value = "(since 3.5.0) public Key")
  @JsonProperty("publicKey")
  public String getPublicKey() {
    return publicKey;
  }
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  
  /**
   * (since 3.5.0) message code
   **/
  @ApiModelProperty(required = true, value = "(since 3.5.0) message code")
  @JsonProperty("messageCode")
  public String getMessageCode() {
    return messageCode;
  }
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  
  /**
   * (since 3.5.0) base 64 hash
   **/
  @ApiModelProperty(required = true, value = "(since 3.5.0) base 64 hash")
  @JsonProperty("signedDataBase64")
  public String getSignedDataBase64() {
    return signedDataBase64;
  }
  public void setSignedDataBase64(String signedDataBase64) {
    this.signedDataBase64 = signedDataBase64;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WrapSignature {\n");
    
    sb.append("  signatureCode: ").append(signatureCode).append("\n");
    sb.append("  publicKey: ").append(publicKey).append("\n");
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  signedDataBase64: ").append(signedDataBase64).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
