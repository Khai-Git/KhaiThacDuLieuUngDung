package Cluster;

import weka.core.Instances;

public class TestClusteringModel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ClusteringModel cluster=new ClusteringModel();
		Instances data=cluster.loadData("C:\\Program Files\\Weka-3-8-6\\data\\weather.nominal.arff");
		cluster.build_Cluster_KMeans(data,4,true);
		System.out.println(cluster.output_KMeans());
		cluster.predict_cluster_Lable(data);
		System.out.println(cluster.output_KMeans());
	}
}