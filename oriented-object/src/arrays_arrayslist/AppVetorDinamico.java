package arrays_arrayslist;

public class AppVetorDinamico {
	public static void main(String[] args) {
		VetorDinamico vetor = new VetorDinamico(2);
		VetorDinamico vetor2 = new VetorDinamico(2);

		for (int i = 0; i < 20; i++) {
			int value = (int) Math.floor(Math.random() * 10);

			vetor.add(value);
			vetor2.add(value);
		}

		System.out.println(vetor);
		System.out.println(vetor.capacity());
		System.out.println(vetor.size());
		System.out.println(vetor.equals(vetor2));
	}

}
