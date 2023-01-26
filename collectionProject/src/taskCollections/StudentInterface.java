package taskCollections;

import java.util.Map;

@FunctionalInterface
public interface StudentInterface {
	
	void getStaticDetails(Map<Integer,StudentDTO> m1);
	
	default void getNonStaticMap(Map<Integer,StudentDTO> m1) {}
	

}
