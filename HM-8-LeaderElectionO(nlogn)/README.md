<h1>What this is about!</h1>

This is an implementation of O(nlogn) algorithm of leader election in an asynchronous ring topology of processors.
This program asks for the number of processors to be created and then creates a ring topology of those processors with id starting from 1 to the number of processors.
Using multi threading with one thread for each processor, then this program runs the leader election algorithm.

<h1>Sample Output:</h1>

Enter number of Processors for the ring topology</br>
4</br>
Printing ring topology</br>
P:1 --> P:2 --> P:3 --> P:4 --> P:1</br>
Leader Elected P:4</br>

