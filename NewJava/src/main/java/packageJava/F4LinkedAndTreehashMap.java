package packageJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class F4LinkedAndTreehashMap {

	public static void main(String[] args) {
		LinkedHashMap<String,String> heros= new LinkedHashMap<String,String>();
		heros.put("Ironman","TonyStark");
		heros.put("Batman","BruceWayne");
		heros.put("SuperMan","Clark");
		//null allowed, as just insertion is maintained, no comparison required
		heros.put(null,"Clark");
		//value is override for null key
		heros.put(null,"ben");
		System.out.println(heros);
		
		HashMap<String,String> superheros= new HashMap<String,String>();
		superheros.put("Ironman","TonyStark");
		superheros.put("Batman","BruceWayne");
		superheros.put("SuperMan","Clark");
		//null allowed, no comparison required
		superheros.put(null,"Clark");
		//value is override for null key
		superheros.put(null,"benhashmap");
		System.out.println(superheros);
		
		TreeMap<String,String> treemap= new TreeMap<String,String>();
		treemap.put("Antman","Not sure");
		treemap.put("Ironman","TonyStark");
		treemap.put("Batman","BruceWayne");
		treemap.put("SuperMan","Clark");
		treemap.put("CaptainAmerica","Not sure");
		treemap.put("CaptainAmerica","Captain");
		//null pointer exception, null not allowed as comparison is required for sorting
		treemap.put(null,"Captain");
		System.out.println("TreeMap:"+treemap);

	}

}
