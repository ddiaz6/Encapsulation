/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author HP
 */
public class ReportService {
    private String report = "" ;
    
    public void addToReport(String data){
        report += data + "\n";
    }
    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

}
