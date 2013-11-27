package com.coupang.WEBPS001.ryan;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class DealTest {

  @Test
  public void testToString() throws Exception {
    Deal deal = new Deal();
    deal.setId(101);
    deal.addOption(7);
    deal.addOption(2);
    deal.addOption(9);
    String print = deal.toString();
    assertThat(print, equalTo("101->2,7,9"));
  }

  @Test
  public void testDealIntInt() throws Exception {
    Deal deal = new Deal(101, 1);
    assertThat(deal.getId(), notNullValue());
    assertThat(deal.getId(), equalTo(101));
    assertThat(deal.getOptions().size(), equalTo(1));
  }

}
