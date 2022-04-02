#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"
#include "string.h"


typdef struct Matrix {
	int rows, cols;
	double data[rows*cols];
} Matrix;

Matrix* create_matrix(int rows, int cols) {
	Matrix m = malloc(sizeof Matrix);
	m->rows = rows;
	m->cols = cols;

	for (int row = 0; row < rows; row++) {
		for (int col = 0; col < cols; col++) {
			m->data[row * cols + col] = 0.0;
		}
	}

	return m;
}
