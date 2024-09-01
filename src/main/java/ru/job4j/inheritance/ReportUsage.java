package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport textReport = new TextReport();
        String text = textReport.generate("Report's name", "Report's body");
        System.out.println(text);
        System.out.println();
        HtmlReport htmlReport = new HtmlReport();
        text = htmlReport.generate("Report's name", "Report's body");
        System.out.println(text);
        System.out.println();
        JSONReport jsonReport = new JSONReport();
        text = jsonReport.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
