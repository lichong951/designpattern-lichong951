package top.lc951.factory;

public class ExportFinancialHtmlFile implements ExportFile{

	@Override
	public boolean export(String data) {
		// TODO Auto-generated method stub
		System.out.println("导出财务版HTML文件");
		return true;
	}

}
