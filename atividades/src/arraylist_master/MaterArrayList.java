package arraylist_master;

import java.util.*;

public class MaterArrayList {
	ArrayList<Integer> vec;

	MaterArrayList() {
		this.vec = new ArrayList<Integer>();
	}

	public String show() {
		String format = "[ ";

		for (Integer elements : vec) {
			format += elements + " ";
		}

		return format += "]";
	}

	public void add(int value) {
		this.vec.add(value);
	}

	public Integer get(int index) {
		return this.vec.get(index);
	}

	public void set(int index, Integer value) {
		this.vec.set(index, value);
	}

	public String rshow() {
		String format = "[ ";

		for (int i = vec.size() - 1; i >= 0; i--) {
			format += vec.get(i) + " ";
		}

		return format + "]";
	}

	public String find(Integer[] values) {
		String format = "[ ";

		for (int i = 0; i < values.length; i++) {
			format += vec.indexOf(values[i]) + " ";
		}
		return format += "]";
	}

	public void ins(int index, Integer value) {
		if (index >= vec.size())
			vec.add(value);

		else if (index >= 0)
			vec.add(index, value);
	}

	public void rmi(int index) {
		if (index < 0 || index >= vec.size()) {
			System.out.println("fail");
		} else {
			vec.remove(index);
		}
	}

	public void rma(Integer value) {
		while (vec.contains(value)) {
			vec.remove(value);
		}
	}
}
