package com.viafirma.documents.sdk.java.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class EvidencePoint  {
  
  private Double x = null;
  private Double y = null;
  private Double pressure = null;
  private Long milliseconds = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("x")
  public Double getX() {
    return x;
  }
  public void setX(Double x) {
    this.x = x;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("y")
  public Double getY() {
    return y;
  }
  public void setY(Double y) {
    this.y = y;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("pressure")
  public Double getPressure() {
    return pressure;
  }
  public void setPressure(Double pressure) {
    this.pressure = pressure;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("milliseconds")
  public Long getMilliseconds() {
    return milliseconds;
  }
  public void setMilliseconds(Long milliseconds) {
    this.milliseconds = milliseconds;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvidencePoint {\n");
    
    sb.append("  x: ").append(x).append("\n");
    sb.append("  y: ").append(y).append("\n");
    sb.append("  pressure: ").append(pressure).append("\n");
    sb.append("  milliseconds: ").append(milliseconds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
