package com.coupang.WEBPS001.ryan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deal {

  private int id;
  private List<Integer> options;

  public Deal() {
    options = new ArrayList<Integer>();
  }

  public Deal(int dealId, int option) {
    this.id = dealId;
    this.options = new ArrayList<Integer>();
    options.add(option);
  }

  public List<Integer> getOptions() {
    Collections.sort(options);
    return options;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void addOption(int option) {
    options.add(option);
  }

  public String toString() {
    Collections.sort(options);
    StringBuffer sb = new StringBuffer();
    sb.append(id).append("->");
    for (Integer option : options) {
      sb.append(option).append(",");
    }
    sb.deleteCharAt(sb.lastIndexOf(","));
    return sb.toString();
  }
}
