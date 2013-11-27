package com.coupang.WEBPS004.ryan;

import org.junit.Test;


public class ProfitTest {

  @Test
  public void testGetBestProfit() throws Exception {
    InvestTable investTable = new InvestTable(5, 2);
    Profit profit = new Profit(investTable);
    profit.getBestProfit();
    profit.output();
  }

}
