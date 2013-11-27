package com.coupang.WEBPS001.ryan;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;


public class SortingDealAndOptionsTest {

  @Test
  public void testGetDealList() throws Exception {
    Map<Integer, Deal> map = new HashMap<Integer, Deal>();
    map.put(101, new Deal(101, 1));
    map.put(104, new Deal(104, 4));
    map.put(103, new Deal(103, 3));
    List<Deal> deals = SortingDealAndOptions.getDealList(map);
    assertThat(deals.size(), equalTo(map.size()));
    assertThat(deals.get(1).getId(), equalTo(103));
  }

}
