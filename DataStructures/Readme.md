Inspiration for Writing Data Structures Code in Scala
https://medium.freecodecamp.org/the-top-data-structures-you-should-know-for-your-next-coding-interview-36af0831f5e3

Commonly used Data Structures

Arrays
Stacks
Queues
Linked Lists
Trees
Graphs
Tries (they are eectively
trees, but it’s still good to call them out
separately).
Hash Tables

07/08/2018 The top data structures you should know for your next coding interview
https://medium.freecodecamp.org/the-top-data-structures-you-should-know-for-your-next-coding-interview-36af0831f5e3 3/14

Arrays
An array is the simplest and most widely used data structure. Other data structures like stacks and queues are derived from arrays.Here’s an image of a simple array of size 4, containing elements 

Insert—Inserts an element at given index
Get—Returns the element at given index
Delete—Deletes an element at given index
Size—Get the total number of elements in array
Commonly asked Array interview questions
Find the second minimum element of an array
First non-repeating integers in an array
Merge two sorted arrays
Rearrange positive and negative values in an array

Stacks
A real-life example of Stack could be a pile of books placed in a vertical order. In order to get the book that’s somewhere in the middle, you will need to remove all the books placed on top of it. This is how the LIFO
(Last In First Out) method works. Here’s an image of stack containing three data elements (1, 2 and 3), where 3 is at the top and will be removed rst:

Basic operations of stack:
Push—Inserts an element at the top
Pop—Returns the top element after removing from the stack
isEmpty—Returns true if the stack is empty
Top—Returns the top element without removing from the stack
Commonly asked Stack interview questions
Evaluate postx
expression using a stack
Sort values in a stack


Queues

Queue implements the FIFO method, which is short for First in First Out. A perfect real-life example of Queue: a line of people waiting at a ticket booth. If a new person comes, they will join the line from the end, not from the start—and the person standing at the front will be the rst to get the ticket and hence leave the line.
Here’s an image of Queue containing four data elements (1, 2, 3 and 4),

Basic operations of Queue
Enqueue()—Inserts element to the end of the queue
Dequeue()—Removes an element from the start of the queue
isEmpty()—Returns true if queue is empty
Top()—Returns the rst
element of the queue
Commonly asked Queue interview questions
Implement stack using a queue
Reverse rst
k elements of a queue
Generate binary numbers from 1 to n using a queue

Linked List
A linked list is like a chain of nodes, where each node contains information like data and a pointer to the succeeding node in the chain. There’s a head pointer, which points to the rst element of the linked list, and if the list is empty then it simply points to null or nothing.

Following are the types of linked lists:
  Singly Linked List (Unidirectional)
  Doubly Linked List (Bi-directional)

Basic operations of Linked List:
InsertAtEnd—Inserts given element at the end of the linked list
InsertAtHead—Inserts given element at the start/head of the
linked list
Delete—Deletes given element from the linked list
DeleteAtHead—Deletes rst
element of the linked list
Search—Returns the given element from a linked list
isEmpty—Returns true if the linked list is empty
Commonly asked Linked List interview questions
Reverse a linked list
Detect loop in a linked list


Graphs
A graph is a set of nodes that are connected to each other in the form of
a network. Nodes are also called vertices. A pair(x,y) is called an edge,
which indicates that vertex x is connected to vertex y. An edge may
contain weight/cost, showing how much cost is required to traverse
from vertex x to y.
  Types of Graphs:
  Undirected Graph
  Directed Graph

In a programming language, graphs can be represented using two forms:
Adjacency Matrix
Adjacency List
Common graph traversing algorithms:
  Breadth First Search
  Depth First Search
  Commonly asked Graph interview questions
  Implement Breadth and Depth First Search

Trees
A tree is a hierarchical data structure consisting of vertices (nodes) and edges that connect them. Trees are similar to graphs, but the key point that dierentiates a tree from the graph is that a cycle cannot exist in a tree.

Trees are extensively used in Articial Intelligence and complex algorithms to provide an ecient storage mechanism for problemsolving.

The following are the types of trees:
  N-ary Tree
  Balanced Tree
  Binary Tree
  Binary Search Tree
  AVL Tree
  Red Black Tree
  2–3 Tree

Trie
Trie, which is also known as “Prex Trees”, is a tree-like data structure which proves to be quite ecient for solving problems related to strings. It provides fast retrieval, and is mostly used for searching words in a dictionary, providing auto suggestions in a search engine, and even for IP routing.

Hash Table
Hashing is a process used to uniquely identify objects and store each object at some pre-calculated unique index called its “key.” So, the bject is stored in the form of a “key-value” pair, and the collection of
such items is called a “dictionary.” Each object can be searched using
that key. There are dierent data structures based on hashing, but the
most commonly used data structure is the hash table.
Hash tables are generally implemented using arrays. The performance of hashing data structure depends upon these three
factors:
Hash Function
Size of the Hash Table
Collision Handling Method
