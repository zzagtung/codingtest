package com.coupang.WEBPS004.ryan;

/**
 * The Profit class.<br/>
 * 투자대비이익표에 의거 최고 이익을 가져올수 있는 투자기업을 선정하는 클래스.
 * 
 * @author Ryan
 */
public class Profit {

  private int invest;
  private int corp;
  private int[][] investTable;
  private int[][] bestProfitTable;
  private int[][] temp;
  
  public Profit() {}
  
  public Profit(InvestTable investTable) {
    this.invest = investTable.getInvest();
    this.corp = investTable.getCorp();
    this.investTable = investTable.getTable();
    bestProfitTable = new int[corp][invest];
    temp = new int[corp][invest];
    temp[0][0] = 0;
  }
  
  /**
   * 최고 이익을 주는 투자금액과 기업.
   */
  public void getBestProfit() {
    process();
  }
  
  public void process() {
    for (int i = 1; i <= invest; i++) {
      for (int j = 0; j < corp; j++) {
        for (int k = 0; k <= j; k++)
          if (temp[j - k][i - 1] + investTable[k][i] > temp[j][i]) {
            temp[j][i] = temp[j - k][i - 1] + investTable[k][i];
            bestProfitTable[j][i] = k;
          }
      }
    }
  }
  
  public void output() {
    int i, j;
    int[] g = new int[21];
    j = corp;
    for (i = invest; i >= 1; i--) {
      g[i] = bestProfitTable[j][i];
      j -= g[i];
    }
    for (i = 1; i <= invest; i++)
      System.out.println(g[i]);
  }
}
