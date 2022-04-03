#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"
#include "string.h"


typedef struct Matrix {
	int rows, cols;
	double* data;
} Matrix;

Matrix* create_matrix(int rows, int cols, double val) {
	Matrix* m = malloc(sizeof (struct Matrix));
	m->rows = rows;
	m->cols = cols;
	double data[rows][cols];

	for (int row = 0; row < rows; row++) {
		for (int col = 0; col < cols; col++) {
			data[row][col] = val;
		}
	}

	m->data = &data;
	return m;
}

Matrix* zeros(int rows, int cols) {
	return create_matrix(rows, cols, 0.0);
}

Matrix* ones(int rows, int cols) {
	return create_matrix(rows, cols, 1.0);
}

// void insert(double d, int row, int col) {
//
// }

// void print_matrix(Matrix* m) {
// 	for (int row = 0; row < m->rows; row++) {
// 		for (int col = 0; col < m->cols; col++) {
// 			printf("%d", m->data[row*col + col]);
// 		}
// 	}
// }

int main(int argc, char const *argv[]) {
	Matrix* m = zeros(4, 4);
	printf(" m->rows: %i \n", m->rows);
	printf(" m->cols: %i \n", m->cols);
	// printf(" m->data: %i \n", m->data);

	for (int row = 0; row < 4; row++) {
		for (int col = 0; col < 4; col++) {
			double data = *m->data;
			printf(" %d", data[row][col]);
			if (col == 3) printf("\n");
		}
	}
	return 0;
}
