package top.lc951.factory;

public class ExportFinancialPdfFile implements ExportFile {

	@Override
	public boolean export(String data) {
		// TODO Auto-generated method stub
		System.out.println("导出财务版PDF文件");
		return true;
	}

}
