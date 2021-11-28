package arraylist_master;

import java.util.*;

public class Solver {

	public static void main(String[] args) {
		MaterArrayList vetor = new MaterArrayList();
		Scanner scan = new Scanner(System.in);

		while (true) {
			String line = scan.nextLine();
			System.out.println("$" + line);
			String ui[] = line.split(" ");
			String cmd = ui[0];

			if (line.equals("end")) {
				break;
			} else if (cmd.equals("show")) {
				System.out.println(vetor.show());
			} else if (cmd.equals("rshow")) {
				System.out.println(vetor.rshow());
			} else if (cmd.equals("add")) {
				for (int i = 1; i < ui.length; i++)
					vetor.add(Integer.parseInt(ui[i]));
			} else if (cmd.equals("find")) {
				Integer[] aux = new Integer[ui.length - 1];
				for (int i = 1; i < ui.length; i++)
					aux[i - 1] = Integer.parseInt(ui[i]);

				System.out.println(vetor.find(aux));
			} else if (cmd.equals("get")) {
				System.out.println(vetor.get(Integer.parseInt(ui[1])));
			} else if (cmd.equals("set")) {
				vetor.set(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
			} else if (cmd.equals("ins")) {
				vetor.ins(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
			} else if (cmd.equals("rmi")) {
				vetor.rmi(Integer.parseInt(ui[1]));
			} else if (cmd.equals("rma")) {
				vetor.rma(Integer.parseInt(ui[1]));
			} else {
				System.out.print("fail: command not found\n");
			}
		}
		scan.close();
	}
}