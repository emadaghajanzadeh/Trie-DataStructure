# Trie Tree

## Description
This project was given during the data structure course, and its aim was to implement the trie tree efficiently and in an object-oriented manner.

### What is Trie Tree?
Strings are one of the most fundamental data types and have a usage in many various applications. There are many data structures to properly store strings as well. One of these data structures is the Trie tree. Tries store strings based on their prefix in a tree-based manner. Each node represents a letter in English and so there can be at most 26 edges between two nodes. Below you can see how string retrieval can be done using Tries.

<img src="pic.PNG" width="50%">


### Application
The fact that Tries work with string prefixes making them a sufficient choice for applications in which there are multiple strings and queries based on their prefix.


## Implementation
To implement this data structure, I first defined a node class that contains all the attributes and functions related to each node. Then, a Trie Tree class is defined to manage the essential operations such as inserting, deleting, etc. Finally, my implementation was capable of storing and retrieving about 200 words in a reasonable time, less than 2 seconds.

## Refrences

https://www.toptal.com/java/the-trie-a-neglected-data-structure

https://www.aleksandrhovhannisyan.com/blog/trie-data-structure-implementation-in-python/

