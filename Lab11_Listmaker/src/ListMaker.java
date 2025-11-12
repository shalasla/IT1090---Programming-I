import java.util.ArrayList;

public class ListMaker {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean done = false;

        while (!done) {
            displayList(list);
            String cmd = SafeInput.getRegExString("Enter command [A,D,I,P,Q]:", "[AaDdIiPpQq]");

            switch (cmd.toUpperCase()) {
                case "A":
                    addItem(list);
                    break;
                case "D":
                    deleteItem(list);
                    break;
                case "I":
                    insertItem(list);
                    break;
                case "P":
                    printList(list);
                    break;
                case "Q":
                    if (SafeInput.getYNConfirm("Are you sure you want to quit?")) {
                        done = true;
                    }
                    break;
            }
        }
    }

    private static void displayList(ArrayList<String> list) {
        System.out.println("\nCurrent List:");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, list.get(i));
        }
        System.out.println("\nMenu: [A]dd [D]elete [I]nsert [P]rint [Q]uit");
    }

    private static void addItem(ArrayList<String> list) {
        String item = SafeInput.getNonZeroLenString("Enter item to add:");
        list.add(item);
    }

    private static void deleteItem(ArrayList<String> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        int index = SafeInput.getRangedInt("Enter item number to delete:", 1, list.size()) - 1;
        list.remove(index);
    }

    private static void insertItem(ArrayList<String> list) {
        int index = SafeInput.getRangedInt("Enter position to insert:", 1, list.size() + 1) - 1;
        String item = SafeInput.getNonZeroLenString("Enter item to insert:");
        list.add(index, item);
    }

    private static void printList(ArrayList<String> list) {
        System.out.println("\nList Contents:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
