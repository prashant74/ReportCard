package com.example.prashant.reportcard;

/**
 * Created by prashant on 6/24/16.
 */
public class ReportCard {

  private int aggregateMarks;
  private int marksPercentageScored;
  private int scienceMarks;
  private int englishMarks;
  private int historyMarks;

  public ReportCard(int aggregateMarks, int marksPercentageScored, int scienceMarks,
      int englishMarks, int historyMarks) {
    this.aggregateMarks = aggregateMarks;
    this.marksPercentageScored = marksPercentageScored;
    this.scienceMarks = scienceMarks;
    this.englishMarks = englishMarks;
    this.historyMarks = historyMarks;
  }

  public int getAggregateMarks() {
    return aggregateMarks;
  }

  public void setAggregateMarks(int aggregateMarks) {
    this.aggregateMarks = aggregateMarks;
  }

  public int getMarksPercentageScored() {
    return marksPercentageScored;
  }

  public void setMarksPercentageScored(int marksPercentageScored) {
    this.marksPercentageScored = marksPercentageScored;
  }

  public int getScienceMarks() {
    return scienceMarks;
  }

  public void setScienceMarks(int scienceMarks) {
    this.scienceMarks = scienceMarks;
  }

  public int getEnglishMarks() {
    return englishMarks;
  }

  public void setEnglishMarks(int englishMarks) {
    this.englishMarks = englishMarks;
  }

  public int getHistoryMarks() {
    return historyMarks;
  }

  public void setHistoryMarks(int historyMarks) {
    this.historyMarks = historyMarks;
  }

  @Override public String toString() {
    return "ReportCard {" +
        "Aggregate Marks=" + aggregateMarks +
        ", Marks Percentage Scored=" + marksPercentageScored +
        ", Science Marks=" + scienceMarks +
        ", English Marks=" + englishMarks +
        ", History Marks=" + historyMarks +
        '}';
  }
}
