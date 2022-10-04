package collection.mapexam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		//Map 컬렉션은 키(key)와 값(Value)로 구성된 Entry객체로 저장
		//키는 중복 저장할 수 없다(ex:아이디), 값은 중복 저장할 수 있다.(ex:비밀번호)
		//기존에 저장된 키와 동일한 키로 값을 저장하면 기존 값은 없어지고 새로운 값으로 대치
		//
		//put(key, value) :주어진 키와 값을 추가, 저장
		//containsKey(key) : 주어진 키가 있는 지 여부
		//containValue(key) : 주어진 값이 있는지 여부
		
		//Set<Map.Entry<K,V>> entrySet() : 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를
		//							Set에 담아서 리턴
		//get(key) : 주어진 키 값을 리턴
		//Set<K> keySet() : 모든 키를 Set 객체에 담아서 리턴
		//size() : 저장된 키의 총 수를 리턴
		//getKey() : 키에 해당하는 자료 얻어오기
		//setKey() : 값에 해당하는 자료 가져오기
		
		//예제) 이름을 키 , 점수를 값으로 저장
		
		Map<String, Integer> map = new HashMap<String, Integer>();
//		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		
		map.put("홍길동", 90); // 저장,추가
		map.put("김자바", 95);
		map.put("이하늘", 60);
		map.put("최자바", 85);
		map.put("홍길동", 50);
		System.out.println();
		
		//Entry 개수 확인 : size()
		System.out.println("Entry 수: "+ map.size()); //key값이 중복돼서 중복된 마지막 key의 Entry가 저장
		System.out.println();
		
		System.out.println(map);
		
		//키로 값을 얻기
		String key = "홍길동";
		int value = map.get(key);//key를 매개값으로 주면 값을 리턴해준다.
		System.out.println(key+ ":" +value);
		System.out.println();
		
		System.out.println(map.get("김자바"));
		System.out.println(map.get("최자바"));
		System.out.println();
		
		//키에 해당하는 Set 컬렉션을 얻고, 반복해서 키와 값을 가져오기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {	//hasNext() : 가져올 값이 있으면 true, 없으면 false
			String k = keyIter.next();
			Integer v = map.get(k);
			System.out.println(k+":"+ v);
		}
		System.out.println();
		
		//최고점수, 최저점수, 평균 점수
		String name = ""; //최고점수 받은 사람의 이름을 저장
		int maxScore = 0; //최고 점수
		int totalScore = 0; // 점수들의 총합
		double avg = 0.0; //점수들의 평균
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for(Map.Entry<String,Integer> entry : entrySet) {
			if(entry.getValue() >maxScore) {
				maxScore = entry.getValue();
				name = entry.getKey();
				
			}
			totalScore +=entry.getValue();
		}
		avg =(double)totalScore / map.size();
		
		System.out.println("최고점수 받은 사람:" +name);
		System.out.println("최고점수:" +maxScore);
		System.out.println("평균점수:" +avg);
	}

}
