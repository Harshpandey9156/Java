#include <stdio.h>

 

int josephus(int n, int k) {

    if (n == 1) {

        return 0;

    } else {

        return (josephus(n - 1, k) + k) % n;

    }

}


 

int find_the_winner(int n, int k) {

    // Adjust for 1-based indexing

    return josephus(n, k) + 1;

}

 

int main() {

    int n = 5; // Number of friends

    int k = 2; // Step count

    int winner = find_the_winner(n, k);

    printf("The winner is friend number %d\n", winner);

    return 0;

}