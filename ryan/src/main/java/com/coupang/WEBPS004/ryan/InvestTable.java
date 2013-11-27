package com.coupang.WEBPS004.ryan;

/**
 * The InvestTable class.<br/>
 * 기업별 투자금액 대비 이익표를 생성하는 클래스.
 */
public class InvestTable {

  // 투자금액대비이익표
  private int[][] table;
  private int invest;
  private int corp;
  
  public InvestTable() {}
  public InvestTable(int invest, int corp) {
    this.invest = invest;
    this.corp = corp;
    table = new int[corp][invest];
    makeRandomTable();
  }
  
  /**
   * 랜덤 하게 투자금액대비 이익표를 생성.
   */
  public void makeRandomTable() {
    for (int i = 0; i < invest; i++) {
      for (int j = 0; j < corp; j++) {
        table[j][i] = getProfit(i+1);
      }
    }
  }
  
  /**
   * 투자이익금<br/>
   * <pre>
   * 조건.
   * 1. 투자금보다 이익금이 더 작을 수는 없음.
   * 2. 이익금은 투자금의 5배까지 가능 함.
   * (투자금 <= 이익금 <= 투자금*5)
   * </pre>
   *  
   * @param invest
   * @return
   */
  public int getProfit(int invest) {
    int profit = (int) Math.floor(Math.random() * invest * 5);
    while (profit < invest) {
      profit = (int) Math.floor(Math.random() * invest * 5);
    }
    return profit;
  }
  
  public int[][] getTable() {
    return table;
  }
  
  public void printTable() {
    for (int i = 0; i < invest; i++) {
      StringBuffer sb = new StringBuffer();
      sb.append(i+1);
      for (int j = 0; j < corp; j++) {
        sb.append(" ").append(table[j][i]);
      }
      System.out.println(sb);
    }
  }
  public int getInvest() {
    return invest;
  }
  public int getCorp() {
    return corp;
  }
}
