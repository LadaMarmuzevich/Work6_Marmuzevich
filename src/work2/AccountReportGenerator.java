package work2;
//Принцип разделения интерфейсов
//AccountReportGenerator реализовал generateXml, но он не использовал в этом классе. Поэтому лучше было pазделить интерфейс ReportGenerator на два отдельных интерфейса:
// 1. XmlReportGenerator: Для генерации XML-отчетов.
// 2. JsonReportGenerator: Для генерации JSON-отчетов.
// И в данном случае использовать интерфейс JsonReportGenerator

public class AccountReportGenerator implements JsonReportGenerator {


    @Override
    public String generateJson() {
        String report = "";
        // todo Logic
        return report;
    }
}
