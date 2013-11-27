package com.coupang.WEBPS001.ryan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingDealAndOptions {

  public static void main(String[] args) throws NumberFormatException,
      IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String temp = null;
    Map<Integer, Deal> dealOptionsMap = new HashMap<Integer, Deal>();
    while ((temp = in.readLine()) != null && temp.length() != 0) {
      String[] input = temp.split(",");
      int dealId = Integer.valueOf(input[0]);
      int option = Integer.valueOf(input[1]);
      if (dealOptionsMap.get(dealId) == null) {
        Deal deal = new Deal(dealId, option);
        dealOptionsMap.put(dealId, deal);
      }
      else {
        Deal deal = dealOptionsMap.get(dealId);
        deal.addOption(option);
      }
    }
    List<Deal> deals = getDealList(dealOptionsMap);
    for (Deal deal : deals) {
      System.out.println(deal);
    }
  }

  public static List<Deal> getDealList(Map<Integer, Deal> map) {
    List<Deal> dealList = new ArrayList<Deal>();
    dealList.addAll(map.values());
    Collections.sort(dealList, new Comparator<Deal>() {
      public int compare(Deal o1, Deal o2) {
        return o1.getId() - o2.getId();
      }
    });
    return dealList;
  }
}
