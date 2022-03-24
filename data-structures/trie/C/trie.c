#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"
#include "string.h"


#define NUM_CHARS 256

typedef struct trie_node {
	struct trie_node* children[NUM_CHARS];
	bool terminal;
} trie_node;

trie_node* create_node() {
	trie_node* new_node = malloc(sizeof new_node);

	for (int i = 0; i < NUM_CHARS; i++) {
		new_node->children[i] = NULL;
	}
	new_node-> terminal = false;
	return new_node;
}

bool insert_string(trie_node** root, char* signed_text) {
	if (*root == NULL) {
		*root = create_node();
	}

	unsigned char* text = (unsigned char*)signed_text;
	trie_node* temp = *root;
	int len = strlen(signed_text);

	for (int i = 0; i < len; i++) {
		if (temp->children[text[i]] == NULL) {
			temp->children[text[i]] = create_node();
		}
		temp = temp->children[text[i]];
	}

	if (temp->terminal) {
		return false;
	} else {
		temp->terminal = true;
		return true;
	}
}

void print_trie_recursive(trie_node* node, unsigned char* prefix, int len) {
	unsigned char new_prefix[len + 2];
	memcpy(new_prefix, prefix, len);
	new_prefix[len + 1] = 0;

	if (node->terminal) {
		printf(" STRING: %s\n", prefix);
	}

	for (int i = 0; i < NUM_CHARS; i++) {
		if (node->children[i] != NULL) {
			new_prefix[len] = i;
			print_trie_recursive(node->children[i], new_prefix, len+1);
		}
	}
}

void print_trie(trie_node* root) {
	if (root == NULL) {
		printf(" TRIE EMPTY\n");
		return;
	}
	print_trie_recursive(root, NULL, 0);
}


int main(int argc, char const *argv[]) {
	trie_node* root = NULL;

	insert_string(&root, "KIT");
	insert_string(&root, "CATTLE");
	insert_string(&root, "KIN");
	insert_string(&root, "CAT");
	insert_string(&root, "HAPPY");

	print_trie(root);

	return 0;
}
