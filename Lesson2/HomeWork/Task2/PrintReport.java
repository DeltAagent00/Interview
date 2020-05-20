import java.util.*;

class PrintReport implements IOutReport{
	public void output(Report item){
		System.out.println("Output to printer");
		for(ReportItem item : item.getReportItems()) {
			System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
		}
	}
}