
CC=gcc
CFLAGS=-g -Wall
BINS=trie

all: $(BINS)

%: %.c
	$(CC) $(CFLAGS) $^ -o $@

clean:
	$(RM) -r $(BINS) *.dSYM
