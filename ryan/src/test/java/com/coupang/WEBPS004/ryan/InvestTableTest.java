package com.coupang.WEBPS004.ryan;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class InvestTableTest {

  @Test
  public void testMakeRandomTable() throws Exception {
    InvestTable tableGen = new InvestTable(10, 2);
    tableGen.makeRandomTable();
    int[][] table = tableGen.getTable();
    assertThat(table.length, equalTo(2));
    assertTrue(table[0][9] >= 10);
  }

  @Test
  public void testGetProfit() throws Exception {
    int invest = 20;
    InvestTable table = new InvestTable();
    for (int i = 1; i <= invest; i++) {
      int profit = table.getProfit(i);
      //System.out.println(i + ","+profit);
      assertTrue(profit >= i);
    }
  }

  @Test
  public void testPrintTable() throws Exception {
    InvestTable tableGen = new InvestTable(5, 3);
    tableGen.makeRandomTable();
    tableGen.printTable();
  }

}
