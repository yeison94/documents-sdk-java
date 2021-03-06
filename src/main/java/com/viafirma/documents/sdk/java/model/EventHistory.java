package com.viafirma.documents.sdk.java.model;

import java.util.Date;
import com.viafirma.documents.sdk.java.model.ErrorResponse;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class EventHistory  {
  
  private Date start = null;
  private Date ends = null;
  private String taskName = null;
  private Integer order = null;
  private ErrorResponse error = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("start")
  public Date getStart() {
    return start;
  }
  public void setStart(Date start) {
    this.start = start;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("ends")
  public Date getEnds() {
    return ends;
  }
  public void setEnds(Date ends) {
    this.ends = ends;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("taskName")
  public String getTaskName() {
    return taskName;
  }
  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("error")
  public ErrorResponse getError() {
    return error;
  }
  public void setError(ErrorResponse error) {
    this.error = error;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventHistory {\n");
    
    sb.append("  start: ").append(start).append("\n");
    sb.append("  ends: ").append(ends).append("\n");
    sb.append("  taskName: ").append(taskName).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
