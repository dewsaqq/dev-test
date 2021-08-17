# DEV-TEST

## Task1
Class to output sorted list of distinct integers. It transforms `List` of integers to set, which is distinct by definition. It also uses `TreeSet` collection which is already sorted and has satisfactory time complexity of `O(logn)` for its all operations.

## Task2
Class for finding pairs that sum up to 13. It sorts integer list and then checks if sum of next two elements is 13. The algorithm finishes when first number is greater than 13 and breaks inner loop when sum is greater than 13, because in sorted list every further element will be greater and there is no need of more checking.

## Task3
Class representing undirected graph. It uses adjacency list representation of graph with `HashMap` and `LinkedList` implementation. To determine number of graphs built with its vertices it uses `Depth First Search` algorithm. It also implements class that represents `Node` of graph which checks whether its value is positive or not and throws exception in second case. It implements basic visitation methods and simple singletons for each node for clarity of testing, might be subject to change.