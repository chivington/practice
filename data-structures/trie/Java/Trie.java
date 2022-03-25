
// Trie node
class Node {
	public Node[] children;	// nodes keep list of children
	public boolean terminal;	// true if node is end of word

	Node(int letters) {
		Node[] children = new Node[letters];
		for (int i = 0; i < letters; i++) children[i] = null;	// initialize list of null children

		terminal = false;										// initialize terminal to false
		this.children = children;								// set node's children to null list
	}
};

// Trie data structure
class Trie {
    private final int LETTERS = 26;	// number of letters in language; English
    private Node root;				// root node in Trie

	Trie() {
		root = new Node(LETTERS);	// create root node
	}

    // if word not in Trie, insert word
    // if word is prefix of another word, set terminal node to true
    public void insert(String word) {
        Node temp = root;

		// traverse word
        for (int letter = 0; letter < word.length(); letter++) {
            int i = word.charAt(letter) - 'a';	// select letter index
            if (temp.children[i] == null)		// if node is null, create new node
				temp.children[i] = new Node(LETTERS);
            temp = temp.children[i];			// set temp to this node
        }

        temp.terminal = true;					// mark last node as terminal
    }

    // true if word is in Trie, else false
    public boolean search(String word) {
        Node temp = root;

        for (int letter = 0; letter < word.length(); letter++) {
            int i = word.charAt(letter) - 'a';	// select letter index
            if (temp.children[i] == null)		// if node is null, return false (not in Trie)
                return false;
            temp = temp.children[i];			// set temp to this node
        }

        return temp.terminal;					// return true (is in Trie)
    }

    // test Trie
    public static void main(String args[]) {
        // known words
        String kw[] = {"the", "a", "there", "alligator", "by", "ally", "bye"};

		// unknown words
        String uw[] = {"therapy", "alphabet", "lullaby", "random", "fly", "dam", "car"};

		// create Trie
        Trie t = new Trie();

        // insert kw
        for (int word = 0; word < kw.length ; word++) t.insert(kw[word]);

        // search for words
		for (int i = 0; i < kw.length; i++) {
			// known words
			if (t.search(kw[i])) System.out.println(" " + String.format("%10s", kw[i]) + " - IS in Trie.");
	        else System.out.println(" " + String.format("%10s", kw[i]) + " - NOT in Trie.");

			// unknown words
			if (t.search(uw[i])) System.out.println(" " + String.format("%10s", uw[i]) + " - IS in Trie.");
	        else System.out.println(" " + String.format("%10s", uw[i]) + " - NOT in Trie.");
		}
    }
}
