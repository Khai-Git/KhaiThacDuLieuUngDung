package Cluster;

import weka.clusterers.HierarchicalClusterer;
import weka.clusterers.SimpleKMeans;
import weka.core.EuclideanDistance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.ManhattanDistance;
import weka.core.converters.ConverterUtils.DataSource;

public class ClusteringModel {
	DataSource source;
	SimpleKMeans kmeans;
	HierarchicalClusterer agnes;
	
	public Instances loadData(String filename) throws Exception
	{
		source=new DataSource(filename);
		return source.getDataSet();
		
	}
	public void build_Cluster_KMeans(Instances data, int num, boolean isManhattan) throws Exception
	{
		kmeans=new SimpleKMeans();
		kmeans.setNumClusters(num);
		if(isManhattan)
			kmeans.setDistanceFunction(new ManhattanDistance());
		else
			kmeans.setDistanceFunction(new EuclideanDistance());
		kmeans.buildClusterer(data);
	}
	public void predict_cluster_Lable(Instances data) throws Exception
	{
		for(Instance inst : data)
		{
			int num=kmeans.clusterInstance(inst);
			System.out.println(inst.toString() +" thuoc cum " +num);
		}
	}
	public String output_KMeans()
	{
		return kmeans.toString();
	}

}
