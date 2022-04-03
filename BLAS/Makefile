
CC=gcc
CFLAGS=-g -Wall
BINS=matrix

all: $(BINS)

%: %.c
	$(CC) $(CFLAGS) $^ -o $@

clean:
	$(RM) -r $(BINS) *.dSYM
