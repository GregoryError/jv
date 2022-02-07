package lamb;

interface MyFunc<T> {
	boolean func(T v1, T v2);
}

class HighTemp {
	private int hTemp;
	HighTemp(int ht) { hTemp = ht; }
	
	boolean sameTemp(HighTemp ht2) { // видимо при передаче такой функции в параметр типа интерфейса 'MyFunc', первый аргумент это неявное this
		return hTemp == ht2.hTemp;
	}
	
	boolean lessThanTemp(HighTemp ht2) {
		return hTemp < ht2.hTemp;
	}
}


class lamMain {
	static <T> int counter (T[] vals, MyFunc<T> f, T v) {
		int count = 0;
		
		for (int i = 0; i < vals.length; ++i) 
			if (f.func(vals[i], v)) 
				count++;
			
		return count;
	}


	public static void main(String[] arg) {
		int count;
		HighTemp weekDaysHighs[] = {
			new HighTemp(89), new HighTemp(82),
			new HighTemp(90), new HighTemp(89),
			new HighTemp(89), new HighTemp(91),
			new HighTemp(84), new HighTemp(83)
		};
		
		count = counter(weekDaysHighs, HighTemp::sameTemp, new HighTemp(89));
		
		System.out.println(count);
		
	}
}