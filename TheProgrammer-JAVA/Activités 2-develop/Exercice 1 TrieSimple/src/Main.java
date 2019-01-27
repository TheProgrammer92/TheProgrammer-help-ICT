
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TriSimple trie = new TriSimple();
		
		
		
		trie.inserer(1);
		trie.inserer(2);
		trie.inserer(3);
		trie.inserer(4);
		trie.inserer(6);
		trie.inserer(5);
		trie.inserer(8);
		trie.inserer(7);
		
		trie.retirer(4);
		
		
		trie.inserer(15);
		trie.inserer(12);
	}

}
