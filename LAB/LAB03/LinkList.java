
public class LinkList {

	private Link first;

	public LinkList(Link first) {

		this.first = null;
	}

	public boolean isEmpty() {

		return (first == null);

	}

	// - insertFirst()

	public void insertFirst(String name, double avg) {

		Link newLink = new Link(name, avg);
		newLink.next = first;
		first = newLink;

	}

	// - deleteFirst()

	public Link dleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}

	// displayList()
	public void displayList() {
		Link current = first;

		while (current != null) {
			current.displayLink();
			current = current.next;
		}

		System.out.println("");
	}

	// Link deleteLink(String name)

	public Link deleteLink(String name) {

		Link current = first;
		Link previous = first;

		if (current == null) {
			return null;
		}

		while (!current.name.equals(name)) {
			previous = current;
			current = current.next;

			if (current == null) {
				return null;
			}
		}

		if (current == first) {
			first = first.next;
		} else {
			previous.next = current.next;
		}
		return current;

	}

}
