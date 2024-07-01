package work2;
// В данном случае нарушается принцип разделения интерфейсов, поэтому лучше было разделить этот интерфейс на 2 отдельных, чтобы классы,
// которые наследывались от этого интерфейса не нарушали принцип единственной ответственности. Были созданы клссы XmlReportGeneratorImpl и JsonReportGeneratorImpl,
// которые отвечают только за одну свою задачу

public interface ReportGenerator {
    String generateXml();
    String generateJson();
}
