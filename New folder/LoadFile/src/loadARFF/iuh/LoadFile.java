package loadARFF.iuh;

import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class LoadFile {
	DataSource dataSource;
	Instances instances;
	
	public void load(String fileName) throws Exception {
		dataSource = new DataSource(fileName);
		instances = dataSource.getDataSet();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return instances.toSummaryString();
	}
}
