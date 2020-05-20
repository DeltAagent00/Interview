class Programm{
	public static void main(String[] args){
		final IOutReport outReport = new PrintReport();
		final Report report = new Report();
		report.calculate();

		outReport.output(report);
	}
}